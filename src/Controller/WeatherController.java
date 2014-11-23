package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.WeatherModel;
import View.WeatherView;

/**
 *Controller-ul coordoneaza View si Model
 */

public class WeatherController {

    private WeatherView theView;
    private WeatherModel theModel;

    public WeatherController(WeatherView theView, WeatherModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        /**
         * Ii spune View-ului ca atunci cand butonul de update este apasat sa execute
         * metoda actionPerformed
         */


        this.theView.addWeatherListener(new WeatherListener());
    }

    class WeatherListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {



            try{

                theView.setTemperatureNumbers(theModel.getTemperatureValue());

                theView.setWindSpeedNumbers(theModel.getWindSpeedValue());

            }

            catch(Exception ex){

                System.out.println(ex);

                theView.displayErrorMessage("Eroare program");

            }

        }

    }

}