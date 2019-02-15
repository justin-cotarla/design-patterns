package builder;

public abstract class ReportBody {
    private String name;

    public abstract void printContent();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
