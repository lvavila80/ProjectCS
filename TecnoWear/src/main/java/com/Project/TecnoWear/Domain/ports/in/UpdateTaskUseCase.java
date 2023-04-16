package com.Project.TecnoWear.Domain.ports.in;

import com.Project.TecnoWear.Domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task>updateTask(Long id, Task updateTask);

}
