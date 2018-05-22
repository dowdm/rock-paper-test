package models;

import java.util.Map;
import java.util.HashMap;

public class Game {
    public  boolean validateInput(String userInput){
        String testString = userInput.toLowerCase();
        if(userInput.equals("rock")||userInput.equals("paper")||userInput.equals("scissors")){
            return true;
        } else {
            return false;
        }
    }



    public String winCheck(String userOne, String userTwo){
        Map <String, String> playerEntries = new HashMap<String, String>();
        playerEntries.put(userOne, "player 1");
        playerEntries.put(userTwo, "player 2");

        if(userOne.equals(userTwo)){
            return "It's a draw!";
        } else if ((userOne.equals("rock") && userTwo.equals("scissors")) || (userOne.equals("scissors") && userTwo.equals("rock"))) {
            String winner = playerEntries.get("rock");
            return "Rock wins! Congratulations " + winner;
        } else if ((userOne.equals("scissors") && userTwo.equals("paper")) || (userOne.equals("paper") && userTwo.equals("scissors"))){
            String winner = playerEntries.get("scissors");
            return "Scissors wins! Congratulations " + winner;
        } else if ((userOne.equals("paper") && userTwo.equals("rock")) || (userOne.equals("rock") && userTwo.equals("paper"))){
            String winner = playerEntries.get("paper");
            return "Paper wins! Congratulations " + winner;
        } else {
            return null;
        }
    }
}
