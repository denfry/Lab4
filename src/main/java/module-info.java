module com.example.labr4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;
    requires annotations;

    opens com.example.labr4 to javafx.fxml;
    exports com.example.labr4;
}