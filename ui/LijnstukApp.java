package ui;

import domain.DomainException;
import domain.LijnStuk;
import domain.Punt;
import domain.Tekening;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class LijnstukApp {
    private Punt startpunt;
    private Punt eindpunt;
    private Label invoerXLabels, invoerYLabels, invoerXLabele, invoerYLabele;
    private TextField invoerXstart, invoerYstart;
    private TextField invoerXeind, invoerYeind;

    private Alert foutenboodschap = new Alert(Alert.AlertType.WARNING);


    public LijnstukApp(GridPane root, Tekening tekening) {
        invoerXLabels =  new Label("Geef de x-coördinaat van het startpunt ");
        invoerXstart = new TextField();
        invoerYLabels = new Label("Geef de y-coördinaat van het startpunt ");
        invoerYstart = new TextField();
        invoerXLabele =  new Label("Geef de x-coördinaat van het eindpunt ");
        invoerXeind = new TextField();
        invoerYLabele = new Label("Geef de y-coördinaat van het eindpunt ");
        invoerYeind = new TextField();




        root.add(invoerXLabels,0,0);
        root.add(invoerXstart,1,0);

        invoerXstart.setOnAction(eventIngaveX ->{
            try {
                Integer.parseInt(invoerXstart.getText());
                root.add(invoerYLabels, 0, 1);
                root.add(invoerYstart, 1, 1);
            }
            catch(NumberFormatException e){
                invoerXstart.clear();
                foutenboodschap.setTitle("Warning");
                foutenboodschap.setContentText("x coördinaat moet een geheel getal zijn");
                foutenboodschap.showAndWait();
            }
        });

        invoerYstart.setOnAction(eventIngaveY -> {
            try {
                startpunt = new Punt(Integer.parseInt(invoerXstart.getText()), Integer.parseInt(invoerYstart.getText()));
                /*
                root.getChildren().clear();

                Text uitvoer = new Text();
                uitvoer.setText(punt.toString());
                root.add(uitvoer, 0, 0);

                 */
            } catch(NumberFormatException e){

                invoerYstart.clear();

                foutenboodschap.setTitle("Warning");
                foutenboodschap.setContentText("y coördinaat moet een geheel getal zijn");
                foutenboodschap.showAndWait();
            }
        });

        root.add(invoerXLabele,0,0);
        root.add(invoerXeind,1,0);

        invoerXeind.setOnAction(eventIngaveX ->{
            try {
                Integer.parseInt(invoerXeind.getText());
                root.add(invoerYLabele, 0, 1);
                root.add(invoerYeind, 1, 1);
            }
            catch(NumberFormatException e){
                invoerXeind.clear();
                foutenboodschap.setTitle("Warning");
                foutenboodschap.setContentText("x coördinaat moet een geheel getal zijn");
                foutenboodschap.showAndWait();
            }
        });

        invoerYeind.setOnAction(eventIngaveY -> {
            try {
                eindpunt = new Punt(Integer.parseInt(invoerXstart.getText()), Integer.parseInt(invoerYstart.getText()));
                /*
                root.getChildren().clear();

                Text uitvoer = new Text();
                uitvoer.setText(punt.toString());
                root.add(uitvoer, 0, 0);

                 */
            } catch(NumberFormatException e){

                invoerYeind.clear();

                foutenboodschap.setTitle("Warning");
                foutenboodschap.setContentText("y coördinaat moet een geheel getal zijn");
                foutenboodschap.showAndWait();
            }
        });
        root.getChildren().clear();
        LijnStuk lijn = null;
        try {
            lijn = new LijnStuk(startpunt, eindpunt);
        } catch (DomainException e) {
            foutenboodschap.setTitle("Warning");
            foutenboodschap.setContentText("Deze coordinaten vormen geen geldig lijnstuk");
            foutenboodschap.showAndWait();
        }
        Text uitvoer = new Text();
        uitvoer.setText(lijn.toString());
        root.add(uitvoer, 0, 0);
    }
}
