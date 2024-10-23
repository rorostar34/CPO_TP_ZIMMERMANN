package tp2_convertisseurobjet_zimmermann;

public class Convertisseur {
    // Attribut pour compter le nombre de conversions
    private int nbConversions;

    // Constructeur initialisant le compteur de conversions à 0
    public Convertisseur() {
        this.nbConversions = 0;
    }

    // Méthode pour convertir Celsius en Kelvin
    public float CelsiusVersKelvin(float tempCelsius) {
        nbConversions++;
        return tempCelsius + 273.15f;
    }

    // Méthode pour convertir Kelvin en Celsius
    public float KelvinVersCelsius(float tempKelvin) {
        nbConversions++;
        return tempKelvin - 273.15f;
    }

    // Méthode pour convertir Fahrenheit en Celsius
    public float FahrenheitVersCelsius(float tempFahrenheit) {
        nbConversions++;
        return (tempFahrenheit - 32) * 5 / 9;
    }

    // Méthode pour convertir Celsius en Fahrenheit
    public float CelsiusVersFahrenheit(float tempCelsius) {
        nbConversions++;
        return (tempCelsius * 9 / 5) + 32;
    }

    // Méthode pour convertir Kelvin en Fahrenheit
    public float KelvinVersFahrenheit(float tempKelvin) {
        nbConversions++;
        return (tempKelvin - 273.15f) * 9 / 5 + 32;
    }

    // Méthode pour convertir Fahrenheit en Kelvin
    public float FahrenheitVersKelvin(float tempFahrenheit) {
        nbConversions++;
        return (tempFahrenheit - 32) * 5 / 9 + 273.15f;
    }

    // Redéfinir la méthode toString pour afficher le nombre de conversions
    @Override
    public String toString() {
        return "nb de conversions = " + nbConversions;
    }
}
