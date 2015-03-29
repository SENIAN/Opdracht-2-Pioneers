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
    public String setVolledigenaam() {
        return this.volledigeNaam;
    }
    public String getJarenactief() {
        return jarenActief;
    }
    public String setJarenactief() {
        return this.jarenActief;
    }
    public String getUitvinding() {
        return uitvinding;
    }
    public String setUitvinding() {
        return this.uitvinding;
    }
    public String getId() {
        return id;
    }
    public String setId() {
        return this.id;
    }

    public String getImage() {
        return image;
    }
    public String setImage() {
        return this.image;
    }
}
