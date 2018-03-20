package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		primaryStage.setTitle("Hello World!");			//title of the world
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
		StackPane root = new StackPane();				//this is the window itself
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
