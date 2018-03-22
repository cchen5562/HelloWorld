//Hello World
//Cristina Chen

package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;				
import javafx.scene.Scene;					//the container for all content

public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		primaryStage.setTitle("Hello World!");			//title of the window
		Button btn = new Button();
		btn.setText("Say 'Hello World'");				//title of the button
		btn.setOnAction(new EventHandler<ActionEvent>()	//if button gets pressed
				{
					@Override
					public void handle(ActionEvent event)
					{
						System.out.println("Hello World!");	//what happens when you click it
					}
				});
		StackPane root = new StackPane();				//this is what's inside the window (the lighter blue)
		root.getChildren().add(btn);					//adds button to the scene?
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
