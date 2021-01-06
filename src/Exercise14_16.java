

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise14_16 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {

	  Pane p = new Pane();
	  
	  Line l1 = new Line(0, 0, 0, 0);
	  l1.startYProperty().bind(p.heightProperty().divide(3));
	  l1.endYProperty().bind(l1.startYProperty());
	  l1.endXProperty().bind(p.widthProperty());
	  l1.setStroke(Color.BLUE);

	  Line l2 = new Line(0, 0, 0, 0);
	  l2.startYProperty().bind(p.heightProperty().multiply(2.0/3));
	  l2.endYProperty().bind(l2.startYProperty());
	  l2.endXProperty().bind(p.widthProperty());
	  //l2.setStroke(Color.BLUE);
          l2.setFill(Color.RED);
	  
	  Line l3 = new Line(0, 0, 0, 0);
	  l3.startXProperty().bind(p.widthProperty().divide(3));
	  l3.endXProperty().bind(l3.startXProperty());
	  l3.endYProperty().bind(p.heightProperty());
	  l3.setStroke(Color.RED);
	  
	  Line l4 = new Line(0, 0, 0, 0);
	  l4.startXProperty().bind(p.widthProperty().multiply(2.0/3));
	  l4.endXProperty().bind(l4.startXProperty());
	  l4.endYProperty().bind(p.heightProperty());
	  l4.setStroke(Color.RED);
	  
	  p.getChildren().addAll(l1, l2, l3, l4);
    // Create a scene and place it in the stage
	  Scene s = new Scene(p, 300, 300);
	  primaryStage.setScene(s);
    primaryStage.setTitle("Exercise14_16"); // Set the stage title
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
