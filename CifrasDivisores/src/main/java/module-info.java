module com.dcgallaga.cifrasdivisores {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dcgallaga.cifrasdivisores to javafx.fxml;
    exports com.dcgallaga.cifrasdivisores;
}
