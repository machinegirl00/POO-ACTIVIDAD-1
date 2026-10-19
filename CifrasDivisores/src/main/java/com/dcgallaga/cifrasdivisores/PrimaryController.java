package com.dcgallaga.cifrasdivisores;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class PrimaryController {

    @FXML
    private TextField txtNumero;
    @FXML
    private TextField txtCifras;
    @FXML
    private TextField txtImpar;
    @FXML
    private TextField txtPar;
    @FXML
    private TextField txtTotal;
    @FXML
    private TextField txtCmayor;
    @FXML
    private TextField txtCmenor;
    @FXML
    private Label lblDivisores;
    
    @FXML 
    private void analizar (ActionEvent event){
        
     String numeroCadena=txtNumero.getText();
    // 1. Convertimos el texto ingresado a un número entero
    int numeroOriginal = Integer.parseInt(txtNumero.getText());
    // 2. Contar las cifras
    int cantidadCifras = String.valueOf(numeroOriginal).length();
    //3.Directo a la caja de texto
    txtCifras.setText(String.valueOf(cantidadCifras));
    // Sumar impares
    //Este ciclo for convierte una cadena en un arrego char
    int sumaPar=0;
    int sumaImpar=0;
    int sumaTotal=0;
    
    int cifraMayor = Character.getNumericValue(numeroCadena.charAt(0));
    int cifraMenor = Character.getNumericValue(numeroCadena.charAt(0));

    for (char c : numeroCadena.toCharArray()) {
        int digito = Character.getNumericValue(c);
        if((digito%2)!= 0){
            sumaImpar+= digito;
        } else{
            sumaPar+= digito; 
        }
        
        sumaTotal+=digito;
        if (digito > cifraMayor) {
                cifraMayor = digito; // Encontramos uno más grande, actualizamos el mayor
            }
            
            if (digito < cifraMenor) {
                cifraMenor = digito; // Encontramos uno más pequeño, actualizamos el menor
            }
        
        
    }
    
    //  StringBuilder para ir juntando todos los divisores en una lista :3
    StringBuilder listaDivisores = new StringBuilder();
        
        for (int x = 1; x <= numeroOriginal; x++) {
            // Si el residuo es 0, significa que 'x' divide exactamente al número
            if (numeroOriginal % x == 0) {
                listaDivisores.append(x).append("\n"); // Agrega el número y un salto de línea abajo
            }
        }
   
    
    txtImpar.setText(String.valueOf(sumaImpar));
    txtPar.setText(String.valueOf(sumaPar));
    txtTotal.setText(String.valueOf(sumaTotal));
    txtCmayor.setText(String.valueOf(cifraMayor));
    txtCmenor.setText(String.valueOf(cifraMenor));
    lblDivisores.setText(String.valueOf(listaDivisores));
}
    @FXML 
    private void limpiar (ActionEvent event){
        txtNumero.clear();
        txtCifras.clear();
        txtPar.clear();
        txtImpar.clear();
        txtCmayor.clear();
        txtCmenor.clear();
        txtTotal.clear();
        lblDivisores.setText("");
    }
}    
    
   
    
   

