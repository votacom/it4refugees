package abstractClassExample;

/**
 * Created by julian on 11/1/17.
 */
public class Car {

    private String colour;

    public Car(String colour){
        this.colour = colour;
    }

    public Car(){
        this("blue");
    }

    public static void main(String[] args) {
        Car car1 = new Car("red");

        Car car2 = new Car();
    }
}
