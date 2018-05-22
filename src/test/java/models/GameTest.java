package models;

import static org.junit.Assert.*;
import org.junit.*;

public class GameTest{

        @Test
        public void validateInput_checkForRockScissorPaper_true() throws Exception {
            Game testGame = new Game();
            boolean expected = true;
            assertEquals(expected, testGame.validateInput("rock"));
        }


}