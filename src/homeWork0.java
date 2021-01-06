/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// radio buttons 



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author des3rew
 */
public class homeWork0 extends Application {
    
        @Override
        public void start(Stage myStage)
        {
            
        RadioButton rb1ins = new RadioButton (); 
        RadioButton rb2ins = new RadioButton (); 
        RadioButton rb3ins = new RadioButton (); 
        rb1ins.setText("18-25");
        rb2ins.setText("26-30");
        rb3ins.setText("31-45");
        ToggleGroup group = new ToggleGroup ();
        rb1ins.setToggleGroup(group);
        rb2ins.setToggleGroup(group);
        rb3ins.setToggleGroup(group);
        rb1ins.setSelected(true);
        
        HBox vbox = new HBox (50); // the 10 is same like property of vbox.setSpacing(10);
        vbox.getChildren().addAll(rb1ins,rb2ins,rb3ins);
        vbox.setPadding(new Insets(50));
        Scene scene = new Scene(vbox,400,200);
        
        myStage.setScene(scene);
        myStage.setTitle("Ages Radio Buttons");
        myStage.show();
        
        
    }
    
    
    
    
    public static void main (String[]args){
            launch(args);}
    
}
