// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP103 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP 103 Assignment 3
 */

/** A pair of row and col representing a coordinate in the warehouse.
 *  Also has a method to return the next Coord in a given direction.
 */

public class Coord {

    public final int row;  // because they are final (can't be changed), it is
    public final int col;  // safe to make these fields public.

    Coord (int row, int col) {
        this.row = row;
        this.col = col;
    }

    /** Return the next coord in the specified direction */
    public Coord next(String dir) {
        if (dir.equals("up"))    return new Coord(row-1, col);
        if (dir.equals("down"))  return new Coord(row+1, col);
        if (dir.equals("left"))  return new Coord(row, col-1);
        if (dir.equals("right")) return new Coord(row, col+1);
        return this;
    }
    
    public String calculateMoveToCoord(Coord o)
    {
        int deltaY = o.row -  this.row;
        int deltaX = o.col - this.col;
        
        if( deltaY == -1 && deltaX == 0 ) return "up";
        if( deltaY == 1 && deltaX == 0 ) return "down";
        if( deltaY == 0 && deltaX == 1 ) return "right";
        if( deltaY == 0 && deltaX == -1 ) return "left";
        
        System.out.println("ERROR");
        return null;
    }

    public String toString() {
        return String.format("(%d,%d)", row, col);
    }
}
