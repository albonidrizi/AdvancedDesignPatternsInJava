package TemplateDesignPattern;

// Abstract Class
public abstract class Game {
    // Template method
    public final void play() {
        initialize();
        startGame();
        endGame();
    }

    protected abstract void initialize();
    protected abstract void startGame();
    protected abstract void endGame();
}

