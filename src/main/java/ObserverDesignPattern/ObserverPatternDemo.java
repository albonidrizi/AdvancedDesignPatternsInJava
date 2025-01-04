package ObserverDesignPattern;

/**
 *  @author Albon Idrizi https://www.linkedin.com/in/albonidrizi
 *
 *  @TheObserverPattern is a behavioral design pattern that allows objects to subscribe to events and be notified when the events occur.
 *
 * @Benefits:
 * @1. Decoupling: The publisher and subscriber are decoupled, which means that they don't need to know about each other's implementation details.
 * @2. Flexibility: The publisher can add or remove subscribers dynamically, and the subscribers can subscribe to multiple publishers.
 * @3. Extensibility: New subscribers can be added without modifying the publisher, and new events can be added without modifying the subscribers.
 * @WhentoUse:
 * @1. When you need to notify multiple objects when a specific event occurs.
 * @2. When you need to decouple the publisher and subscriber.
 * @3. When you need to handle events asynchronously.
 *
 * @Example: Weather Station and Weather Displays (observers) - The weather station is the publisher, and the weather displays are the subscribers. When the temperature changes, the weather station notifies the weather displays, and they display the new temperature.
 *
 * @Note: The Observer Pattern is a good fit for real-time applications where events occur frequently and need to be handled in real-time. For example, in a stock trading application, the stock prices are updated frequently, and the traders need to be notified in real-time when the prices change.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Create the subject (weather station)
        WeatherStation weatherStation = new WeatherStation();

        // Create observers (weather displays)
        WeatherDisplay display1 = new WeatherDisplay("Display 1");
        WeatherDisplay display2 = new WeatherDisplay("Display 2");

        // Register observers with the weather station
        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        // Change the temperature and notify observers
        weatherStation.setTemperature(25.0f);
        weatherStation.setTemperature(30.0f);

        // Remove one observer and notify again
        weatherStation.removeObserver(display1);
        weatherStation.setTemperature(35.0f);
    }
}
