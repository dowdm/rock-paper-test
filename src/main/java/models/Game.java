package models;

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
        if(userOne.equals(userTwo)){
            return "It's a draw!";
        } else if (userOne.equals("rock") && userTwo.equals("scissors")) {
            return "Rock wins!";
        } else if (userOne.equals("scissors") && userTwo.equals("paper")){
            return "Scissors wins!";
        } else if (userOne.equals("paper") && userTwo.equals("rock")){
            return "Paper wins!";
        } else {
            return null;
        }
    }
}
