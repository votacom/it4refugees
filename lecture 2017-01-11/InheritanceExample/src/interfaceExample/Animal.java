package interfaceExample;

/**
 * Created by julian on 11/1/17.
 */
public abstract class Animal {

    private int numLegs;

    public Animal(int numLegs){
        this.numLegs=numLegs;
    }

    @Override
    public String toString() {
        return "Animal with "+numLegs+" legs.";
    }
}
