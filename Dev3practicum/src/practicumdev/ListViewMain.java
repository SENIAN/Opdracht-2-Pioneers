package practicumdev;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class ListViewMain extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("Pioneers.fxml"));
        Scene scene = new Scene(parent);
        stage.getIcons().add(new Image("http://files.softicons.com/download/application-icons/pixelophilia-icons-by-omercetin/png/32/apple-green.png"));
        stage.setTitle("Pioneers");
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args)  {
        Application.launch(args);
    }
}



