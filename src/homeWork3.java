/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author des3rew
 */
public class homeWork3 extends Application {
    
    private Text createTextmethod (){  // we created a function that creates text  
    Text text1= new Text("First Text");
    text1.setFill(Color.BLUE);
    return text1; // return node of type text 
    }
    
    private ImageView createImageviewfromUrl(){
        Image image = new Image ("https://homepages.cae.wisc.edu/~ece533/images/fruits",200,200,true,true);
        ImageView imageview = new ImageView (image);
        imageview.setX(100);
        imageview.setY(100);
        return imageview; // will return a node of type ImageView
        
    }
    
        private ImageView createImageviewfromPath() throws FileNotFoundException{
            InputStream in = new FileInputStream ("c:\\logo.png");
            Image image = new Image (in);
            ImageView imageview = new ImageView(image);
            return imageview;  
            
        }

    
  @Override
  public void start (Stage myPrimarystage) throws FileNotFoundException{ 
    
      //Pane pane = new Pane();
      //pane.setPadding(new Insets(50));
      
      VBox vbox = new VBox (10);
      vbox.setAlignment(Pos.CENTER);
      vbox.getChildren().addAll(createImageviewfromUrl(),createImageviewfromPath());
      
      Scene scene = new Scene(vbox,450,450);
      myPrimarystage.setScene(scene);
      myPrimarystage.setTitle("Stage title");
      myPrimarystage.show();
      
      
  }     
  public static void main (String [] args){
      launch ( args );
  }  
}
