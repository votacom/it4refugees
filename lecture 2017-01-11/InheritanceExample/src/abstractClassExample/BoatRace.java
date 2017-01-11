package abstractClassExample;

/**
 * Created by julian on 11/1/17.
 */
public class BoatRace {

    public static void main(String[] args) {
        Boat steamBoat1 = new SteamBoat();
        Boat motorBoat1 = new MotorBoat();

        steamBoat1.move();
    }
}
