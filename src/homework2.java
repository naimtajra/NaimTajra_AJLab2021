/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// List View with setItems


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author des3rew
 */
public class homework2 extends Application{
    
    public void start (Stage myStage){
        //ObservableList is an interface then we 
        //should create a list of items using helper method observableArrayList to create an object of type observable list  with same type as the interface ObservableList 
        
        ObservableList <String> data = FXCollections.observableArrayList("Red","Blue","Green","yellow","orange");
        ListView<String> lvins = new ListView<String>(); 
        lvins.setItems(data); // the type should be an object of type observable list
        
        VBox vbox= new VBox(20);
        vbox.getChildren().add(lvins);
        Scene scene = new Scene(vbox,50,50);
        myStage.setScene(scene);
        myStage.show();
        
    }
    
    public static void main (String[] args){
        launch(args);
    }
}
