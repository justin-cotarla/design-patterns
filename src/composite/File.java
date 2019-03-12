package composite;

public class File implements LogicalDirectory {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String ls(int level) {
        String ls = new String(new char[2*level]).replace('\0', ' ');
        return ls + name + "\n";
    }

    @Override
    public void add(LogicalDirectory d) {
    }

    @Override
    public void remove(LogicalDirectory d) {
    }

    @Override
    public LogicalDirectory getChild(int index) {
        return null;
    }
}
