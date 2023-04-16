package com.Project.TecnoWear.Domain.ports.out;

import com.Project.TecnoWear.Domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {
    Task sava(Task);
    Optional<Task>findById(Long id);
    List<Task> findAll();
    Optional<Task> update(Task task);
    boolean deleteById(Long id);


}