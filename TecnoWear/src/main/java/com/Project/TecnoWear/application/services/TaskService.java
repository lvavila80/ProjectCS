package com.Project.TecnoWear.application.services;


import com.Project.TecnoWear.Domain.models.AdditionalTaskInfo;
import com.Project.TecnoWear.Domain.models.Task;
import com.Project.TecnoWear.Domain.ports.in.*;

import java.util.List;
import java.util.Optional;

public class TaskService implements CreateTaskUseCase, RetrieveTaskUseCase, UpdateTaskUseCase, DeleteTaskUseCase, GetAdditionalTaskInfoUseCase {

private final CreateTaskUseCase createTaskUseCase;
private final RetrieveTaskUseCase retrieveTaskUseCase;
private final UpdateTaskUseCase updateTaskUseCase;
private final DeleteTaskUseCase deleteTaskUseCase;
private final GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase;

    public TaskService(CreateTaskUseCase createTaskUseCase, RetrieveTaskUseCase retrieveTaskUseCase, UpdateTaskUseCase updateTaskUseCase, DeleteTaskUseCase deleteTaskUseCase, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        this.createTaskUseCase = createTaskUseCase;
        this.retrieveTaskUseCase = retrieveTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.getAdditionalTaskInfoUseCase = getAdditionalTaskInfoUseCase;
    }


    @Override
    public Task createTask(Task task) {
        return createTaskUseCase.createTask(task);
    }

    @Override
    public boolean deleteTask(long Id) {
        return deleteTaskUseCase.deleteTask(Id);
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long Id) {
        return getAdditionalTaskInfoUseCase.getAdditionalTaskInfo(Id);
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return retrieveTaskUseCase.getTask(id);
    }

    @Override
    public List<Task> getAllTask() {
        return retrieveTaskUseCase.getAllTask();
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return updateTaskUseCase.updateTask(id, updateTask);
    }
}
