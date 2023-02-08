public class Video {
    private String format;
    private String taille;
    private String titre;

    public Video() {
        super();
    }

    public Video(String format, String taille, String titre) {
        super();
        this.format = format;
        this.taille = taille;
        this.titre = titre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Video{" +
                "format='" + format + '\'' +
                ", taille='" + taille + '\'' +
                ", titre='" + titre + '\'' +
                '}';
    }
}
