module com.example.auxion {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.auxion to javafx.fxml;
    exports com.example.auxion;
}