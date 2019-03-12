package composite;

import java.util.ArrayList;

public class Directory implements LogicalDirectory {
    private ArrayList<LogicalDirectory> dirList = new ArrayList<>();
    private String name;

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String ls(int level) {
        String ls = new String(new char[2*level]).replace('\0', ' ');
        ls += name + "/\n";
        for (LogicalDirectory currentDir : dirList) {
            ls += currentDir.ls(level + 1);
        }
        return ls;
    }

    @Override
    public void add(LogicalDirectory d) {
        dirList.add(d);
    }

    @Override
    public void remove(LogicalDirectory d) {
        dirList.remove(d);
    }

    @Override
    public LogicalDirectory getChild(int index) {
        return dirList.get(index);
    }
}
