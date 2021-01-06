/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Combo Box with getItems

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author des3rew
 */
public class homework1 extends Application {
    
    public void start ( Stage myStage){
        
        ComboBox<String> comboBoxins = new ComboBox<String>();
        comboBoxins.getItems().addAll("in stock","out of stock","soon in stock");
        comboBoxins.getSelectionModel().select(2); // make the 3rd option as default
        VBox vbox= new VBox();
        vbox.getChildren().add(comboBoxins);
        vbox.setPadding(new Insets(25));// space between comboboxs and the border
        Scene scene = new Scene(vbox,400,400);
        myStage.setScene(scene);
        myStage.show();
        
        
    }
    
    
    
    public static void main (String [] args){
            launch (args);}
}
