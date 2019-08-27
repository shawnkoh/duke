package duke.command;

import duke.exception.DukeException;
import duke.task.Task;

public class DeleteCommand extends Command {

    public static final String COMMAND_WORD = "delete";
    private final int toDelete;

    public DeleteCommand(int id) {
        this.toDelete = id;
    }

    @Override
    public void execute() throws DukeException {
        Task task = tasks.get(toDelete);
        tasks.delete(toDelete);
        storage.save(tasks.stringify());
        ui.showLine();
        ui.showMessage("Noted. I've removed this task:");
        ui.showMessage("  " + task);
        ui.showMessage("Now you have " + tasks.size() + " tasks in the list.");
        ui.showLine();
    }
}