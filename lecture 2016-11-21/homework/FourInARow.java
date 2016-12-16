/**
 * global variables
 * game board
 * creates scanner
 */
public class FourInARow {

    /**
     * creates board
     * tells player how to play
     * displays board
     * creates boolean to determine status of game
     * main game loop
     * activates player 1s turn, then prints board
     * determines if player 1 has won
     * sets flag to false so loop is not repeated if player 1 won
     * break to skip player 2s turn if won
     * activates player 2s turn, then prints board
     * determines if player 1 has won
     * sets flag to false so loop is not repeated if player 2 won
     * break for consistency
     *
     * @param args
     */
    public static void main(String[] args) {
    }

    /**
     * fills board with '.' for the width and height
     */
    public static void createBoard() {
    }

    /**
     * prints the board
     */
    public static void printBoard() {
    }

    /**
     * creates a counter
     * shows whose turn
     * gets input
     * checks to see if space is blank, puts X there if it is
     * breaks loop after placing
     * if space isn't blank, checks to see if one above is
     * puts X if blank
     * breaks loop after placing
     * adds one to counter if the space wasn't blank, then loops again
     * checks to see if at end of column
     */
    public static void dropX() {
    }

    /**
     * creates a counter
     * shows whose turn
     * gets input
     * checks to see if space is blank, puts O there if it is
     * breaks loop after placing
     * if space isn't blank, checks to see if one above is
     * puts O if blank
     * breaks loop after placing
     * adds one to counter if the space wasn't blank, then loops again
     * checks to see if at end of column
     */
    public static void DropO() {

    }

    /**
     * creates boolean to act as flag
     * creates counter
     * goes through board horizontally
     * if it finds an X, add 1 to counter
     * if next piece is not an X, set counter to 0
     * if counter is greater or equal to 4, player wins
     *
     * @return
     */
    public static boolean CheckXHorizontal() {
        return false;
    }

    /**
     * creates boolean to act as flag
     * creates counter
     * goes through board vertically
     * if it finds an X, add 1 to counter
     * if next piece is not an X, set counter to 0
     * if counter is greater or equal to 4, player wins
     *
     * @return
     */
    public static boolean CheckXVertical() {
        return false;
    }

    /**
     * creates boolean to act as flag
     * creates counter
     * goes through board horizontally
     * if it finds an O, add 1 to counter
     * if next piece is not an O, set counter to 0
     * if counter is greater or equal to 4, player wins
     *
     * @return
     */
    public static boolean CheckOHorizontal() {
        return false;
    }

    /**
     * creates boolean to act as flag
     * creates counter
     * goes through board vertically
     * if it finds an O, add 1 to counter
     * if next piece is not an O, set counter to 0
     * if counter is greater or equal to 4, player wins
     *
     * @return
     */
    public static boolean CheckOVertical() {
        return false;
    }

    /**
     * flag
     * counter
     * check boolean
     * checkers
     * goes through until an X is found
     * if X is found, add one to counter and go into loop
     * goes through diagonally looking for Xs
     * if X is found, add 1 to counter
     * adds 1 to checkers
     * if outside of board, break
     * if counter is greater or equal to 4, player wins
     * resets counter and checkers
     *
     * @return
     */
    public static boolean CheckXDiagonalForward() {
        return false;
    }

    /**
     * flag
     * counter
     * check boolean
     * checkers
     * goes through until an O is found
     * if O is found, add one to counter and go into loop
     * goes through diagonally looking for Os
     * if O is found, add 1 to counter
     * adds 1 to checkers
     * if outside of board, break
     * if counter is greater or equal to 4, player wins
     * resets counter and checkers
     *
     * @return
     */
    public static boolean CheckODiagonalForward() {
        return false;
    }


    /**
     * flag
     * counter
     * check boolean
     * checkers
     * goes through until an X is found
     * if X is found, add one to counter and go into loop
     * goes through diagonally looking for Xs
     * if X is found, add 1 to counter
     * adds 1 to checkers
     * if outside of board, break
     * if counter is greater or equal to 4, player wins
     * resets counter and checkers
     *
     * @return
     */
    public static boolean CheckXDiagonalBack() {
        return false;
    }

    /**
     * flag
     * counter
     * check boolean
     * checkers
     * goes through until an O is found
     * if O is found, add one to counter and go into loop
     * goes through diagonally looking for Os
     * if O is found, add 1 to counter
     * adds 1 to checkers
     * if outside of board, break
     * if counter is greater or equal to 4, player wins
     * resets counter and checkers
     *
     * @return
     */
    public static boolean CheckODiagonalBack() {
        return false;
    }


}