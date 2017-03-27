package controller;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import model.Data;
import sort.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/**
 * Controller for the main selection menu
 */
public class MainViewController {

    @FXML
    private Canvas drawCanvas;

    @FXML
    private Slider sampleSizeSlider;

    private SortFactory sortFactory;
    private SortAlgorithm sortAlgorithm;
    private Data data;

    @FXML
    public void initialize(){
        data = new Data();
        sortFactory = new SortFactory();
        generateRandom();
    }

    @FXML
    public void generateRandom(){
        data.generateRandomData((int) sampleSizeSlider.getValue());
        sortAlgorithm = sortFactory.createBubbleSort(data.getGeneratedData());
        updateGraph(data.getGeneratedData());
    }

    @FXML
    public void generateReversed(){
        data.generateReversedData((int) sampleSizeSlider.getValue());
        sortAlgorithm = new BubbleSort(data.getGeneratedData());
        updateGraph(data.getGeneratedData());
    }

    @FXML
    public void startBubbleSort(){
        List<Integer> copy = new ArrayList<>(data.getGeneratedData());
        sortAlgorithm = sortFactory.createBubbleSort(copy);
        updateGraph(copy);
    }

    @FXML
    public void startInsertionSort(){
        List<Integer> copy = new ArrayList<>(data.getGeneratedData());
        sortAlgorithm = sortFactory.createInsertionSort(copy);
        updateGraph(copy);
    }

    @FXML
    public void startQuickSort(){
        List<Integer> copy = new ArrayList<>(data.getGeneratedData());
        sortAlgorithm = sortFactory.createQuickSort(copy);
        updateGraph(copy);
    }

    /**
     * Draws the current array on a canvas, to visualise the sorting algorithm
     * @param list to be drawn on the canvas
     */
    private void updateGraph(List<Integer> list){
        GraphicsContext gc = drawCanvas.getGraphicsContext2D();

        double canvasHeight = drawCanvas.getHeight();
        double canvasWidth = drawCanvas.getWidth();
        double spacing = canvasWidth * 0.1 / list.size();
        double elemWidth = canvasWidth / list.size(); // Same for every element
        double elemHeight = canvasHeight / list.size();
        int currentElem = 0;

        gc.clearRect(0,0, canvasWidth, canvasHeight);
        gc.setFill(Color.BLUE);

        for (Integer elem : list) {
            double currentElemStartX = elemWidth * currentElem;
            double currentElemHeight = elemHeight * elem;
            double currentElemStartY = canvasHeight - currentElemHeight;
            gc.fillRect(currentElemStartX, currentElemStartY, elemWidth - spacing, currentElemHeight);
            currentElem++;
        }
    }

    @FXML
    public void nextStep() {
        sortAlgorithm.sort();
        updateGraph(sortAlgorithm.getList());
    }

    /**
     * Sorts with a delay of 100 ms per step
     * TODO: in different class
     */
    @FXML
    public void runFull() {
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {
                synchronized (sortAlgorithm) {
                    while (!sortAlgorithm.sort()) {
                        updateGraph(sortAlgorithm.getList());
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }
}
