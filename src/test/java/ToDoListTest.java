import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {
    private ToDoList toDoList;

    @BeforeEach
    void setUp() {
        toDoList = new ToDoList();
    }

    @Test
    void addTask() {
        toDoList.addTask("Задача 1");
        assertEquals(1, toDoList.getTasks().size());
        assertTrue(toDoList.getTasks().contains("Задача 1"));


        toDoList.addTask("Задача 1");
        assertEquals(1, toDoList.getTasks().size());
    }

    @Test
    void showTasks() {
        toDoList.addTask("Задача 1");
        assertEquals(1, toDoList.getTasks().size());
    }

    @Test
    void deleteTaskByNumber() {
        toDoList.addTask("Задача 1");
        toDoList.addTask("Задача 2");


        toDoList.deleteTaskByNumber(1);
        assertEquals(1, toDoList.getTasks().size());


        toDoList.deleteTaskByNumber(5);
    }
}