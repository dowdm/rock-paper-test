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

        @Test
        public void winCheck_checkForRockOverScissors_rockwins() throws Exception {
            Game testGame = new Game();
            String expected = "Rock wins!";
            assertEquals(expected, testGame.winCheck("rock", "scissors"));
        }
        @Test
        public void winCheck_checkForRockOverScissors_rockwins() throws Exception {
            Game testGame = new Game();
            String expected = "Rock wins!";
            assertEquals(expected, testGame.winCheck("rock", "scissors"));
        }





}