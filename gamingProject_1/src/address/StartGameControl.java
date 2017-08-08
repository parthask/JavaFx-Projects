package address;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class StartGameControl {


	@FXML
	private Button letsplay;
	@FXML
	private CheckBox howToDo;
	@FXML
	private CheckBox play;
	@FXML
	private CheckBox scoure;
	
	//The new 2nd layout instance to open it.
	public static Stage stage2 = new Stage();
	
	//the instance of the 1st stage or layout to close it when the 2nd layout will start.
	private final Stage stage1 = LightGameRoot.primaryStage;

	//CheckBox Checking which one is checked in main layout.
	@FXML
	private void checkBoxControl(ActionEvent event) {

		if(howToDo.isSelected()){
			play.setDisable(true);
			scoure.setDisable(true);
		}else if(play.isSelected()){
			howToDo.setDisable(true);
			scoure.setDisable(true);
		}else if(scoure.isSelected()){
			howToDo.setDisable(true);
			play.setDisable(true);
		}

	}

	//Let's play button controlling and decide which 2nd layout will display now.
	@FXML
	public void buttoncontrol(ActionEvent event) throws Exception {     
		closeMain(stage1);
		if(howToDo.isSelected()){
			openNewLayout("/view/HowToDoLayout.fxml + Show How To Play...");
		}else if(play.isSelected()){
			openNewLayout("/view/GamePlayOptions.fxml + Choice What To Play...");
//		openSecondLayout("/view/PlayLayout.fxml + It's The Gaming Plot..."); 		
		}else if(scoure.isSelected()){
			openNewLayout("/view/ScoureBoardLayout.fxml + Scoure Board Is Here..."); 		
		}
	}


	//With the beginning of the new layout the previous one will close here.
	public static void closeMain(Stage stage) {
		stage = (Stage) stage.getScene().getWindow();
		stage.close();
	}


	//The every 2nd layout will begin from here with a title from the argument.
	public  void openNewLayout(String str1)  {
		String st [] = str1.split("\\+");
		try {		
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(st[0]));
			Parent root1 = (Parent) fxmlLoader.load();
			 
			stage2.setScene(new Scene(root1)); 
			stage2.getIcons().add(new Image("gameIcon.PNG"));
			stage2.setResizable(false);
			stage2.setTitle(st[1]);
			stage2.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}


}
