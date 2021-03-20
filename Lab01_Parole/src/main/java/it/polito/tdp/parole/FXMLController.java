package it.polito.tdp.parole;

import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;

import it.polito.tdp.parole.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole parole = new Parole();
	
	
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnCancella;

    @FXML
    void doCancella(ActionEvent event) {
    	
    	String p = txtResult.getSelectedText();
    	parole.removeParola(p);
    	Collections.sort(parole.getElenco());
    	
        String lista = "";
    	
    	for (String pp: parole.getElenco()) {
    		
    		lista = lista + pp + "\n";
    	}
    	
    	txtResult.setText(lista); 

    }

    @FXML
    void doInsert(ActionEvent event) {
    
    	parole.addParola(txtParola.getText());
    	Collections.sort(parole.getElenco());
    	
    	String lista = "";
    	
    	for (String pp: parole.getElenco()) {
    		
    		lista = lista + pp + "\n";
    	}
    	
    	txtResult.setText(lista); 
    }

    @FXML
    void doReset(ActionEvent event) {
    	
    	parole.reset();
    	txtResult.setText("");

    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
