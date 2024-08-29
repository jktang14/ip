package Azir;

import Azir.Task;

/**
 * Todo is a child of the Task class to indicate a task
 * with only a description
 */
public class Todo extends Task {
    public Todo(String description) {
        super(description);
    }

    /**
     * Formats deadline task into a special string format
     * @return Special string format
     */
    public String formatText() {
        return String.format("T | %s | %s", super.getDoneString(), super.getDescription());
    }

    @Override
    public String toString() {
        return String.format("[T] %s", super.toString());
    }
}
