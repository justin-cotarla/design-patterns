package facade;

public class HamburgerMaker {
    private ProteinPicker proteinPicker;
    private SaucePicker saucePicker;
    private BreadPicker breadPicker;

    public HamburgerMaker() {
        proteinPicker = new ProteinPicker("meat");
        saucePicker = new SaucePicker("ketchup");
        breadPicker = new BreadPicker("bun");
    }

    public String makeBurger() {
        return breadPicker.pickBread() +
                " " +
                proteinPicker.pickProtein() +
                " " +
                saucePicker.pickSauce() +
                " " +
                breadPicker.pickBread();

    }
}
