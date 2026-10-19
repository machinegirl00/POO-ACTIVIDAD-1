package com.dcgallaga.tablademultiplicar;


import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private  TextField txtNumero;
    @FXML
    private  Label lblResultado;
    
    @FXML
    private void calcular (ActionEvent event){
        
        String numeroCadena=txtNumero.getText();
        int numeroEntero= Integer.parseInt(numeroCadena);
        
       StringBuilder listaResultados= new StringBuilder();
       int Resultado=0;
       for (int x=1;x<=10;x++){
           Resultado=numeroEntero*x;
           
           listaResultados.append(numeroEntero + " x " + x + " = " + Resultado + "\n");
       }
       lblResultado.setText(String.valueOf(listaResultados));  
    }
     @FXML
    private void limpiar (ActionEvent event){
        txtNumero.clear();
        lblResultado.setText("");
    }   
    }
    
  

