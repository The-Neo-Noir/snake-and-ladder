import com.bullraider.oop.board.GameBoard;
import com.bullraider.oop.Player;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    @Test
    public void whenPlayerIsCreated_shouldReturnCurrentSquareAsZero() {

        GameBoard gameBoard = new GameBoard();
        Player p = new Player("PLayer1", gameBoard);
        int currentSquare = p.getCurrentSquare();
        assertEquals(0, currentSquare);
    }

}
