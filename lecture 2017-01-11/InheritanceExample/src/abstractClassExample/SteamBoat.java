package abstractClassExample;

/**
 * Created by julian on 11/1/17.
 */
public class SteamBoat extends Boat {

    public SteamBoat(){
        super("steam engine");
    }


    public void move(){
        System.out.println("This boat moves using a steam engine!");
    }
}
