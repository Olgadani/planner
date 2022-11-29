
public class Task {
    private final String name;
    private final int id;
    public static int counter;

    public Task(String name, int id) {
        this.name = name;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}
