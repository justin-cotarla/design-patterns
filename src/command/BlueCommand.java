package command;

public class BlueCommand implements ColorCommand {
    private final Palette palette;

    public BlueCommand(Palette palette) {
        this.palette = palette;
    }

    @Override
    public void execute() {
        this.palette.setColor("blue");
    }
}
