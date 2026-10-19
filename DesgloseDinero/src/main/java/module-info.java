module com.dcgallaga.desglosedinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dcgallaga.desglosedinero to javafx.fxml;
    exports com.dcgallaga.desglosedinero;
}
