package abstractClassExample;

/**
 * Created by julian on 11/1/17.
 */
public abstract class Boat {

    String engine;

    public Boat(String engine) {
        this.engine = engine;
    }

    public abstract void move();
}
