/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;            
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
/**
 *
 * @author des3rew
 */
public class loginF extends Application  {
    
    public Label createLabel (){
        Label label1 =new Label();
        label1.setText("Welcome");
        label1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        return label1;
    }
    
    public TextField createTextField (){
      TextField textf = new TextField();
      textf.setText("Enter your full name");
      return textf;
    }
    
    public Button createButton(){
        Button btn = new Button ();
        btn.setText("sign in");
        return btn;
    }

    
    public ImageView createImageViewFromUrl (){
        Image image = new Image("https://picsum.photos/200");
        ImageView imageView = new ImageView (image);
        return imageView;
        
    }
    /**
     *
     * @param myStage
     */
    @Override
    public void start (Stage primaryStage){
        
        GridPane gpane = new GridPane();
        gpane.setAlignment(Pos.CENTER);
        gpane.setHgap(15);
        gpane.setVgap(10);
               //gpane.setPadding(new Insets(10));
        gpane.add(createImageViewFromUrl(),0,0);
        //gpane.add(createLabel(), 2, 1);
        Label label0= new Label();
        label0.setText("Welcome");
        label0.setTextFill(Color.BLUE);
        label0.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        GridPane.setHalignment(label0,HPos.CENTER);
        gpane.add(label0,0,1);
                 //gpane.add(new Label ("UserName :"),1,2);
        Label label2 = new Label("Username");
        label2.setFont(new Font("Felix Titling", 9));
        label2.setTextFill(Color.BLUE);
        TextField txtf= new TextField();
        txtf.setPromptText("Enter username");
        txtf.setPrefColumnCount(10);
        HBox hbox = new HBox(9);
        
        hbox.getChildren().addAll(label2,txtf);
        gpane.add(hbox,0, 2);
       // gpane.add(createTextField(),2,2);
        //gpane.add(new Label ("Password :"),1,3);
       Label label3 = new Label("Password");
       label3.setTextFill(Color.BLUE);
        //gpane.add(new TextField(),2,3);
       TextField txtf1= new TextField();
       txtf1.setPromptText("Enter password");
       txtf1.setPrefColumnCount(10);
       HBox hbox0=new HBox(9);
       hbox0.getChildren().addAll(label3,txtf1);
        gpane.add(hbox0,0, 3);
        /* method 1 to change only the alignment of a specific node
        HBox hbox = new HBox();
        hbox.getChildren().add(createButton());
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        */
        Button btn = new Button ();
        btn.setText("sign in");
        btn.setStyle("-fx-text-fill: blue");
        gpane.add(btn,0,4);
        // method 2 to change only the alignment of a specific node
        GridPane.setHalignment(btn,HPos.CENTER);
        //gpane.setGridLinesVisible(true);
        Button btn1 = new Button("Don't have an account yet? Register.");
        gpane.add(btn1,0,5);
        btn1.setStyle("-fx-text-fill: red");
        btn1.setOnMouseClicked( e -> {
        primaryStage.hide();
        
       mainScreen myClass = new mainScreen();
        myClass.start(primaryStage);
        
        });
        Scene scene = new Scene (gpane,225,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sign in");
        primaryStage.setResizable(false);
        primaryStage.show();
        
        
    }
    
    
    
    
    
    public static void main (String[]args){
        launch(args);
    }
    
}
