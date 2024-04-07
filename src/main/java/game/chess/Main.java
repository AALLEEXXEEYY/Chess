package game.chess;

public class Main {

    public static void main(String[] args) {
        Board board=new Board();
        board.setupDefaultPiecesPositions();
        BoardConsoleRenderer consoleRenderer=new BoardConsoleRenderer();
        consoleRenderer.render(board);


    }
}