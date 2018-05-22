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
}
