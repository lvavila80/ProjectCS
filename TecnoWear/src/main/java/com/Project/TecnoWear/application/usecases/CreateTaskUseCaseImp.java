package com.Project.TecnoWear.application.usecases;

import com.Project.TecnoWear.Domain.models.Task;
import com.Project.TecnoWear.Domain.ports.in.CreateTaskUseCase;
import com.Project.TecnoWear.Domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImp implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;


    public CreateTaskUseCaseImp(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
