package practicumdev;/**
 * Created by Mohammed on 25-3-2015.
 */


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.ImageViewBuilder;
import javafx.scene.input.MouseEvent;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;

public class RootViewController {

    ArrayList<Pioneer> pioneersArr = new ArrayList<Pioneer>();
    ArrayList<String> tmp = new ArrayList<String>();
    private static final String FILE_Name = "C://Users//Mohammed//Documents//Practicumdev//Practicumdev//Pioneers.txt";
    @FXML
    private ListView<String> listViewB;
    @FXML
    private Button volgende;
    @FXML
    private Button vorige;
    @FXML
    public ImageView imageViewB = new ImageView();
    @FXML
    public Label pioneerLabel;

    public void readLine() throws IOException {
        // Leest de inputstream uit
        InputStream input = new BufferedInputStream(new FileInputStream(FILE_Name));
        byte[] contents = new byte[1024];
        int bytesRead = 0;
        String Pioneers = null;
        String[] tempPioneer = new String[0];
        //als de bytesRead wordt initialized met de input als deze niet gelijk is aan -1 byte
        while ((bytesRead = input.read(contents)) != -1) {
            Pioneers = new String(contents, 0, bytesRead);
            //In de file pioneers.txt staat er achter elke einde regel een # daarmee worden de pioneers gerangschikt.
            tempPioneer = Pioneers.split("#");
            for (int i = 0; i <= 20; i++) {
                String[] b = tempPioneer[i].split(",");
                //Op deze regel wordt een nieuw Object Pioneer gemaakt middels een constructor en toegevoegd aan de pioneer arraylist.
                pioneersArr.add(new Pioneer(Integer.toString(i), b[0], b[1], b[2]));
                // Voeg alle pioneers toe aan een tijdelijke String Array, voor gebruik om door de images te iteraten.
                for (int x = 0; x <= 20; x++) {
                    tmp.add(tempPioneer[x]);
                    //Om de pioneers toe te voegen aan de ListView in de JavaFX scene Builder gebruiken we een ObservableList elke index is een pioneer
                    ObservableList<String> data = FXCollections.observableArrayList(
                            tempPioneer[0], tempPioneer[1], tempPioneer[2], tempPioneer[3], tempPioneer[4], tempPioneer[5], tempPioneer[6], tempPioneer[7],
                            tempPioneer[8], tempPioneer[9], tempPioneer[10], tempPioneer[11], tempPioneer[12], tempPioneer[13],
                            tempPioneer[14], tempPioneer[15], tempPioneer[16], tempPioneer[17], tempPioneer[18], tempPioneer[19], tempPioneer[20]);
                    //Nadat de OBList data gevuld is met de pioneers kunnen we met de volgende regel de ListView vullen.
                    listViewB.setItems(data);
                }
            }
        }
    }
    @FXML
    private void loadImage()  {
        listViewB.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                pioneerLabel.setText("Pioneer:" + listViewB.getSelectionModel().getSelectedItems());
                if (pioneerLabel.getText().contains("Alan Turing")) {
                    Image image = new Image("AlanTuring.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Bill Gates")) {
                    Image image = new Image("BillGates.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Bob Kahn")) {
                    Image image = new Image("BobKahn.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Bob Metcalfe")) {
                    Image image = new Image("BobMetcalfe.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Dennis Ritchie")) {
                    Image image = new Image("DennisRitchie.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Donald Knuth")) {
                    Image image = new Image("DonaldKnuth.gif");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Douglas Engelbart")) {
                    Image image = new Image("DouglasEngelbart.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Edsger Dijkstra")) {
                    Image image = new Image("EdsgerDijkstra.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("John von Neumann")) {
                    Image image = new Image("JohnvonNeumann.gif");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Jimmy Wales")) {
                    Image image = new Image("JimmyWales.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Ken Thompson")) {
                    Image image = new Image("KenThompson.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Larry Page")) {
                    Image image = new Image("LarryPage.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Linus Torvalds")) {
                    Image image = new Image("LinusTorvalds.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Mark Andreessen")) {
                    Image image = new Image("MarkAndreessen.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Richard Stallman")) {
                    Image image = new Image("RichardStallman.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Sergey Brin")) {
                    Image image = new Image("SergeyBrin.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Steve Jobs")) {
                    Image image = new Image("SteveJobs.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Tim Berners")) {
                    Image image = new Image("TimBerners-Lee.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("Vint Cerf")) {
                    Image image = new Image("VintCerf.jpg");
                    imageViewB.setImage(image);
                }
                if (pioneerLabel.getText().contains("William Shockley")) {
                    Image image = new Image("WilliamSockley.jpg");
                    imageViewB.setImage(image);
                }

                if (pioneerLabel.getText().contains("Mark Zuckenberg")) {
                        Image image = new Image("MarkZuckenberg.jpg");
                    imageViewB.setImage(image);
                }
            }
        });
    }
}


