/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
/**
 *
 * @author des3rew
 */
public class homeWork4 extends Application {
    
    
    
    @Override
    public void start (Stage myStage){
        
        
        
        
    //Line l = new Line();
    Polygon poly = new Polygon ();
    poly.getPoints().addAll(new Double[]{
      200.0, 50.0,
        400.0, 50.0, 
        450.0, 150.0, 
        400.0, 250.0, 
        200.0, 250.0, 
        150.0, 150.0, 
    });
    poly.setStyle("-fx-background-color: red;");
    // p.setOpacity(
    poly.setStroke(Color.color(0.2, 0.5, 0.5,0.5 ));
    Button btn = new Button ("My button");
    FlowPane pane = new FlowPane ();
    pane.setOrientation(Orientation.HORIZONTAL);
    pane.setAlignment(Pos.CENTER);
    pane.setHgap(10);
    pane.getChildren().addAll(btn,poly);
    pane.setBackground(new Background (new BackgroundFill(Color.BLUE, new CornerRadii(15), new Insets(15))));
    Scene scene = new Scene(pane,200,200);
    myStage.setScene(scene);
    myStage.setTitle("New Stage Title");
    myStage.show();
    }
    
    
  public static void main (String [] args){
     launch(args); 
      
  }
          
    
    
}
