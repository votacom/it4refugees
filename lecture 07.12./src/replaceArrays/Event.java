package replaceArrays;

/**
 * Created by johannesvass on 07.12.16.
 */
public class Event {

    private String name;

    // TODO use ArrayList instead of an Array
    private Person[] attendants;

    public Event(String name) {
        this.name = name;

        // PROBLEM: we don't know in advance how many attendants there will be
        // we cannot allow infinitely many persons to join the event :-(
        this.attendants = new Person[2];
    }

    // TODO simplify this method with ArrayList, allow all persons to attend, don't reject anybody
    public void addAttendant(Person attendant) {

        for (int i=0; i < this.attendants.length; i++) {

            Person p = this.attendants[i];
            if (p == null) {
                this.attendants[i] = attendant;
                return;
            }
        }

        System.err.println("Sorry, " + attendant + " may not attend this event because there is no space left");
    }

    // TODO simplify this method with ArrayList
    public void removeAttendant(Person attendant) {
        for (int i=0; i < this.attendants.length; i++) {

            Person p = this.attendants[i];
            if (p != null && p.equals(attendant)) {
                this.attendants[i] = null;
                return;
            }
        }

        System.err.println("Sorry, could not remove " + attendant + " from this event, because they were not attending");
    }

    // TODO: simplify this method. How can we print the elements of an ArrayList?
    public void printAttendants() {
        System.out.print("[");
        for (Person p: this.attendants) {
            System.out.print(p);
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }


    /************ Getter and setter methods ******************/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
