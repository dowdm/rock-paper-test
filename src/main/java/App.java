import models.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;






public class App {
    public static void main(String[] args) {
        boolean programRunning = true;
        while(programRunning){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Rock, Paper, Scissor. Don't peek at your opposition's entry");
            try{
                Game game = new Game();
                System.out.println("Player 1, please enter rock, scissors, or paper.");
                String pOneInput = bufferedReader.readLine();

                if(game.validateInput(pOneInput) == false){
                    System.out.println("Sorry, that isn't a valid choice");

                } else {
                    System.out.println("Player 2, please enter rock, scissors, or paper.");
                    String pTwoInput = bufferedReader.readLine();
                    if(game.validateInput(pTwoInput) == false){
                        System.out.println("Sorry, that isn't a valid choice");

                    } else {
                        System.out.println(game.winCheck(pOneInput,pTwoInput));
                    }
                }


            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
