package controller;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import model.Data;

import java.util.Collections;
import java.util.List;

/**
 * Controller for the main selection menu
 */
public class MainViewController {

    @FXML
    private BarChart displayChart;

    @FXML
    public void startBubbleSort(){
        displayChart.getData().clear();
        List<Integer> generatedList = new Data().generateSampleData(10);
        updateGraph(generatedList);

    }

    @FXML
    public void updateGraph(List<Integer> list){

        BarChart.Series<String, Number> series = new XYChart.Series<>();

        Integer i = 0;
        for (Integer item : list) {
            System.out.println(item);
            series.getData().add(new BarChart.Data<>(i.toString(), item));
            i++;
        }

        displayChart.getData().add(series);
    }

}
