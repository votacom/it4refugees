/**
 * Homework till 21.11.2016
 * 
 */
public class Homework {

    /**
     * Use a loop to go through the String and print the char for the current
     * value of the loop variable on the screen.
     * Note: length() and charAt()
     * @param str String contains the letters to be printed
     *
     * Geh den String in einer Schleife durch und gib
     * das Zeichen fuer die aktuelle Schleifenvariable auf dem Bildschirm
     * aus.
     * Hinweis: length() und charAt()
     * @param str String der die Zeichen enthaelt die ausgegeben werden sollen
     *
     * Example / Beispiel
     * charactersInAString("Stephanie Lehrer") should print
     * S t e p h a n i e   L e h r e r
     */
    public static void charactersInAString(String str) {

    }

    /**
     * The method prints a stair of lines, each containing the first n characters of a string.
     * N should be raising from 1 to the length of the string and decrease back to one.
     * Hint: use the substring method
     * @param str String to be printed in stairs
     *
     * Die Methode soll eine Stiege aus Zeilen ausgeben, wo jede Zeile die ersten n Zeichen eines Strings beinhaltet.
     * N soll dabei von 1 bis zur Länge des Eingabestrings ansteigen und wieder bis auf 1 verringert werden.
     * Hinweis: Verwende die Methode substring
     * @param str String der in Stiegenformation ausgegeben werden soll
     *
     * Example / Beispiel
     * stringStairs(“Stefanie Lehrer) should print
     * S
     * St
     * Ste
     * Stef
     * Stefa
     * Stefan
     * Stefani
     * Stefanie
     * Stefanie
     * Stefanie L
     * Stefanie Le
     * Stefanie Leh
     * Stefanie Lehr
     * Stefanie Lehre
     * Stefanie Lehrer
     * Stefanie Lehre
     * Stefanie Lehr
     * Stefanie Leh
     * Stefanie Le
     * Stefanie L
     * Stefanie
     * Stefanie
     * Stefani
     * Stefan
     * Stefa
     * Stef
     * Ste
     * St
     * S
     */
    public static void stringStairs(String str) {

    }

    /**
     * The method prints a stair of lines, each containing the last n characters of a string. N should be raising from
     * 1 to the length of the string and decrease back to one.
     * Hint: use the substring method
     * @param str String to be printed in reverse stairs
     *
     * Die Methode soll eine Stiege aus Zeilen ausgeben, wo jede Zeile die letzten n Zeichen eines Strings beinhaltet.
     * N soll dabei von 1 bis zur Länge des Eingabestrings ansteigen und wieder bis auf 1 verringert werden.
     * Hinweis: Verwende die Methode substring
     * @param str String der als umgekehrte Stiege ausgegeben werden soll
     *
     * Example / Beispiel
     * stringStairs(“Stefanie Lehrer”) should print
     * r
     * er
     * rer
     * hrer
     * ehrer
     * Lehrer
     * Lehrer
     * e Lehrer
     * ie Lehrer
     * nie Lehrer
     * anie Lehrer
     * fanie Lehrer
     * efanie Lehrer
     * tefanie Lehrer
     * Stefanie Lehrer
     * tefanie Lehrer
     * efanie Lehrer
     * fanie Lehrer
     * anie Lehrer
     * nie Lehrer
     * ie Lehrer
     * e Lehrer
     * Lehrer
     * Lehrer
     * ehrer
     * hrer
     * rer
     * er
     * r
     *
     */
    public static void stringStairsReversed(String str) {

    }

    /**
     * The method returns the initials for a given name. The initials are defined as the first letters of firstname
     * and lastname. Possible middle names can be included as well. Make sure the initials are only uppercase letters.
     * You can expect the input to be in the format “Firstname Middlename Lastname”
     * @param name Name from which the initials should be printed
     * @return String which contains the initials
     *
     * Die Methode liefert die Initialien für einen Namen. Die Initialien sind definiert als die ersten Buchstaben von
     * Vorname und Nachname. Es können auch mehrere Vornamen beinhaltet sein. Stelle sicher, dass die Initialien
     * nur Großbuchstaben beinhalten.
     * Es kann angenommen werden, dass die Eingabe immer im Format “Vorname Zweitname Nachname” vorliegt.
     * @param name Name dessen Initialen ausgegeben werden sollten
     * @return String der die Initialen enthaelt
     *
     * Example / Beispiel
     * getInitials(“Stefanie Lehrer”) should print
     * SL
     */
    public static String getInitials(String name) {

        return name;
    }

    /**
     * Optional: Write a function which take a String as an argument and prints all odd words in
     * uppercase and all even words in lowercase letters.
     * @param str String which contains the words to be printed
     *
     * Freiwillige Uebung: Schreibe eine Funktion die einen String als Argument, dessen Wörter
     * abwechselnd nur in Groß- oder Kleinbuchstaben ausgegeben werden. Das 1., 3., 5., ..
     * Wort wird in Großbuchstaben ausgegeben. Das 2.,4.,6.,... Wort wird in Kleinbuchstaben
     * ausgegeben.
     * @param str String dessen Wörter ausgegeben werden
     *
     * Example / Beispiel
     * Today I am at the Vienna University of Technology.
     * TODAY i AM at THE vienna UNIVERSITY of TECHNOLOGY.
     *
     */


    /**
     * Main function which calls all defined functions.
     * @param args
     */

    public static void main(String[] args) {
        String name = "Stephanie Lehrer";
        charactersInAString(name);
        stringStairs(name);
        stringStairsReversed(name);
        System.out.println(getInitials(name));
    }
}
