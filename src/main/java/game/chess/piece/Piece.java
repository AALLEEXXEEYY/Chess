package game.chess.piece;

import game.chess.Color;
import game.chess.Coordinates;

public abstract class Piece {

    public final Color color;
     public Coordinates coordinates;

    public Piece(Color color, Coordinates coordinates) {
        this.color = color;
        this.coordinates = coordinates;
    }
}
