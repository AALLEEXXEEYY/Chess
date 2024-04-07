package game.chess;

import game.chess.piece.Pawn;
import game.chess.piece.Piece;

import java.util.HashMap;

public class Board {
    HashMap<Coordinates, Piece> pieces=new HashMap<>();

    public void setPeace(Coordinates coordinates,Piece piece){
        piece.coordinates=coordinates;
        pieces.put(coordinates,piece);
    }

    public void setupDefaultPiecesPositions(){
        for(File file: File.values()){
            setPeace(new Coordinates(file,2), new Pawn(Color.WHITE,new Coordinates(file,2)));
            setPeace(new Coordinates(file,7), new Pawn(Color.BLACK,new Coordinates(file,7)));

        }

    }

    public static boolean isSquareDark(Coordinates coordinates){
        return (((coordinates.file.ordinal()+1)+coordinates.rank)%2==0);


    }

}
