/**
 * Created by Mohammed on 2-4-2015.
 */
public class Patient {

    public String naam;
    public String achternaam;
    public String patientnummer;
    public int score;


    public Patient(String naam, String achternaam, String patientnummer, int score) {
        this.naam = naam;
        this.achternaam = achternaam;
        this.patientnummer = patientnummer;
        this.score = score;
    }

    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public String getAchternaam() {
        return achternaam;
    }
    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
    public String getPatientnummer() {
        return patientnummer;
    }
    public void setPatientnummer(String patientnummer) {
        this.patientnummer = patientnummer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}