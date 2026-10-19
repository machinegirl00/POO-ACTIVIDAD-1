package com.dcgallaga.controldegastos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class PrimaryController {

   
    @FXML
    private TextField txtAlimentos;
    @FXML
    private TextField txtRefrigerios;
    @FXML
    private TextField txtTransporte;
    @FXML
    private TextField txtTelefonia;
    @FXML
    private TextField txtOtros;
    @FXML
    private TextField txtTotal;
    @FXML
    private TextField txtMasalto;
    
    @FXML
    private void calcular (ActionEvent event){
       String numeroCadenaA =txtAlimentos.getText();
       int numeroEnteroA=Integer.parseInt(numeroCadenaA);
       String numeroCadenaR =txtRefrigerios.getText();
       int numeroEnteroR=Integer.parseInt(numeroCadenaR);
       String numeroCadenaT =txtTransporte.getText();
       int numeroEnteroT=Integer.parseInt(numeroCadenaT);
       String numeroCadenaTl =txtTelefonia.getText();
       int numeroEnteroTl =Integer.parseInt(numeroCadenaTl);
       String numeroCadenaO =txtOtros.getText();
       int numeroEnteroO =Integer.parseInt(numeroCadenaO);
       
       int total= numeroEnteroA+ numeroEnteroR+ numeroEnteroT+ numeroEnteroTl+ numeroEnteroO;
       txtTotal.setText(String.valueOf(total));
       
       int Masalto;
       if((numeroEnteroA > numeroEnteroR) && (numeroEnteroA > numeroEnteroT) &&  (numeroEnteroA > numeroEnteroTl) && (numeroEnteroA > numeroEnteroO) ){
           Masalto=numeroEnteroA;
           if(Masalto==numeroEnteroA){
               txtMasalto.setText("ALIMENTOS");
           }
       }
       if((numeroEnteroR > numeroEnteroA) && (numeroEnteroR> numeroEnteroT) && (numeroEnteroR > numeroEnteroTl) &&  (numeroEnteroR > numeroEnteroO) ){
           Masalto=numeroEnteroR;
           if(Masalto==numeroEnteroR){
               txtMasalto.setText("REFRIGERIOS");
           }
       }
       if((numeroEnteroT > numeroEnteroA) && (numeroEnteroT > numeroEnteroR) && (numeroEnteroR > numeroEnteroTl) &&  (numeroEnteroT > numeroEnteroO) ){
           Masalto=numeroEnteroT;
           if(Masalto==numeroEnteroT){
               txtMasalto.setText("TRANSPORTE");
           }
       }
      if((numeroEnteroTl > numeroEnteroA) && (numeroEnteroTl > numeroEnteroR) && (numeroEnteroTl > numeroEnteroT) &&  (numeroEnteroTl > numeroEnteroO) ){
           Masalto=numeroEnteroTl;
           if(Masalto==numeroEnteroTl){
               txtMasalto.setText("TELEFONIA");
       }
      }
           
       if((numeroEnteroO > numeroEnteroA) && (numeroEnteroO > numeroEnteroR) && (numeroEnteroO > numeroEnteroT) &&  (numeroEnteroO > numeroEnteroTl) ){
           Masalto=numeroEnteroO;
           if(Masalto==numeroEnteroO){
               txtMasalto.setText("OTROS");
       
        }
       }
       
    }
    
       
           
    @FXML
    private void limpiar (ActionEvent event){
           txtAlimentos.clear();
           txtTransporte.clear();
           txtTelefonia.clear();
           txtRefrigerios.clear();
           txtOtros.clear();
           txtTotal.clear();
           txtMasalto.clear();
       }
           
       }
       


