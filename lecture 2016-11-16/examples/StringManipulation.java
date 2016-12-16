/**
 * Created by Florian on 16.11.16.
 */
public class StringManipulation {

    public static void main(String[] args) {
        //Create a new String
        String mystring = "hallo World!";

        //Find index of letter "a" in mysting
        int myIndex = mystring.indexOf("a");

        //Print postition of letter "a" in mysting
        System.out.println(myIndex);

        //Find letter, taht is not in String
        int myerror = mystring.indexOf("y");

        //indexOf returns -1 when letter is not in String
        System.out.println(myerror);

        //Index of outsourced to Function
        checkIfLetterisInString('a', mystring);
        checkIfLetterisInString('y', mystring);
    }


    static void checkIfLetterisInString(char letter, String string) {
        if(string.indexOf(letter) > -1) {
            System.out.println("Letter " + letter + " is in String!");
        } else {
            System.out.println("Letter " + letter + " is not in String!");
        }

    }




}
