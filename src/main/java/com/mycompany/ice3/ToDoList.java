/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author archit
 */
public class ToDoList {
     private List<ICE3> tasks = new ArrayList<>();

    public void addTask(String title) {
        tasks.add(new ICE3(title));
    }

    public List<ICE3> getTasks() {
        return tasks;
    }

    public void markTaskCompleted(int index) {
        tasks.get(index).markCompleted();
    }

    public void deleteTask(int index) {
        tasks.remove(index);
    }
}
