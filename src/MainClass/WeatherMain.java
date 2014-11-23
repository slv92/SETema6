package MainClass;

import Controller.WeatherController;
import Model.WeatherModel;
import View.WeatherView;


/**
 * Clasa Main a programului
 */
public class WeatherMain {

    public static void main(String[] args) {

        WeatherView theView = new WeatherView();

        WeatherModel theModel = new WeatherModel();

        WeatherController theController = new WeatherController(theView,theModel);

        theView.setVisible(true);

    }
}