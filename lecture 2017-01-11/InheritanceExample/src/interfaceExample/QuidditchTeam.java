package interfaceExample;

/**
 * Created by julian on 11/1/17.
 */
public class QuidditchTeam {

    public static void main(String[] args) {
        Flying teamMember1 = new Bird();
        Plane teamMember2 = new Plane();

        teamMember1.fly();
        teamMember2.fly();

        teamMember2.drive();

    }
}
