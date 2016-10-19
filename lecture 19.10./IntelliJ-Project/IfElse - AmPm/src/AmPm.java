/**
 * prints a given time of day in am/pm format.
 */
public class AmPm {

    public static void main(String[] args) {

        int hours = 14;
        int minutes = 56;

        if (hours <= 12) {
            System.out.println(hours + ":" + minutes + " am");
        } else {
            int afternoonHours = hours - 12;
            System.out.println(afternoonHours + ":" + minutes + " pm");
        }

    }
}
