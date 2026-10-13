
public class TemperatureConverter {
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = 37.0;

        double convertedCelsius = (fahrenheit - 32) * 5.0 / 9;
        double convertedFahrenheit = celsius * 9.0 / 5 + 32;

        System.out.printf("%.1f°F = %.1f°C%n", fahrenheit, convertedCelsius);
        System.out.printf("%.1f°C = %.1f°F%n", celsius, convertedFahrenheit);
    }
}
