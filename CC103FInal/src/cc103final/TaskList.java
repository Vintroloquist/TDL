/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cc103final;
import java.util.ArrayList;
/**
 *
 * @author lucil
 */
public class TaskList {
    private static ArrayList<String> taskList = new ArrayList<>();

    public static ArrayList<String> getList() {
        return taskList;
    }

    public static void addTask(String task) {
        taskList.add(task);
    }
}

