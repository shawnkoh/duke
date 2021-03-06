package duke.task;

/**
 * Represents a {@link Task} to be done.
 */
public class ToDo extends Task {
    public ToDo(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    @Override
    public String stringify() {
        return "T | " + super.stringify();
    }
}
