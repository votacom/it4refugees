public class Main {

    /*
    *  This programm tries to find the longest cityname of the array 'cities' and prints it to the commandline
    */
    public static void main(String[] args) {

        String[] cities = new String[]{"Wien","Graz","Linz","Salzburg","Innsbruck","Bregenz","Eisenstadt","St. Pölten"};

        int longestName;
        int maxLengh;

        for(i = 0;i<cities.length;i++){

            if(cities[i].length()>maxLengh){
                longestName=cities[i];
                maxLengh=cities[i].length();
            }

        }

        System.out.println("The city with the longest name is: "+longestName);

    }
}
