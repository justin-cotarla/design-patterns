package composite;

public interface LogicalDirectory {
    public String ls(int level);

    public void add(LogicalDirectory d);

    public void remove(LogicalDirectory d);

    public LogicalDirectory getChild(int index);
}
