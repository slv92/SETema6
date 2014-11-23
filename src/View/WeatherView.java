package View;// Acesta este View-ul
// Va afisa ceea ce  doreste user-ul


import javax.swing.*;
import java.awt.event.ActionListener;

public class WeatherView extends JFrame{

    /**
     * Elementele View-ului
     */

    private JLabel temperatureLabel= new JLabel("Temperatura:");
    private JLabel gradesLabel= new JLabel("*C");
    private JTextField firstNumber  = new JTextField("20");
    private JLabel windSpeedLabel = new JLabel("Viteza vantului:");
    private JLabel speedLabel = new JLabel("km/s");
    private JTextField secondNumber = new JTextField("30");
    private JButton updateWeatherButton = new JButton("Update Weather");


    public WeatherView(){

        /**
         * Adaug elementele View-ului
         */
        JPanel weatherPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        weatherPanel.add(temperatureLabel);
        weatherPanel.add(firstNumber);
        weatherPanel.add(gradesLabel);
        weatherPanel.add(windSpeedLabel);
        weatherPanel.add(secondNumber);
        weatherPanel.add(speedLabel);
        weatherPanel.add(updateWeatherButton);


        this.add(weatherPanel);



    }



    public void setTemperatureNumbers(int solution){

        firstNumber.setText(Integer.toString(solution));

    }

    public void setWindSpeedNumbers(int solution){

        secondNumber.setText(Integer.toString(solution));

    }

    /**
     * Daca butonul de Update este apasat, se va executa o metoda din Controller numita actionPerformed
     * @param listenForWeatherButton
     */


    public void addWeatherListener(ActionListener listenForWeatherButton){

        updateWeatherButton.addActionListener(listenForWeatherButton);

    }

    // Deschide un mesaj de eroare

    public void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);

    }

}