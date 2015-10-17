package com.example.win7.androidparsetodolist.model;

/**
 * Created by Win7 on 10/17/2015.
 */
public class Task {

    public String taskId;
    public String name;
    public String description;

    public Task(String taskId, String name, String description) {
        this.taskId = taskId;
        this.name = name;
        this.description = description;
    }

    public Task(){
        this.taskId = "";
        this.name = "";
        this.description = "";
    }

    public void setTaskId(String taskId){
        this.taskId = taskId;
    }

    public String getTaskId(){
        return taskId;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}