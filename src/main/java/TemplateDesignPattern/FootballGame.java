package TemplateDesignPattern;

// Concrete Subclass 2: FootballGame
public class FootballGame extends Game {
    @Override
    protected void initialize() {
        System.out.println("Football Game Initialized! Playing 2 halves.");
    }

    @Override
    protected void startGame() {
        System.out.println("Football Game Started! Attacking and Defending.");
    }

    @Override
    protected void endGame() {
        System.out.println("Football Game Finished! Displaying Scores.");
    }
}
