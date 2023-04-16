package com.Project.TecnoWear.infrastructure.entities;


import com.Project.TecnoWear.Domain.models.Task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;

@Entity
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalTime creationDate;

    private boolean completed;

    public TaskEntity(){
    }
    public TaskEntity(Long id, String title,String description, LocalTime creationDate, boolean completed){
        this.id=id;
        this.title=title;
        this.description=description;
        this.creationDate=creationDate;
        this.completed=completed;
    }

    public static TaskEntity fromDomainModel(Task task){
        return new TaskEntity(task.getId(), task.getTittle(),task.getDescription(),task.getCreationDate(),task.isCompleted());
    }

    public Task toDomainModel(){
       return new Task(id,title, description, creationDate,  completed);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalTime creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
