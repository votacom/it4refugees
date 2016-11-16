/**
 * Created by Florian on 16.11.16.
 */
public class Arrays {
    public static void main(String[] args) {
        
        //Create new Array
        String[] myPets;
        myPets = new String[5];
        
        myPets[0] = "Dog";
        myPets[1] = "Cat";
        myPets[2] = "Fish";
        myPets[3] = "Bird";
        myPets[4] = "Rabbit";

        System.out.println("My pet at Position 0 is a " + myPets[0]);

        for(int i = 0; i<myPets.length; i++) {
            System.out.println("My pet is a " + myPets[i]);
        }

        System.out.println("=========================================");


        //Create new Array
        String[] myHobbies = {"Swimming", "Climbing", "Football"};

        System.out.println("My hobby at position 0 is " + myHobbies[0]);

        for(String hobby:myHobbies) {
            System.out.println("My Hobby is " + hobby);
        }

        int numberOfHobbies = myHobbies.length;
        System.out.println("I have "+ numberOfHobbies + " hobbies!");

        System.out.println("=========================================");

        myHobbies[1] = "Sleeping";

        for(String hobby:myHobbies) {
            System.out.println("My current Hobby is " + hobby);
        }




    }
}
