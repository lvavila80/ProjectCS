package com.Project.TecnoWear.application.usecases;

import com.Project.TecnoWear.Domain.models.Task;
import com.Project.TecnoWear.Domain.ports.in.UpdateTaskUseCase;
import com.Project.TecnoWear.Domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImp implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImp(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }
}
