package com.dcgallaga.desglosedinero;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtDinero;
    @FXML
    private Label lblResultados;
    
// conectar boton 
    @FXML
    private void desglosar(ActionEvent event) {
        // 1. Tomamos el texto de la caja y lo convertimos a un número entero
        int cantidad = Integer.parseInt(txtDinero.getText());
        // 2. Calculamos billetes y monedas 
        int b500 = cantidad / 500;      // Cuántos billetes caben
        cantidad = cantidad % 500;      // Cuánto dinero sobra para el siguiente paso
        
        int b200= cantidad / 200;
        cantidad = cantidad % 200;
        
        int b100 = cantidad / 100;
        cantidad = cantidad % 100;
        
        int b50 = cantidad / 50;
        cantidad = cantidad % 50;
        
        int b20 = cantidad / 20;
        cantidad = cantidad % 20;
        
        int m10 = cantidad / 10;
        cantidad = cantidad % 10;
        
        int m5 = cantidad / 5;
        cantidad = cantidad % 5;
        
        int m2 = cantidad / 2;
        cantidad = cantidad % 2;
        
        int m1 = cantidad; 
        
        String textoFinal = b500 + "\n" + b200 + "\n" + b100 + "\n" + b50 + "\n" +  b20 + "\n" + m10 + "\n" + m5 + "\n" + m2 + "\n" + m1;
        lblResultados.setText(textoFinal);
    }
    // conectar el boton 
        @FXML
        private void limpiar(ActionEvent event) {
        txtDinero.clear();
        lblResultados.setText("");
    }
}
    
        

        

        
        