package com.Project.TecnoWear.Domain.ports.in;

import com.Project.TecnoWear.Domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional <Task> getTask(Long id);
    List<Task>getAllTask();

}
