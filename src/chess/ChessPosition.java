    package chess;

    import boardgame.Position;

    public class ChessPosition {
        private final char column;
        private final int row;

        public ChessPosition(char column, int row) {
            if (column < 'a' || column > 'h' || row < 1 || row > 8)
                throw new ChessException("Invalid chess position: Valid values are from a1 to h8.");
            this.column = column;
            this.row = row;
        }

        protected static ChessPosition fromPosition(Position position) {
            return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow());
        }

        protected Position toPosition() {
            return new Position(8 - row, column - 'a');
        }

        public String toString() {
            return "" + column + row;
        }

        public char getColumn() {
            return column;
        }

        public int getRow() {
            return row;
        }
    }
