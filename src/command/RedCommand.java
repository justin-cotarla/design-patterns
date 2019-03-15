package command;

public class RedCommand implements ColorCommand {
    private final Palette palette;

    public RedCommand(Palette palette) {
        this.palette = palette;
    }

    @Override
    public void execute() {
        this.palette.setColor("red");
    }
}
