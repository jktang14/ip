package Azir;

import java.util.ArrayList;

/**
 * Represents a list of tasks in the chatbot
 */
public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    /**
     * Adds a task to the taskList
     *
     * @param task Task to be added
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

    /**
     * Removes a task from the tasklist
     *
     * @param index Position of the task in the tasklist
     */
    public void DeleteTask(int index) {
        tasks.remove(index);
    }

    public Task getTask(int index) {
        return tasks.get(index);
    }

    public int getSize() {
        return tasks.size();
    }
}
