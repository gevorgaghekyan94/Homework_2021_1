package com.company;

public class TemperatureConverter {

    public static int convertFahrenheitToCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static int convertFahrenheitToKelvin(int fahrenheit) {
        return (int) ((fahrenheit - 32) * 5 / 9 + 273.15);
    }

    public static int convertCelsiusToFahrenheit(int celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static int convertCelsiusToKelvin(int celsius) {
        return (int) (celsius + 273.15);
    }

    public static int convertKelvinToFahrenheit(int kelvin) {
        return (int) ((kelvin - 273.15) * 9 / 5 + 32);
    }

    public static int convertKelvinToCelsius(int kelvin) {
        return (int) (kelvin - 273.15);
    }
}
