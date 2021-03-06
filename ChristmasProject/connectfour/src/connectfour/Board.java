package connectfour;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Board {

    // This stores the height of the board
    private int height;

    // This stores the tiles already in the board. It is a List of Lists (similar to a two-dimensional array)
    private final List<List<TileColor>> tiles;

    // This stores the winning color as soon as someone has won
    private TileColor winner = null;


    public Board(int width, int height) {
        tiles = new ArrayList<>();
        for (int i = 0; i < width; i++) {
            tiles.add(i, new ArrayList<>());
        }
        this.height=height;
    }

    /**
     * Inserts a tile to the given column, if it is not yet full
     *
     * @param column The number of the column to insert the tile to (starting with 0)
     * @param tile   The color of the tile
     * @return True if the tile could be inserted, false if inserting was not possible
     */
    public boolean insert(int column, TileColor tile) {
        // TODO: Insert the tile to the correct List
        // TODO: Don't forget to check if it's even possible to insert to the column!


        // TODO: This should contain the index of the row at which the tile was inserted
        int row = 0;

        // Check if the color we just inserted has won the game
        if (checkWon(column, row)) {
            winner = tile;
        }

        return false;
    }

    /**
     * Should return the color of the given column/row
     *
     * @param column The column, starting with 0 at the left
     * @param row    The row, starting with 0 at the bottom
     * @return The color, or null if the position is empty
     */
    public TileColor getTile(int column, int row) {
        if (column < 0 || row < 0) {
            // We are below the board or left of the board
            return null;
        }

        if (column >= tiles.size() || row >= tiles.get(column).size()) {
            return null;
        }

        // TODO: Implement the rest of the method!
        return null;
    }

    public TileColor getWinner() {
        // TODO: Return the winner
        return null;
    }

    private boolean checkWon(int column, int row) {
        TileColor color = getTile(column, row);

        if (color == null) {
            return false;
        }

        // Check if there are four elements in one direction
        // horizontal
        if(countHorizontal(column,row) >= 4) {
            return true;
        }

        // TODO: There are three more directions. Check in those directions too!

        return false;
    }

    private int countHorizontal(int column, int row){
        TileColor color = getTile(column, row);

        int count = 1;
        int i = column+1;
        boolean connected = true;
        while(i<getWidth() && connected){
            if(getTile(i,row)==color){
                count++;
            }else{
                connected=false;
            }
            i++;
        }
        i = column-1;
        connected=true;
        while(i>=0 && connected){
            if(getTile(i,row)==color){
                count++;
            }else{
                connected=false;
            }
            i--;
        }
        return count;
    }

    public int getWidth() {
        return tiles.size();
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        // TODO: Return a string here that outputs all the positions of the board
        // HINT: You will need loops and you can make use of getTile() and the toString() method of TileColor here!

        return "";
    }

}
