package facade;

public class ProteinPicker {
    private final String protein;

    public ProteinPicker(String protein) {
        this.protein = protein;
    }
    
    public String pickProtein() {
        return protein;
    }
}
