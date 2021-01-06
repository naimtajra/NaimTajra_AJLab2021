

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_12 extends Application {
	
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {

	  double h = 500;
	  double w = 150;
	  double s = 50;
	  
	  Rectangle r1 = new Rectangle(s,0.8*h,w,0.2*h);
	  r1.setFill(Color.RED);
	  Text t1 = new Text(s, 0.8*h - s, "Project -- 20%");

	  Rectangle r2 = new Rectangle(2*s+w,0.9*h,w,0.1*h);
	  r2.setFill(Color.BLUE);
	  Text t2 = new Text(2*s+w, 0.9*h - s, "Quiz -- 10%");

	  Rectangle r3 = new Rectangle(3*s+2*w,0.7*h,w,0.3*h);
	  r3.setFill(Color.GREEN);
	  Text t3 = new Text(3*s+2*w, 0.7*h - s, "Midterm -- 30%");
	  
	  Rectangle r4 = new Rectangle(4*s+3*w,0.6*h,w,0.4*h);
	  r4.setFill(Color.ORANGE);
	  Text t4 = new Text(4*s+3*w, 0.6*h - s, "Final -- 40%");

	  Pane p = new Pane();
	  p.getChildren().addAll(r1, r2, r3, r4, t1, t2, t3, t4);
	  
    // Create a scene and place it in the stage
	  Scene sc = new Scene(p,4*w+5*s, h);
	primaryStage.setScene(sc);  
    primaryStage.setTitle("Exercise14_12"); // Set the stage title
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
