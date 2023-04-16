package com.Project.TecnoWear.Domain.ports.in;

import com.Project.TecnoWear.Domain.models.Task;

public interface CreateTaskUseCase {
    Task createTask (Task task);

}
