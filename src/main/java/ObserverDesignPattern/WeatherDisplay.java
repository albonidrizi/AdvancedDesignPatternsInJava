package ObserverDesignPattern;

// Concrete Observer (WeatherDisplay)
public class WeatherDisplay implements Observer {
    private String displayName;

    public WeatherDisplay(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void update(float temperature) {
        System.out.println(displayName + " displaying temperature: " + temperature + "°C");
    }
}
