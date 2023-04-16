package com.Project.TecnoWear.application.usecases;

import com.Project.TecnoWear.Domain.models.Task;
import com.Project.TecnoWear.Domain.ports.in.RetrieveTaskUseCase;
import com.Project.TecnoWear.Domain.ports.out.TaskRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveTaskUseCaseImp implements RetrieveTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public RetrieveTaskUseCaseImp(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> getAllTask() {
        return taskRepositoryPort.findAll();
    }
}
