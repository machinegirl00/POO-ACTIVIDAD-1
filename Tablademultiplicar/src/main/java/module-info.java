module com.dcgallaga.tablademultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dcgallaga.tablademultiplicar to javafx.fxml;
    exports com.dcgallaga.tablademultiplicar;
}
