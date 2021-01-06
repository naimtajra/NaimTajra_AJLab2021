

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Exercise14_02 extends Application {

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {

    Image Ix = new Image("file:///C:\\x.gif");
    Image Io = new Image("file:///C:\\o.gif");
    Image Ie = new Image("file:///C:\\empty.gif");

    GridPane p = new GridPane();
    p.setAlignment(Pos.CENTER);
    p.setHgap(10);
    p.setVgap(10);
    
    for (int i =0; i < 3; i++){
    	for(int j = 0; j< 3; j++){
    		int k = (int)(Math.random()*3);
    		if(k == 0){
    			p.add(new ImageView(Ix), i, j);
    		} else if (k == 1) {
    			p.add(new ImageView(Io), i, j);
    		} else{
    			p.add(new ImageView(Ie), i, j);
    		}
    	}
    	
    }
    // Create a scene and place it in the stage
    Scene s = new Scene(p);
    primaryStage.setScene(s);
    primaryStage.setTitle("Exercise14_02"); // Set the stage title
    primaryStage.show(); // Display the stage
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 

