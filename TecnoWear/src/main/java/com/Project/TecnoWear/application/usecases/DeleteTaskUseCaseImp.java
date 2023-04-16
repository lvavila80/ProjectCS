package com.Project.TecnoWear.application.usecases;

import com.Project.TecnoWear.Domain.ports.in.DeleteTaskUseCase;
import com.Project.TecnoWear.Domain.ports.out.TaskRepositoryPort;

public class DeleteTaskUseCaseImp implements DeleteTaskUseCase
{
    private final TaskRepositoryPort taskRepositoryPort;

    public DeleteTaskUseCaseImp(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteTask(long Id) {
        return taskRepositoryPort.deleteById(Id);
    }
}
