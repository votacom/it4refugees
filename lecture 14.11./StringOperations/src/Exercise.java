/**
 * Created by vanessa on 10.11.16.
 */
public class Exercise {


    /**
     * Returns "String (container) contains (content)" if container contains content. Otherwise
     * "String (container) does not contain (content)" is returned
     *
     * Liefert "String (container) enthält (content)", wenn container den content beinhaltet.
     * Ansonsten wird "String (container) does not contain (content)" zurückgeliefert.
     */
    public static String contains(String container, String content) {
        return "";
    }


    /**
     * Returns true if str starts with startOrEnd and ends with startOrEnd. Otherwise false is returned.
     * Liefert wahr, wenn str mit startOrEnd beginnt und mit startOrEnd endet. Ansonsten wird falsch zurückgeliefert.
     */
    public static boolean startsAndEnds(String str, String startOrEnd) {
        return false;
    }

    /**
     * Print out every 8th letter starting with 0.
     * @param str String to be used
     *
     * Gib jeden 8.Buchstaben aus und beginne dabei bei 0.
     * @param str String der verwendet werden soll
     */
    public static void print8thLetter(String str) {

    }

    /**
     * Loops over the String and returns the number of 'e's and 'E's in the
     * String.
     * @param str String from which the numbers of 'e's and 'E's have to be calculated
     * @return number of e letters in the String
     *
     * Geh den String in einer Schleife durch, und liefere die Anzahl der
     * vorkommenden 'e's und 'E's zurück.
     * @param str String dessen Anzahl von 'e's und 'E's berechnet werden sollen
     * @return Anzahl von 'e's und 'E's im String
     *
     * Example / Beispiel
     * numberOfEs("This tests if you are able to use string functions.")
     * Result: 3
     *
     */
    public static int numberOfEs(String str) {

        return 0;
    }

    /**
     * Replace each occurrence of search in sentence with replacement. Use the new String and
     * the first letter of replacement to substitute it with the first letter of search.
     * Use the contains function to check if sentence contains the search
     * string. If sentence does not contain the search return "Searchstring not found".
     * @param sentence String in which word and letters will be replaced
     * @param search a word which is part of sentence
     * @param replacement the word which will replace search in sentence
     * @return String in which words and letters have been replaced
     *
     * Ersetze jedes Vorkommen von search in sentence durch replacement. Nimm dann den neuen String
     * und ersetze alle Vorkommen des ersten Buchstabens von replacement mit dem ersten Buchstaben von search.
     * Verwende die contains Funktion um zu prüfen ob der search in sentence
     * enthalten ist. Wenn sentence search nicht enthält liefere "Suchstring nicht gefunden" zurück.
     *
     * @param sentence String in dem Wörter und Buchstaben ersetzt werden
     * @param search ein Wort welches in sentence enthalten ist
     * @param replacement ein Wort welches search in sentence ersetzen wird
     * @return String in dem Worter und Buchstaben ersetzt wurden
     * Example / Beispiel
     * replaceWordsAndLetters("The restaurant offers schnitzel, rice and hamburger. I consider ordering a schnitzel,
     * because I really like schnitzel. Rice sounds also good, but I will eat a schnitzel.", "schnitzel","tofu")
       "she ressaurans offers sofu, rice and hamburger. I consider ordering a sofu,
     * because I really like sofu. Rice sounds also good, bus I will eas a sofu."
     */
    public static String replaceWordsAndLetters(String sentence, String search, String replacement) {
        return sentence;
    }


    /**
     * Prints the second word of a sentence in uppercase.
     * Hint: Use substring, indexOf, toUpperCase
     *
     * Gibt das zweite Wort eines Satzes in Großbuchstaben aus.
     * Hinweis: Verwende substring, indexOf, toUpperCase
     *
     * Bonus:
     * Try to extend the method to also work for sentences only consisting of two words. E.g. “I am.”
     * Versuche die Methode so zu erweitern, dass sie auch für Sätze funktioniert, welche nur aus zwei Wörtern bestehen. Zum Beispiel “Ich bin.”
     */
    public static void printSecondWord(String str) {


    }



    public static void main(String[] args) {
        System.out.println(contains("Every morning Alex goes for a walk.","morning" ));
        System.out.println(contains("Tobi is writing an exam today.","test"));
        System.out.println(contains("Micheal wants to play in the garden.","Garden"));

        System.out.println(startsAndEnds("Otto will be talking to Cindy tomorrow. Who will be talking to Cindy? Otto", "Otto"));
        System.out.println(startsAndEnds("Sabrina's cat is able to talk like a human.", "human"));

        print8thLetter("Go and grab apples for Tami's pet.");
        System.out.println();
        System.out.println(numberOfEs("I want you to tell me how many 'E's and 'e's are in this String. Either ten or eight I am not so sure. "));

        System.out.println(replaceWordsAndLetters("The restaurant offers schnitzel, rice and hamburger. I consider ordering a schnitzel, because I really like schnitzel. Rice sounds also good, but I will eat a schnitzel.", "schnitzel","tofu"));
        printSecondWord("Good By, see you soon.");
    }
}
