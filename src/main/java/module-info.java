module sample.parcial1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.parcial1 to javafx.fxml;
    exports sample.parcial1;
}