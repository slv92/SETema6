package Model;// Modelul realizeaza calculele necesare
// Nu stie ca View exista


import java.util.Random;

public class WeatherModel {

 // Fiecare variabila are valoarea ceruta de problema : temperatura si viteza vantului


    private int temperatureValue;
    private int windSpeedValue;

    /**
     * functia returneaza valoarea temperaturii
     * @return
     */

    public int getTemperatureValue(){

        /**
         * functia pentru generare de numere random am gasit-o pe google
         */
        Random r = new Random();
        int Low = 10;
        int High = 100;
        temperatureValue = r.nextInt(High-Low) + Low;
        return temperatureValue;

    }

    /**
     * functia returneaza valoarea vitezei vantului
     * @return
     */
    public int getWindSpeedValue(){

        Random r = new Random();
        int Low = 10;
        int High = 100;
        windSpeedValue = r.nextInt(High-Low) + Low;
        return windSpeedValue;

    }
}
