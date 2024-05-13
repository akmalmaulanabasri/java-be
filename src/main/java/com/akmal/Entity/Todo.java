package com.akmal.Entity;

public class Todo {

    private String date;
    private String task;

    public Todo() {
    }

    public Todo(String date, String task) {
        this.date = date;
        this.task = task;
    }

    public String getDate() {
        return date;
    }

    public String getTask() {
        return task;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTask(String task) {
        this.task = task;
    }

}
