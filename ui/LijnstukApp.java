package ui;

import domain.Punt;
import domain.Tekening;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class LijnstukApp {
    private Punt startpunt;
    private Punt eindpunt;

    public LijnstukApp(GridPane root, Tekening tekening) {
        invoerXLabel =  new Label("Geef de x-coördinaat van het punt ");
        invoerX= new TextField();
        invoerYLabel = new Label("Geef de y-coördinaat van het punt ");
        invoerY = new TextField();invoerXLabel =  new Label("Geef de x-coördinaat van het punt ");
        invoerX= new TextField();
        invoerYLabel = new Label("Geef de y-coördinaat van het punt ");
        invoerY = new TextField();
    }
}
