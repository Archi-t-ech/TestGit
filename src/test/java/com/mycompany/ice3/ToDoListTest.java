/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ice3;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author archit
 */
public class ToDoListTest {
    @Test
    public void testAddTask() {
        ToDoList todoList = new ToDoList();
        todoList.addTask("Complete Lab Assignment");

        List<ICE3> tasks = todoList.getTasks();
        assertEquals(1, tasks.size());
        assertEquals("Complete Lab Assignment", tasks.get(0).getTitle());
        assertFalse(tasks.get(0).isCompleted());
    }
    @Test
public void testMarkTaskCompleted() {
    ToDoList todoList = new ToDoList();
    todoList.addTask("Study for Exam");

    todoList.markTaskCompleted(0);

    assertTrue(todoList.getTasks().get(0).isCompleted());
}
@Test
public void testDeleteTask() {
    ToDoList todoList = new ToDoList();
    todoList.addTask("Task 1");
    todoList.addTask("Task 2");

    todoList.deleteTask(0);

    assertEquals(1, todoList.getTasks().size());
    assertEquals("Task 2", todoList.getTasks().get(0).getTitle());
}

    
}
