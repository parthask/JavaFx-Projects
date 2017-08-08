package address;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HowToDoControl {

	@FXML
	private Pane toDoPane;
	@FXML
	private Label keyHints;
	@FXML
	private Label intro ;
	@FXML
	private Button nextHints;
	@FXML
	private Button  goToMain;
	@FXML
	private ProgressBar hintsProgress;
	
	//The 2nd layout instance to close the present How_to_play layout.
	@FXML
	private final Stage stage3 =  StartGameControl.stage2;
	
	//The main layout instance to go there.
	private final LightGameRoot obj= new LightGameRoot();
	
	private static double progressCount =0.5;


	//To show the progress or rest of the information about how_to_play layout.
	//it has some confusion to execute the progress bar.
	@FXML
	private void showProgress(ActionEvent event) {
		if(nextHints.isPressed()){
			hintsProgress.setProgress(progressCount*33.3);
		}else if( goToMain.isPressed()){
			goToMainPage(event);
		}
	}

	//To show the next hint by the next_hints button.
	@FXML
	private void nextHintShow(ActionEvent event) {
		showProgress(event);
	}

	//Backward going to the main layout from the 2nd how_to_play layout.
	@FXML
	private void goToMainPage(ActionEvent event) {
		 StartGameControl.closeMain(stage3);		
		obj.start(new Stage());
	}




}
