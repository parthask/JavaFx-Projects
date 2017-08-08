package address;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class PlayLayout_1_Control {
	@FXML
	private Button A;

	@FXML
	private Button I;

	@FXML
	private Button H;

	@FXML
	private Button B;

	@FXML
	private Button J;

	@FXML
	private Button D;

	@FXML
	private Button K;

	@FXML
	private Button C;

	@FXML
	private Button E;

	@FXML
	private Button G;

	@FXML
	private Button F;

	@FXML
	private Label bar;

	@FXML
	private Pane midPane;

	@FXML
	private ImageView a;
	@FXML
	private ImageView b;

	@FXML
	private ImageView c;

	@FXML
	private ImageView d;

	@FXML
	private ImageView e;

	@FXML
	private ImageView f;

	@FXML
	private ImageView g;

	@FXML
	private ImageView h;

	@FXML
	private ImageView i;

	@FXML
	private ImageView j;

	@FXML
	private ImageView k;

	@FXML
	private Label header;

	@FXML
	private Label footer;

	@FXML
	private Label bar1;

	@FXML
	private Button gotIt1;

	@FXML
	private Label showScore;

	@FXML
	private Label complement;

	@FXML
	void gotIt1OnAction(ActionEvent event) {

	}

	public static boolean [] boolarr = new boolean [11];
	public String [] kw = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
	public ImageView [] iv = {a,b,c,d,e,f,g,h,i,j,k};
	public static int score = 0;


	//	private final StartGameControl obj = new StartGameControl();

	//    @FXML
	//	private void initialize(){
	//    	A.setStyle("-fx-background-image: url('/gaming photo/s1.PNG')");
	//
	//    }


	//private String helpInfo = "Look here is an image in the left side and you have follow this to
	// build a maximum same structure with different types of shapes, which are shown in the right
	// side below the window. You can choice color and shape in according to built an immediate structure.
	// So happy building!!! :-)";


//	private void helpButtonHandle(String txt, String title) {
//
//		//infoBox(helpInfo , "Helping Massage!!!");
//
//		try {		
//			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/OnlyHelpLayout.fxml"));
//			Parent root1 = (Parent) fxmlLoader.load();
//			Stage stage = new Stage();
//			stage.setScene(new Scene(root1)); 
//			stage.getIcons().add(new Image("gameIcon.PNG"));
//			stage.setResizable(false);
//			stage.setTitle(title);
//			//stage.initOwner(GameOptionsControl.stage5);
//			//stage.
//			stage.showAndWait();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}



	public static void warnBox(String infoMessage, String titleBar)
	{
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle(titleBar);
		alert.setHeaderText(null);
		alert.setContentText(infoMessage);
		alert.showAndWait();
	}


	public static void alertBox(String infoMessage, String titleBar)
	{
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(titleBar);
		alert.setHeaderText(null);
		alert.setContentText(infoMessage);
		//alert.
		alert.showAndWait();
	}


	@FXML
	private void elementShapesHandle(ActionEvent event) {

	}

	@FXML
	private void choiceColorHandle(ActionEvent event) {

	}

	@FXML
	private void labelHandle(ActionEvent event) {

	}


	public void decisionHolder(String keyWord){


		int index = 0;
		loop: for(int i=0;i<11;i++){
			if(boolarr[10]){
				complement.setText("First Level Completed Successfully.");
				warnBox("You have just completed !!!\n", "Warn! Warn!! Warn!!!");
				showScoreBoard(score);
				score = 0;
				break loop;
			}
			if(kw[i]== keyWord){
				index = i;
				break loop;
			}
		}
		if(index == 0 && !boolarr[index]){
			if(keyWord == "A"){
				complement.setText("You are doing well...");
				boolarr[0] = true;
				alertBox("Wowww...\nWell Done...\nJust Keep It Up...", "Wow! Woww!! Wowww!!!");
				a.setImage(new Image("/photoes/a1.PNG"));
				//helpButtonHandle("Wowww...\nWell Done...\nJust Keep It Up...", "Wow! Woww!! Wowww!!!");
			}else{
				warnBox("You have selected WRONG one!!!\nTry again...", "Warn! Warn!! Warn!!!");
				score++;
			}
		}else{
			if(!boolarr[index]){
				if(boolarr[index-1]){
					if(keyWord == kw[index]){
						boolarr[index] = true;
						alertBox("Wowww...\nWell Done...\nJust Keep It Up...", "Wow! Woww!! Wowww!!!");
						//String s = keyWord.toLowerCase();
						//for(int i=1;i<11;i++){
//							String ss = iv[i].getId();
//							if(s == ss){
								setImageOnView(index);
									//System.out.println(index);
							//}
						//}
					}else{
						warnBox("You have selected WRONG one!!!\nTry again...", "Warn! Warn!! Warn!!!");
					score++;
					}
				}else{
					warnBox("You have selected WRONG one!!!\nTry again...", "Warn! Warn!! Warn!!!");
				score++;
				}
			}else{
				warnBox("You have selected WRONG one!!!\nTry again...", "Warn! Warn!! Warn!!!");
			score++;
			}
		}

	}

	private void showScoreBoard(int score) {
		showScore.setText("You have mistyped " + score + " times.");
	}


	private void setImageOnView(int index) {
		switch(index){
		case 1:
			//System.out.println(index);
			iv[1] = new ImageView();
			b.setImage(new Image("/photoes/a2.PNG"));
			break;
		case 2:
			//System.out.println(index);
			iv[2] = new ImageView();
			c.setImage(new Image("/photoes/a3.PNG"));
			break;
		case 3:
		//	System.out.println(index);
			iv[3] = new ImageView();
			d.setImage(new Image("/photoes/a4.PNG"));
			break;
		case 4: 
			iv[4] = new ImageView();
			e.setImage(new Image("/photoes/a5.PNG"));
			break;
		case 5:
			iv[5] = new ImageView();
			complement.setText("JUST CARRY ON...");
			f.setImage(new Image("/photoes/a6.PNG"));
			break;
		case 6: 
			iv[6] = new ImageView();
			g.setImage(new Image("/photoes/a7.PNG"));
			break;
		case 7: 
			iv[7] = new ImageView();
			h.setImage(new Image("/photoes/a8.PNG"));
			break;
		case 8: 
			iv[8] = new ImageView();
			i.setImage(new Image("/photoes/a9.PNG"));
			break;
		case 9: 
			iv[9] = new ImageView();
			j.setImage(new Image("/photoes/a10.PNG"));
			break;
		case 10:
			iv[10] = new ImageView();
			k.setImage(new Image("/photoes/a11.PNG"));
			break;
		}
	}



	@FXML
	void AonAction(ActionEvent event) {
		decisionHolder("A");

	}

	@FXML
	void BonAction(ActionEvent event) {
		decisionHolder("B");
	}

	@FXML
	void ConAction(ActionEvent event) {
		decisionHolder("C");
	}

	@FXML
	void DonAction(ActionEvent event) {
		decisionHolder("D");
	}

	@FXML
	void EonAction(ActionEvent event) {
		decisionHolder("E");
	}

	@FXML
	void FonAction(ActionEvent event) {
		decisionHolder("F");
	}

	@FXML
	void GonAction(ActionEvent event) {
		decisionHolder("G");
	}

	@FXML
	void HonAction(ActionEvent event) {
		decisionHolder("H");
	}

	@FXML
	void IonAction(ActionEvent event) {
		decisionHolder("I");
	}

	@FXML
	void JonAction(ActionEvent event) {
		decisionHolder("J");
	}

	@FXML
	void KonAction(ActionEvent event) {
		decisionHolder("K");
	}

}
