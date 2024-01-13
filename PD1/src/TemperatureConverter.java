import java.util.Scanner;
public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user for temperature and unit
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().charAt(0);

        // Perform conversions
        double convertedCelsius = 0;
        double convertedFahrenheit = 0;
        double convertedKelvin = 0;

        switch (Character.toUpperCase(unit)) {
            case 'C':
                convertedCelsius = temperature;
                convertedFahrenheit = celsiusToFahrenheit(temperature);
                convertedKelvin = celsiusToKelvin(temperature);
                break;
            case 'F':
                convertedCelsius = fahrenheitToCelsius(temperature);
                convertedFahrenheit = temperature;
                convertedKelvin = fahrenheitToKelvin(temperature);
                break;
            case 'K':
                convertedCelsius = kelvinToCelsius(temperature);
                convertedFahrenheit = kelvinToFahrenheit(temperature);
                convertedKelvin = temperature;
                break;
            default:
                System.out.println("Invalid unit input. Please enter C, F, or K.");
                System.exit(1);
        }

        // Display the converted values
        System.out.println("Converted values:");
        System.out.println("Celsius: " + convertedCelsius + " °C");
        System.out.println("Fahrenheit: " + convertedFahrenheit + " °F");
        System.out.println("Kelvin: " + convertedKelvin + " K");
    }

    // Conversion methods
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }



	}



