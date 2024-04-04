import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BoardTest {
    Board board = new Board();
    @Test
    public void checkThatThereIsABoard() {

        int[][] playerBoard = board.getCurrentBoard();
        assertNotNull(playerBoard);
    }

    @Test
    public void checkThatBoardIsEmpty(){

        BoardEnum [][] playerBoard = board.getEmptyBoard();
        BoardEnum EMPTY = BoardEnum.EMPTY;
        int emptyCounter = 0;
        for (int i = 0; i <playerBoard[0].length ; i++) {
            for (int j = 0; j < playerBoard.length ; j++) {
                if (playerBoard[i][j] == EMPTY) emptyCounter++;
            }
        }
        assertEquals(9, emptyCounter);
    }
    @Test
    public void testBoardDisplay(){

        BoardEnum [][] playerBoard = board.getEmptyBoard();
        String expectedDisplay = """
                           EMPTY | EMPTY | EMPTY
                            -   -   -   -   -   -
                           EMPTY | EMPTY | EMPTY
                            -   -   -   -   -   -
                           EMPTY | EMPTY | EMPTY
                          """;
       String actualDisplay = board.display(playerBoard);

       assertEquals(expectedDisplay, actualDisplay);

    }
    @Test
    public void testBoardDisplayCorrectly(){

        BoardEnum [][] playerBoard = board.getEmptyBoard();
        playerBoard[0][0] = BoardEnum.X;
        String expectedDisplay =  """
                           X | EMPTY | EMPTY
                            -   -   -   -   -   -
                           EMPTY | EMPTY | EMPTY
                            -   -   -   -   -   -
                           EMPTY | EMPTY | EMPTY
                          """;
        String actualDisplay = board.display(playerBoard);
        System.out.println(actualDisplay);
        assertEquals(expectedDisplay, actualDisplay);

    }
}
