/**
 * 2º DAM DI
 * Autora: Shihan Wei
 * 4.3.1. InnerClass
 */

package es.ieslosmontecillos.controlcircle;

/* Importamos las librerías necesarias*/
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    Circle circle = new Circle();

    @Override
    public void start(Stage primaryStage) {

        /*Ajustamos las propiedades del cícrculo*/
        circle.setRadius(20);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        /* Creamos los botones para maximizar y minimizar el círculo */
        Button btn1 = new Button("Enlarge");
        Button btn2 = new Button("Shrink");

        /*Llamamos a los escuchadores de los botones */
        btn1.setOnAction(new EnlargeCircle());
        btn2.setOnAction(new ShrinkCircle());

        /* creamos contenedores para los elementos*/
        VBox vbox = new VBox();
        HBox hbox = new HBox();

        /*Colocamos los botones en un HBox y eso junto al círculo lo colocamos en un VBox
        y establecemos los tamaños*/
        hbox.getChildren().addAll(btn1, btn2);
        vbox.getChildren().addAll(circle, hbox);

        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(20);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(20);
        vbox.setPrefSize(250, 250);

        Scene scene = new Scene(vbox);

        primaryStage.setTitle("Control Circle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /* Aumenta el círculo el doble de su radio */
    class EnlargeCircle implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            circle.setRadius(circle.getRadius() *2);
        }
    }

    /* Encoge el cículo a la mitad del radio */
    class ShrinkCircle implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            circle.setRadius(circle.getRadius() / 2);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }


}