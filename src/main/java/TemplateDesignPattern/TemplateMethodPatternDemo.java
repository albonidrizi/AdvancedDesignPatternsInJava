package TemplateDesignPattern;

/**
 *  @author Albon Idrizi https://www.linkedin.com/in/albonidrizi
 *
 *  @TheTemplateMethodPattern is a behavioral design pattern that defines a skeleton of an algorithm in an operation,
 *  deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
 *
 * @Benefits:
 * @1. Code Reusability: The Template Method pattern allows you to reuse the same skeleton of an algorithm in different subclasses,
 * which can reduce the amount of code you need to write and maintain.
 * @2. Flexibility: The Template Method pattern allows you to change the behavior of an algorithm without changing its structure,
 * which can make your code more flexible and easier to maintain.
 * @3. Separation of Concerns: The Template Method pattern separates the algorithm's skeleton from the steps that can be customized,
 * which can improve code readability and maintainability.
 * @4. Testability: The Template Method pattern makes it easier to test the behavior of an algorithm,
 * which can help you ensure that your code is working as expected.
 * @WhentoUse:
 * @1. When you need to define a skeleton of an algorithm that can be customized by subclasses.
 * @2. When you want to reuse the same skeleton of an algorithm in different subclasses.
 * @3. When you want to change the behavior of an algorithm without changing its structure.
 */
// Client Class
public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        Game cricketGame = new CricketGame();
        cricketGame.play();

        System.out.println();

        Game footballGame = new FootballGame();
        footballGame.play();
    }
}
