package composite;

public class Driver {
    public static void main(String[] args) {
        LogicalDirectory home = new Directory("Home");
        LogicalDirectory music = new Directory("Music");

        music.add(new File("Stayin' Alive"));
        music.add(new File("I'm Blue"));

        home.add(music);

        System.out.println(home.ls(0));
    }
}
