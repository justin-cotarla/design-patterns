package command;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {
    @Test
    public void commandTest() {
        Palette palette = new Palette();
        ColorInvoker invoker = new ColorInvoker();

        ColorCommand redCommand = new RedCommand(palette);
        ColorCommand blueCommand = new BlueCommand(palette);

        invoker.execute(redCommand);

        assertEquals("red", palette.getColor());

        invoker.execute(blueCommand);

        assertEquals("blue", palette.getColor());

        ArrayList<ColorCommand> commandHistory = invoker.getCommandHistory();
        assertEquals(redCommand, commandHistory.get(0));
        assertEquals(blueCommand, commandHistory.get(1));
    }

}