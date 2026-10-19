package com.dcgallaga.calculadoraedad;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    // El @FXML es el "puente" mágico. Le dice a Java: "Busca estos nombres en Scene Builder"
    @FXML
    private TextField txtFecha;

    @FXML
    private Label lblResultado;

    // Este es el método que se activa con el botón Calcular
    @FXML
    private void calcularEdad(ActionEvent event) {
        // 1. Le enseñamos a Java el formato exacto en el que escribirán la fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // 2. Tomamos el texto de tu caja (txtFecha) y lo convertimos a una fecha matemática
        LocalDate fechaNacimiento = LocalDate.parse(txtFecha.getText(), formato);
        LocalDate fechaActual = LocalDate.now();

        // 3. La clase Period hace la resta exacta entre ambas fechas
        Period periodo = Period.between(fechaNacimiento, fechaActual);

        // 4. Mandamos el texto ganador a tu etiqueta vacía de abajo (lblResultado)
        lblResultado.setText("Tiene " + periodo.getYears() + " años con " + periodo.getMonths() + " meses");
    }

    // Este es el método que se activa con el botón Limpiar
    @FXML
    private void limpiarCampos(ActionEvent event) {
        txtFecha.clear(); // Borra la caja de texto
        lblResultado.setText(""); // Vuelve a dejar vacía la etiqueta de abajo
    }
}