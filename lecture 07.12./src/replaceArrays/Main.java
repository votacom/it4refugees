package replaceArrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create a new Event with the name "A cool Party"
        Event aCoolParty = new Event("A cool Party");

        Scanner in = new Scanner(System.in);

        // add attendants to the event
        addAttendants(aCoolParty, in);

        // use the printAttendants method on the class event to print all the attendants
        System.out.println("Persons attending the event are now:");
        aCoolParty.printAttendants();

        // remove attendants from the event again
        removeAttendants(aCoolParty, in);

        // print the attendants again
        System.out.println("Persons attending the event are now:");
        aCoolParty.printAttendants();

    }

    /**
     * Adds persons to the given event by reading their names with a Scanner.
     *
     * @param e the event to add the persons to
     * @param in the Scanner to use
     * @return the event containing the new attendants
     */
    public static Event addAttendants(Event e, Scanner in) {
        System.out.print("Please enter the names of all persons which shall attend '" + e.getName() + "'");
        System.out.println(" (stop by writing 'Stop')");

        while(in.hasNextLine()) {
            String name = in.nextLine();
            if (name.equals("Stop")) {
                break; // exit the loop
            }

            // create the new person
            Person newAttendant = new Person(name);

            // add the new person as an attendant
            e.addAttendant(newAttendant);
        }

        return e;
    }


    /**
     * Adds persons to the given event by reading their names with a Scanner.
     *
     * @param e the event to add the persons to
     * @param in the Scanner to use
     * @return the event containing the new attendants
     */
    public static Event removeAttendants(Event e, Scanner in) {
        System.out.print("Please enter the names of all persons which shall no longer attend '" + e.getName() + "'");
        System.out.println(" (stop by writing 'Stop')");

        while(in.hasNextLine()) {
            String name = in.nextLine();
            if (name.equals("Stop")) {
                break; // exit the loop
            }

            // create the person
            Person personToRemove = new Person(name);

            // remove the person as an attendant
            e.removeAttendant(personToRemove);
        }

        return e;
    }
}
