public class Livre {
    private String titre;
    private String auteur;
    private int nbPage;

    public Livre() {
        super();
    }

    public Livre(String titre, String auteur, int nbPage) {
        super();
        this.titre = titre;
        this.auteur = auteur;
        this.nbPage = nbPage;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", nbPage=" + nbPage +
                '}';
    }
}
