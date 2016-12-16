
public class Rectangle {
    String colour;
    int width;
    int height;

    void rotate(){
        int a=width;
        width=height;
        height=a;
        System.out.println("The "+colour+" rectangle was rotated.");
    }

    public String toString(){
        return colour + " rectangle, width: "+width+", height: "+
                height;
    }
}
