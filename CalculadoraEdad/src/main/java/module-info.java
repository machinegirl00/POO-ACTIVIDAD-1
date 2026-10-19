module com.dcgallaga.calculadoraedad {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dcgallaga.calculadoraedad to javafx.fxml;
    exports com.dcgallaga.calculadoraedad;
}
