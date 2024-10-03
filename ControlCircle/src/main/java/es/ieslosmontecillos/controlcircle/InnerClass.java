/**
 * 2º DAM DI
 * @author: Shihan Wei
 * 4.3.1. InnerClass
 * Fecha: 02/10/2024
 */

package es.ieslosmontecillos.controlcircle;

/* Importamos las librerías necesarias*/
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class InnerClass extends Application {

    Circle circle = new Circle();

    @Override
    public void start(Stage primaryStage) {

        /* creamos contenedores para los elementos*/
        Pane root = new Pane();
        root.setPrefSize(400, 400);

        /*Ajustamos las propiedades del cícrculo*/
        circle.setRadius(10);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setCenterX(200);
        circle.setCenterY(175);


        Button btn_enlarge = new Button("Enlarge");
        btn_enlarge.setLayoutX(100);
        btn_enlarge.setLayoutY(350);
        Button btn_shrink = new Button("Shrink");
        btn_shrink.setLayoutX(250);
        btn_shrink.setLayoutY(350);

        /*Llamamos a los escuchadores de los botones */
        btn_enlarge.setOnAction(new EnlargeCircle());
        btn_shrink.setOnAction(new ShrinkCircle());

        /*añadimos los elementos al root*/
        root.getChildren().addAll(circle, btn_enlarge, btn_shrink);

        Scene scene = new Scene(root);

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