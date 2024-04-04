package turtle;

public class SketchPad {
    private int numberOfRow;
    private int numberOfColum;
    private int[][] board;

    public SketchPad(int numberOfRow, int numberOfColum) {
        board = new int[numberOfRow][numberOfColum];
        this.numberOfRow = numberOfRow;
        this.numberOfColum = numberOfColum;
    }

    public int[][] getBoard(){
        return board;
    }
}
