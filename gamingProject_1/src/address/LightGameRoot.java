package address;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class LightGameRoot extends Application {
	public static AnchorPane root ;
	public static Stage primaryStage;
	
	//main Layout display.
	@Override
	public void start(Stage pStage) {
		try {
			LightGameRoot.primaryStage = pStage;
			root = new AnchorPane();
			root= FXMLLoader.load(getClass().getResource("/view/StartAGame.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/view/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.getIcons().add(new Image("gameIcon.PNG"));
			primaryStage.setTitle("*** LigHt gAmE ***");
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
