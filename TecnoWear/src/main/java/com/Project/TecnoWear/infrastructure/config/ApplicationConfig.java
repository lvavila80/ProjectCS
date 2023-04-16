package com.Project.TecnoWear.infrastructure.config;

import com.Project.TecnoWear.Domain.ports.in.CreateTaskUseCase;
import com.Project.TecnoWear.Domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.Project.TecnoWear.Domain.ports.out.ExternalServicePort;
import com.Project.TecnoWear.Domain.ports.out.TaskRepositoryPort;
import com.Project.TecnoWear.application.services.TaskService;
import com.Project.TecnoWear.application.usecases.*;
import com.Project.TecnoWear.infrastructure.adapters.ExternalServiceAdapter;
import com.Project.TecnoWear.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        return new TaskService(
                new CreateTaskUseCaseImp(taskRepositoryPort),
                new RetrieveTaskUseCaseImp(taskRepositoryPort),
                new UpdateTaskUseCaseImp(taskRepositoryPort),
                new DeleteTaskUseCaseImp(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
        );
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter){
    return  jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort){
        return new GetAdditionalTaskUseCaseImp(externalServicePort);

    }
    @Bean
    public ExternalServicePort externalServicePort(){
        return new ExternalServiceAdapter();
    }
}
