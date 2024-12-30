package boardgame;

public abstract class Piece {
    private final Board board;
    protected Position position;

    public Piece(Board board) {
        this.board = board;
        this.position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isTherePossibleMove() {
        boolean[][] mat = possibleMoves();
        for (boolean[] booleans : mat) {
            for (boolean aBoolean : booleans) {
                if (aBoolean) return true;
            }
        }
        return false;
    }
}
