/**
 * Created by Mohammed on 2-4-2015.
 */

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    Patient p  = new Patient("","","",0);
    @FXML
    public TextField txtfield1 = new TextField();
    @FXML
    public TextField txtfield2 = new TextField();
    @FXML
    public TextField txtfield3 = new TextField();
    @FXML
    public TextField txtfield4 = new TextField();
    @FXML
    public Label passFail1 = new Label();
    @FXML
    public Label passFail2 = new Label();
    @FXML
    public Label passFail3 = new Label();
    @FXML
    public Label passFail4 = new Label();
    @FXML
    public Button chkAnswers = new Button();
    @FXML
    public TextField Patientnummer = new TextField();
    @FXML
    public TextField naamAchternaam = new TextField();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("Kleurenblindtest.fxml"));
        Scene scene = new Scene(parent);
        stage.getIcons().add(new Image("http://files.softicons.com/download/application-icons/pixelophilia-icons-by-omercetin/png/32/apple-green.png"));
        stage.setTitle("Kleurenblindheidstest");
        stage.setScene(scene);
        stage.show();
    }

    public void getAnswers() {
        if(txtfield1.getText().contains("57")) {
            passFail1.setText("Goed");
            passFail1.setVisible(true);
            p.score++;
        } else {
            passFail1.setText("Fout");
            passFail1.setVisible(true);
            System.out.println(p.score);
            p.score--;
        };
        if(txtfield2.getText().contains("3")) {
            passFail2.setText("Goed");
            passFail2.setVisible(true);
            p.score++;
        } else {
            passFail2.setText("Fout");
            passFail2.setVisible(true);
            p.score--;
        };
        if(txtfield3.getText().contains("3")) {
            passFail3.setText("Goed");
            passFail3.setVisible(true);
            p.score++;
        } else {
            passFail3.setText("Fout");
            passFail3.setVisible(true);
            p.score--;
        };
        if(txtfield4.getText().contains("8")) {
            passFail4.setText("Goed");
            passFail4.setVisible(true);
            p.score++;
        } else {
            passFail4.setText("Fout");
            passFail4.setVisible(true);
            p.score--;
        };
        String naam = naamAchternaam.getText().toString();
        String patientNummer = Patientnummer.getText().toString();
        String scorearr = Integer.toString(p.score);
        System.out.println("Naam Patient:" + naam +"  -  "+ "Patientnummer:" + patientNummer +"  -   " + "Totaal Score:"+ scorearr);
    }
}
