module es.ieslosmontecillos.controlcircle {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens es.ieslosmontecillos.controlcircle to javafx.fxml;
    exports es.ieslosmontecillos.controlcircle;
}