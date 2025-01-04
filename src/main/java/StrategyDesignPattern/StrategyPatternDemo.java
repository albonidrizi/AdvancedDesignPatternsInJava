package StrategyDesignPattern;

/**
 *  @author Albon Idrizi https://www.linkedin.com/in/albonidrizi
 *
 *  @TheStrategyPattern is a behavioral design pattern that allows you to change the behavior of an object at runtime.
 *  It does this by encapsulating the behavior in a separate object called a strategy, which can be swapped out at runtime.
 *
 * @Benefits:
 * @1. Code Decoupling: The client code is decoupled from the specific implementation of the behavior.
 * @2. Flexibility: The client code can change the behavior at runtime by swapping out the strategy object.
 * @3. Extensibility: New strategies can be added without changing the client code.
 * @WhentoUse:
 * @1. When you need to change the behavior of an object at runtime.
 * @2. When you have multiple alternative behaviors and you want to provide a choice to the user.
 * @3. When you want to avoid conditional statements with multiple if-else or switch statements.
 *
 * @Example: Shopping Cart - The ShoppingCart class uses a PaymentStrategy object to perform the payment. The client code can change the payment strategy at runtime by calling the setPaymentStrategy() method.
 *
 * @Note: The Strategy Pattern is a good fit for applications where the behavior of an object needs to be changed at runtime, and where multiple alternative behaviors are available. For example, in a shopping cart application, the payment method can be changed from credit card to PayPal, or from PayPal to cash on delivery, without changing the client code.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Paying with Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "Albon Idrizi"));
        cart.checkout(1500);

        // Paying with PayPal
        cart.setPaymentStrategy(new PayPalPayment("albonidrizi@gmail.com"));
        cart.checkout(2000);
    }
}
