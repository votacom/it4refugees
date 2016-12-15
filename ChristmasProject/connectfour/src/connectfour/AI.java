package connectfour;

/**
 * Class for a computer player ("Artificial Intelligence" AI)
 * TODO: The computer player is fully functional, but you can try to improve it if you want!
 */
public class AI {

    private final Board board;
    private final TileColor color;

    /**
     * @param board The board on which we are playing
     * @param color The color the computer player is using
     */
    public AI(Board board, TileColor color) {
        this.board = board;
        this.color = color;
    }

    /**
     * Let the computer player do one move
     */
    public void doMove() {
        boolean accepted;
        do {
            // Pick a random number between 0 and 1
            double random = Math.random();

            // Multiply and round, so we get an integer from 0 to width-1
            int column = (int) Math.round(random * (board.getWidth() - 1));

            // Put a tile there
            accepted = board.insert(column, color);
        } while (!accepted);
    }


}
