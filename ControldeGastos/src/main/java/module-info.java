module com.dcgallaga.controldegastos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dcgallaga.controldegastos to javafx.fxml;
    exports com.dcgallaga.controldegastos;
}
