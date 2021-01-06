/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author des3rew
 */
public class mainScreen extends Application {
    
    
     ImageView[] img = new ImageView[10];
       int Index = 0;
       
     @Override
     public void start (Stage primaryStage){
      
       StackPane pane = new StackPane();
        
        Button btn1 = new Button("Sign up");
       
        btn1.setStyle("-fx-border-color: white;-fx-background-color: transparent;-fx-text-fill: white");
        btn1.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        
        
         Button btn2 = new Button("Sign in");
         btn2.setStyle("-fx-border-color: white;-fx-background-color: transparent;-fx-text-fill: white");
       
        btn2.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        
                 
        btn1.setOnMouseClicked( e -> {
        primaryStage.hide();
        registrationform myClass = new registrationform();
        myClass.start(primaryStage);
                                     });
        
        
        btn2.setOnMouseClicked( e -> {
        primaryStage.hide();
        loginF myClass = new loginF();
        myClass.start(primaryStage);
                                       });
        
        
        HBox hbox = new HBox(10);
        hbox.setAlignment( Pos.BOTTOM_CENTER );
        hbox.setPadding(new Insets(25));
        hbox.getChildren().addAll(btn1,btn2);
        
       
       img[0] = new ImageView( new Image ("file:///c:\\ass3\\slide0.jpg"));
       img[1] = new ImageView( new Image ("file:///c:\\ass3\\slide1.jpg"));
       img[2] = new ImageView( new Image ("file:///c:\\ass3\\slide2.jpg"));
       img[3] = new ImageView( new Image ("file:///c:\\ass3\\slide3.jpg"));
       img[4] = new ImageView( new Image ("file:///c:\\ass3\\slide4.jpg"));
       img[5] = new ImageView( new Image ("file:///c:\\ass3\\slide5.jpg"));
       img[6] = new ImageView( new Image ("file:///c:\\ass3\\slide6.jpg"));
       img[7] = new ImageView( new Image ("file:///c:\\ass3\\slide7.jpg"));
       img[8] = new ImageView( new Image ("file:///c:\\ass3\\slide8.jpg"));
       img[9] = new ImageView( new Image ("file:///c:\\ass3\\slide9.jpg"));
       
       
      pane.getChildren().add(img[Index]);
      pane.getChildren().add(hbox);
      EventHandler<ActionEvent> myevent = e -> {
            if (Index < 9) {
                pane.getChildren().remove(img[Index]);
                pane.getChildren().remove(hbox);
                Index++;
                pane.getChildren().add(img[Index]);
                pane.getChildren().add(hbox);
               FadeTransition ft = new FadeTransition(Duration.millis(4000), img[Index]);
                ft.setFromValue(0.7);
                ft.setToValue(1);
                ft.play();
             
            }
            else if (Index == 9) {
                pane.getChildren().remove(hbox);
                Index = 0;
                pane.getChildren().remove(img[9]);
                pane.getChildren().add(img[Index]);
                pane.getChildren().add(hbox);
               FadeTransition ft = new FadeTransition(Duration.millis(4000), img[Index]);
                ft.setFromValue(0.7);
                ft.setToValue(1);
                ft.play();
            }
            
            
        };
      
       Timeline timeLine = new Timeline(new KeyFrame(Duration.millis(3000),myevent)); 
       timeLine.setCycleCount(Timeline.INDEFINITE);
        timeLine.play();
        
        Scene scene = new Scene (pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sign in");
       primaryStage.setResizable(false);
        primaryStage.show();
         
     }

public static void main (String[]args){
        launch(args);
    }
}