package command;

import java.util.ArrayList;

public class ColorInvoker {
    private ArrayList<ColorCommand> commandHistory = new ArrayList<>();

    public void execute(ColorCommand command) {
        commandHistory.add(command);
        command.execute();
    }

    public ArrayList<ColorCommand> getCommandHistory() {
        return commandHistory;
    }
}
