package practicumdev;

/**
 * Created by Mohammed on 25-3-2015.
 */
public class Pioneer {

    String id;
    String volledigeNaam;
    String jarenActief;
    String uitvinding;
    String image;

    public Pioneer(String id, String volledigeNaam, String jarenActief, String uitvinding){
        this.id = id;
        this.volledigeNaam = volledigeNaam;
        this.jarenActief = jarenActief;
        this.uitvinding = uitvinding;
    }
    public String getVolledigenaam() {
        return volledigeNaam;
    }
    public void setVolledigenaam(String volledigeNaam) {
        this.volledigeNaam = volledigeNaam;
    }
    public String getJarenactief() {
        return jarenActief;
    }
    public void setJarenactief(String jarenActief) {
        this.jarenActief = jarenActief;
    }
    public String getUitvinding() {
        return uitvinding;
    }
    public void setUitvinding(String uitvinding) {
        this.uitvinding = uitvinding;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image =image;
    }
}
