package ExceptionExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by lukas on 06.11.2016.
 */
public class TryCatchExample {

    public static void main(String[] args) {
        System.out.println(tryCatch());

        //System.out.println(tryCatchFinally());

        /*try {
            System.out.println(throwOutThere());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //throwNullPointerException();

        /*try {
            throwNullPointerException();
        } catch(NullPointerException e) {
            System.out.println("Exception caught");
            e.printStackTrace();
        }*/
    }

    public static String tryCatch() {
        System.out.print("Enter for tryCatch: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String message = null;
        try {
            //System.in.close();
            message = reader.readLine();
        } catch (IOException e) {
            System.out.println("Exception occurred");
            e.printStackTrace();
            //throw new RuntimeException();
        }
        if (reader != null) {
            System.out.println("Close reader");
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                //ignore because you can't change it
            }
        }

        return message;
    }

    public static String tryCatchFinally() {
        System.out.print("Enter for tryCatchFinally: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String message = null;
        try {
            //System.in.close();
            message = reader.readLine();
        } catch (IOException e) {
            System.out.println("Exception occurred");
            e.printStackTrace();
            //throw new RuntimeException();
        } finally {
            try {
                System.out.println("Close reader");
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                //ignore because you can't change it
            }
        }
        return message;
    }

    public static String throwOutThere() throws IOException {
        System.out.print("Enter for throwOutThere: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.in.close();
        String message = reader.readLine();
        reader.close();
        return message;
    }

    public static void throwNullPointerException() {
        BufferedReader reader = null;
        try {
            reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
