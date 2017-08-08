package address;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GameOptionsControl {
//	@FXML
//	private AnchorPane gameOptions;

	@FXML
	private Label gOpLabel;

	@FXML
	private Button game1;

	@FXML
	private Button game2;

	@FXML
	private Button game3;

	//The 2nd layout instance to close the present How_to_play layout.
	private final Stage stage4 =  StartGameControl.stage2;
	public static Stage stage5;

	private final StartGameControl obj2 =  new  StartGameControl();

	@FXML
	private void gameOption_1(ActionEvent event) {
		StartGameControl.closeMain(stage4);
		 obj2.openNewLayout("/view/Option_1_Layout_1.fxml + Build By Shapes!"); 
		 stage5 = StartGameControl.stage2;
		 //stage5.setResizable(false);
	}
}
