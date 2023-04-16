package com.Project.TecnoWear.Domain.models;

import java.time.LocalTime;

public class Task {

    private long id;
    private String tittle;
    private String description;

    private LocalTime creationDate;

    private boolean completed;


    public Task(long id, String tittle, String description, LocalTime creationDate, boolean completed){
      this.id=id;
      this.tittle=tittle;
      this.description=description;
      this.creationDate=creationDate;
      this.completed=completed;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
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
