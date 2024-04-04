public class Board {
    public int[][] getCurrentBoard() {
        return new int[3][3] ;
    }

    public BoardEnum[][] getEmptyBoard() {
        BoardEnum [][] emptyBoard = new BoardEnum[3][3];
        for (int i = 0; i <emptyBoard[0].length ; i++) {
            for (int j = 0; j < emptyBoard.length ; j++) {
                emptyBoard[i][j] = BoardEnum.EMPTY;
            }
        }
        return emptyBoard;
    }

    public String display(BoardEnum[][] playerBoard) {
        BoardEnum cell1 = playerBoard[0][0];
        BoardEnum cell2 = playerBoard[0][1];
        BoardEnum cell3 = playerBoard[0][2];
        BoardEnum cell4 = playerBoard[1][0];
        BoardEnum cell5 = playerBoard[1][1];
        BoardEnum cell6 = playerBoard[1][2];
        BoardEnum cell7 = playerBoard[2][0];
        BoardEnum cell8 = playerBoard[2][1];
        BoardEnum cell9 = playerBoard[2][2];

        return " " + cell1 + " | " + cell2 + " | " + cell3 + "\n" +
                "  -   -   -   -   -   -\n" +
                " " + cell4 + " | " + cell5 + " | " + cell6 + "\n" +
                "  -   -   -   -   -   -\n" +
                " " + cell7 + " | " + cell8 + " | " + cell9 + "\n";

    }
}
