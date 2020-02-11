import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus (String destination){
        this.destination = destination;
        this.capacity = 50;
        this.passengers = new ArrayList<Person>();
    }
}
