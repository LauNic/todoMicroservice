package com.niculescu.todoMicroservice.todo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;
    private String description;
    private Date targetDate;
    private boolean isDone;

    protected Todo() {

    }

    public Todo(Long id, String userName, String description, Date targetDate, boolean isDone) {
        super();
        this.id = id;
        this.userName = userName;
        this.description = description;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", isDone=" + isDone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return isDone == todo.isDone && Objects.equals(id, todo.id) && Objects.equals(userName, todo.userName) && Objects.equals(description, todo.description) && Objects.equals(targetDate, todo.targetDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, description, targetDate, isDone);
    }
}
