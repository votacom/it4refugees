package abstractClassExample;

/**
 * Created by julian on 11/1/17.
 */
public class MotorBoat extends Boat {

    public MotorBoat(){
        super("gas engine");
    }


    public void move(){
        System.out.printf("This abstractClassExample.Boat moves using a gas engine!");
    }
}
