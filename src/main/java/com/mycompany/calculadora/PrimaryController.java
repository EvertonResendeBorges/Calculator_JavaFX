package com.mycompany.calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class PrimaryController implements Initializable {

    @FXML
    private TextField result;
    @FXML
    private Button n1;
    @FXML
    private Button n2;
    @FXML
    private Button n3;
    @FXML
    private Button n4;
    @FXML
    private Button n5;
    @FXML
    private Button n6;
    @FXML
    private Button n7;
    @FXML
    private Button n8;
    @FXML
    private Button n9;
    @FXML
    private Button n0;
    @FXML
    private Button decimal;
    @FXML
    private Button add;
    @FXML
    private Button subtract;
    @FXML
    private Button divide;
    @FXML
    private Button multiply;
    @FXML
    private Button equal;
    @FXML
    private Button Clear;
    
    double value1, value2, calculation;
    String operation;
    boolean dot = true;
    boolean newNumber = false;
  
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    private void n1(ActionEvent event) {
        if(newNumber){
            result.setText("");
            newNumber = false;
        }
        result.setText( result.getText() + "1");
        
    }

    @FXML
    private void n2(ActionEvent event) {
        if(newNumber){
            result.setText("");
            newNumber = false;
        }
        result.setText( result.getText() + "2");
    }

    @FXML
    private void n3(ActionEvent event) {
        if(newNumber){
            result.setText("");
            newNumber = false;
        }
        result.setText( result.getText() + "3");
    }

    @FXML
    private void n4(ActionEvent event) {
        if(newNumber){
            result.setText("");
            newNumber = false;
        }
        result.setText( result.getText() + "4");
    }

    @FXML
    private void n5(ActionEvent event) {
        if(newNumber){
            result.setText("");
            newNumber = false;
        }
        result.setText( result.getText() + "5");
    }

    @FXML
    private void n6(ActionEvent event) {
        if(newNumber){
            result.setText("");
            newNumber = false;
        }
        result.setText( result.getText() + "6");
    }

    @FXML
    private void n7(ActionEvent event) {
        if(newNumber){
            result.setText("");
            newNumber = false;
        }
        result.setText( result.getText() + "7");
    }

    @FXML
    private void n8(ActionEvent event) {
        if(newNumber){
            result.setText("");
            newNumber = false;
        }
        result.setText( result.getText() + "8");
    }

    @FXML
    private void n9(ActionEvent event) {
        if(newNumber){
            result.setText("");
            newNumber = false;
        }
        result.setText( result.getText() + "9");
    }

    @FXML
    private void n0(ActionEvent event) {
        if(newNumber){
            result.setText("");
            newNumber = false;
        }
        result.setText( result.getText() + "0");
    }

    @FXML
    private void decimal(ActionEvent event) {
        if(dot){
            result.setText(result.getText() + ".");
            dot = false;
        }
        
    }

    @FXML
    private void add(ActionEvent event) {
   
        if(value1 != 0){
            value2 = Double.parseDouble(result.getText());
            calculation = value1 + value2;
            value1 = calculation;
            value2 = 0;
            result.setText(Double.toString(calculation));
            newNumber = true;
        } else {
            value1 = Double.parseDouble(result.getText());
            result.setText("");
            operation = "add";
            dot = true;
        }
    }

    @FXML
    private void subtract(ActionEvent event) {
        value1 = Double.parseDouble(result.getText());
        result.setText("");
        operation = "subtract";
        dot = true;
    }

    @FXML
    private void divide(ActionEvent event) {
        value1 = Double.parseDouble(result.getText());
        result.setText("");
        operation = "divide";
        dot = true;
    }

    @FXML
    private void multiply(ActionEvent event) {
        value1 = Double.parseDouble(result.getText());
        result.setText("");
        operation = "multiply";
        dot = true;
    }

    @FXML
    private void equal(ActionEvent event) {
         value2 = Double.parseDouble(result.getText()); 
         calculation = value1 + value2;
         
         switch(operation){
             case "add": calculation = value1 + value2;
             break;
             case "subtract": calculation = value1 - value2;
             break;
             case "multiply": calculation = value1 * value2;
             break;
             case "divide": calculation = value1 / value2;
             break;
         }
         result.setText(Double.toString(calculation));
         newNumber = true;
         value1 = 0;
         value2 = 0;
    }

    @FXML
    private void Clear(ActionEvent event) {
        result.setText("");
        dot = true;
        newNumber = true;
        value1 = 0;
        value2 = 0;
    }

}