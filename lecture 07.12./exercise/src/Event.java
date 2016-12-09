import java.util.ArrayList;

public class Event {

    private String name;

    private ArrayList<Person> attendants;

    public Event(String name) {
        this.name = name;

        this.attendants = new ArrayList<Person>();
    }

    public void addAttendant(Person attendant) {
        this.attendants.add(attendant);
    }

    public boolean removeAttendant(Person attendant) {
        return this.attendants.remove(attendant);
    }

    public void printAttendants() {
        System.out.println(this.attendants.toString());
    }

    /************ Getter and setter methods ******************/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
