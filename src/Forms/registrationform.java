     /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author des3rew
 */
public class registrationform extends Application  {

    public Label createLabel (String x){
        Label label1 =new Label(x);
        //label1.setText("Welcome");
        GridPane.setHalignment(label1, HPos.LEFT); 
        label1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        return label1;
    }
     private void showAlert(Alert.AlertType alertType,  String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        //alert.initOwner(owner);
        alert.show();
    }
    public TextField createTextField (){
      TextField textf = new TextField();
      textf.setPrefWidth(250);
      GridPane.setFillWidth(textf, false);
      //textf.setText("Enter your full name");
      return textf;
    }
  
     public PasswordField createPassword(){
        PasswordField pwd = new PasswordField ();
        GridPane.setFillWidth(pwd, false);
        pwd.setPrefWidth(250);
        return pwd;
    }
     public static boolean isStringOnlyAlphabet(String str) 
    { 
        String expression = "^[a-zA-Z\\s]+"; 
        return str.matches(expression);
        //return ((str != null) && (!str.equals(""))  && (str.matches("^[a-zA-Z]*$"))); 
    }
     
     public static boolean isatleast(String str) 
    { 
        String regex = "^.{50,}$";
        return str.matches(regex);
        //return ((str != null) && (!str.equals(""))  && (str.matches("^[a-zA-Z]*$"))); 
    }
     
     public static boolean isSelected(ComboBox x ) 
    { 
        boolean isMyComboBoxEmpty = x.getSelectionModel(). isEmpty();
        return isMyComboBoxEmpty;
    }
     
     public static boolean isEmail(String email) 
    { 
      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return email.matches(regex);
    }
      public static boolean ispassword(String password) 
    { 
      String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=\\S+$).{8,20}$"; 
      return password.matches(regex);
    }
     
     public ComboBox createCombo(){
         ObservableList<String> countries = Stream.of(Locale.getISOCountries())
        .map(locales -> new Locale("", locales))
        .map(Locale::getDisplayCountry)
        .collect(Collectors.toCollection(FXCollections::observableArrayList));
        ComboBox<String> cb = new ComboBox<>(countries);
        cb.getSelectionModel().select("Select"); 
        cb.setStyle("-fx-pref-width: 100;");
        return cb;
     }
     
     public CheckBox createCheckBox(String x){
        CheckBox ckb = new CheckBox (x);
        return ckb;
    }
    
    
    @Override
    public void start(Stage primaryStage)  {
       GridPane gpane = new GridPane();
        gpane.setAlignment(Pos.CENTER);
        gpane.setHgap(15);
        gpane.setVgap(10);
        
        gpane.add(createLabel("Name:"),0,0);
        TextField txtfname= new TextField();
        txtfname.setPromptText("Enter your Name");
        gpane.add(txtfname,1,0);
        gpane.add(createLabel("Email:"),0,1);
        TextField email= new TextField();
        gpane.add(email,1,1);
        email.setPromptText("Enter your Email ID");
        gpane.add(createLabel("Phone:"),0,2);
        TextField fone= new TextField();
        gpane.add(fone,1,2);
        fone.setPromptText("Enter your Phone number");
        gpane.add(createLabel("Password:"),0,3);
        PasswordField password = new PasswordField ();
        GridPane.setFillWidth(password, false);
        password.setPrefWidth(250);
        
        gpane.add(password,1,3);
        password.setPromptText("Enter your password (minimun length: 8)");
        gpane.add(createLabel("Confirm:"),0,4);
        PasswordField confirm = new PasswordField ();
        GridPane.setFillWidth(confirm, false);
        confirm.setPrefWidth(250);
        
        gpane.add(confirm,1,4);
        confirm.setPromptText("Enter your password");
        gpane.add(createLabel("Country:"),0,5);
        
        ObservableList<String> countries = Stream.of(Locale.getISOCountries())
        .map(locales -> new Locale("", locales))
        .map(Locale::getDisplayCountry)
        .collect(Collectors.toCollection(FXCollections::observableArrayList));
        ComboBox<String> cb = new ComboBox<>(countries);
        cb.getSelectionModel().select("Select"); 
        cb.setStyle("-fx-pref-width: 100;");
        
        
        gpane.add(cb, 1, 5);
        HBox hbox0=new HBox(10);
        gpane.add(createLabel("Gender:"),0,6);
        RadioButton rb0=new RadioButton("Male");
        RadioButton rb1=new RadioButton("Female");
         ToggleGroup group=new ToggleGroup();
         rb0.setToggleGroup(group);
         rb1.setToggleGroup(group);
         hbox0.getChildren().addAll(rb0,rb1);
         hbox0.setAlignment(Pos.CENTER_LEFT);
        gpane.add(hbox0,1,6);
        gpane.add(createLabel("Language:"),0,7);
        HBox hbox1= new HBox (10);
        hbox1.getChildren().addAll(createCheckBox("Arabic"),createCheckBox("English"),createCheckBox("Spanish"));
        hbox1.setAlignment(Pos.CENTER_LEFT);
        gpane.add(hbox1,1,7);
        gpane.add(createLabel("About You :"),0,8);
        gpane.setPadding(new Insets(0));
        TextArea txtf = new TextArea();
        GridPane.setFillWidth(txtf, false);
        txtf.setPrefWidth(250);
        txtf.setPrefHeight(100);
        gpane.add(txtf,1,8);
        txtf.setPromptText("Your biography..");
        BorderPane bp=new BorderPane();
        bp.setTop(gpane);
        
        Button registerlabel = new Button("Register");
        registerlabel.setStyle("-fx-text-fill: blue");
        registerlabel.setPrefWidth(350);
        VBox vbox = new VBox(5);
        vbox.getChildren().add(registerlabel);
        vbox.setPadding(new Insets(10,0,10,0));
        
        Button gotomain = new Button("Already have an account? Sign In");
        gotomain.setPrefWidth(350);
        gotomain.setStyle("-fx-text-fill: red");
        vbox.getChildren().add(gotomain);
         gotomain.setOnMouseClicked( e -> {
        primaryStage.hide();
        
       mainScreen myClass = new mainScreen();
        myClass.start(primaryStage);
        
        });
        
        
        txtfname.setOnKeyPressed(e->  { 
           
            if (e.getCode()==KeyCode.TAB){
                if(isStringOnlyAlphabet(txtfname.getText())==true){
                System.out.println("first if");
                txtfname.setStyle("-fx-border-color: none");
                
                }
            else
                {
                 showAlert(Alert.AlertType.ERROR, " Error!", "Enter you name :Name must contains only letters");
                 txtfname.setStyle("-fx-border-color: red");
}
            
            }});
        
        email.setOnKeyPressed(e->  { 
            
            if (e.getCode()==KeyCode.TAB){
                if(isEmail(email.getText())==true){
                    email.setStyle("-fx-border-color: none");
                }
            else
                {
                    showAlert(Alert.AlertType.ERROR, " Error!", "Enter you Email ID");
                    email.setStyle("-fx-border-color: red");
                }                   
            
            }});
        
        password.setOnKeyPressed(e->  { 
            
            if (e.getCode()==KeyCode.TAB){
                System.out.println("tab is pressed");
                if(ispassword(password.getText())==true){        
                    password.setStyle("-fx-border-color: none");
                }
            else
                {
                   showAlert(Alert.AlertType.ERROR, " Error!", "Enter you Password \nAt least one capital letter, one small letter, one digit, length:8");
                   password.setStyle("-fx-border-color: red");
                } }});
        
        
         confirm.setOnKeyPressed(e->  { 
             if (e.getCode()==KeyCode.TAB){
                 {System.out.println(confirm.getText());
                 
                 if (confirm.getText().equals(password.getText()) && !password.getText().isEmpty() )
                 { confirm.setStyle("-fx-border-color: none");
                                    }
                 else {
                     showAlert(Alert.AlertType.ERROR, " Error!", "Not matching entered password");
                     confirm.setStyle("-fx-border-color: red");
                 }
                 }
                     
             }
         
         });
         
         fone.setOnKeyPressed(e->  { 
             if (e.getCode()==KeyCode.TAB){
                 
                 if(fone.getText().matches("[0-9]") || fone.getText().length()==8)
                 {   fone.setStyle("-fx-border-color: none");
                  System.out.println(" you entered a number");
                 }
                  else
                {
                 showAlert(Alert.AlertType.ERROR, " Error!", "Enter you Phone number ( 8 digits.)");
                 fone.setStyle("-fx-border-color: red");
                    }
             
             
             } });
         
        
        cb.setOnKeyPressed(e->  { 
            
            if (e.getCode()==KeyCode.TAB){
                if(isSelected(cb)!=true){
                    cb.setStyle("-fx-border-color: none");
                System.out.println("first if");
                }
            else
                {
                   showAlert(Alert.AlertType.ERROR, " Error!", "select country");
                    cb.setStyle("-fx-border-color: red");
                    }
            
            }});
        txtf.setOnKeyPressed(e->  { 
            
            if (e.getCode()==KeyCode.TAB){
                if(isatleast(txtf.getText())==true){
                System.out.println("first if");
                 txtf.setStyle("-fx-border-color: none");
                }
            else
                {
                 showAlert(Alert.AlertType.ERROR, " Error!", " About you should be at least 50 characters ");
                 txtf.setStyle("-fx-border-color: red");
                    }
            
            }});
         
        
        registerlabel.setOnAction(e->{
            if ((isStringOnlyAlphabet(txtfname.getText())==true)
                 && (isEmail(email.getText())==true
                         && (ispassword(password.getText())==true)
                             && (confirm.getText().equals(password.getText()) && !password.getText().isEmpty() )
                                && (fone.getText().matches("[0-9]") || fone.getText().length()==8)
                                    && (isSelected(cb)!=true)
                                           && (isatleast(txtf.getText())==true)))
            {
                showAlert(Alert.AlertType.CONFIRMATION, "Registration Successful!", "Welcome " + txtfname.getText());
            mainScreen myclass=new mainScreen();
            myclass.start(primaryStage);
            }
             if (isStringOnlyAlphabet(txtfname.getText())==true)
                System.out.println("first if");
                 else 
                { 
                 Label label1= new Label("Name must be only characters ");
                 label1.setStyle("-fx-text-fill: red");
                 System.out.println("second 2f");
                 vbox.getChildren().add(label1);
                
                }
            
            
                if(isEmail(email.getText())==true){
                }
                else
                {
                 Label label1= new Label("Email not correct ");
                 label1.setStyle("-fx-text-fill: red");
                 System.out.println("second 2f");
                vbox.getChildren().add(label1);
                
                }

            if(ispassword(password.getText())==true){
                System.out.println("first if");
                
                }
            else
                {
                 Label label1= new Label("password requirements not correct ");
                 label1.setStyle("-fx-text-fill: red");
                System.out.println("second 2f");
                vbox.getChildren().add(label1);
            }
            
            if (confirm.getText().equals(password.getText()) && !password.getText().isEmpty() )
                 {System.out.println("password  match");
                                     }
                 else {
                     Label label2= new Label("password Not match");
                     label2.setStyle("-fx-text-fill: red");
                     vbox.getChildren().add(label2);
                 }
            
             if(fone.getText().matches("[0-9]") || fone.getText().length()==8)
                 {   
                  System.out.println(" you entered a number");
                 }
                  else
                {
                 Label label1= new Label("phone numbers should be 8 digits ");
                 label1.setStyle("-fx-text-fill: red");
                vbox.getChildren().add(label1);
                 }
             
              if(isSelected(cb)!=true){
                System.out.println("first if");
                }
            else
                {
                 Label label1= new Label("Please select a country ");
                 label1.setStyle("-fx-text-fill: red");
                 vbox.getChildren().add(label1);
                }
             if(isatleast(txtf.getText())==true){
                System.out.println("first if");
                }
            else
                {
                 Label label1= new Label("you should write at least 50 characters ");
                 label1.setStyle("-fx-text-fill: red");
                System.out.println("second 2f");
                vbox.getChildren().add(label1);
                
                } 
             
                 
                     
        });
        bp.setCenter(vbox);
        bp.setPadding(new Insets(20));
        Scene scene = new Scene (bp,370,650);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Registration Form");
        primaryStage.setResizable(false);
        primaryStage.show();
        
    }
    
    public static void main (String[]args){
        launch(args);
    }
   
    }
            

