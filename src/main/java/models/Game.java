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
        if (userOne.equals("rock") && userTwo.equals("scissors")) {
            return "Rock wins!";
        } else {
            return null;
        }
    }
}
