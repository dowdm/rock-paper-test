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
        public void winCheck_checkForScissorsOverPaper_scissorswins() throws Exception {
            Game testGame = new Game();
            String expected = "Scissors wins!";
            assertEquals(expected, testGame.winCheck("scissors", "paper"));
        }

        @Test
        public void winCheck_checkForPaperOverRock_paperwins() throws Exception {
            Game testGame = new Game();
            String expected = "Paper wins!";
            assertEquals(expected, testGame.winCheck("paper", "rock"));
        }

        @Test
        public void winCheck_checkForDraw_itsadraw() throws Exception {
            Game testGame = new Game();
            String expected = "It's a draw!";
            assertEquals(expected, testGame.winCheck("paper", "paper"));
        }

        @Test
        public void winCheck_checkForReverseConditions_rockwins() throws Exception {
            Game testGame = new Game();
            String expected = "Rock wins!";
            assertEquals(expected, testGame.winCheck("scissors", "rock"));
        }





}