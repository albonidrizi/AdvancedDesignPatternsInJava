package TemplateDesignPattern;

// Concrete Subclass 1: CricketGame
public class CricketGame extends Game {
    @Override
    protected void initialize() {
        System.out.println("Cricket Game Initialized! Playing 2 innings.");
    }

    @Override
    protected void startGame() {
        System.out.println("Cricket Game Started! Batting and Bowling.");
    }

    @Override
    protected void endGame() {
        System.out.println("Cricket Game Finished! Displaying Scores.");
    }
}
