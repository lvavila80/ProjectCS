package com.Project.TecnoWear.infrastructure.repositories;

import com.Project.TecnoWear.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTaskRepository extends JpaRepository <TaskEntity,Long>{
}
