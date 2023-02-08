import java.util.ArrayList;
import java.util.List;

public class TraitementMedia<T> {

    List<T> listMedia; //Liste des medias de notre bibliothèque

    //Constructeur sans paramètre
    public TraitementMedia() {
        super();
        this.listMedia = new ArrayList<T>();
    }

    //Ajouter des medias à notre liste de media
    public void ajouterMedia(T media) {
        listMedia.add(media);
    }

    //Le test des lambdas avec le prof
    /*public void afficherMedia() {
        listMedia.forEach((e) -> {
            String titre = null;
            final String ttt="";

            if (e instanceof Livre) {
                Livre livre = (Livre) e;
                //titre = (livreData)-> livre.getTitre();
            }
            System.out.println(titre);
//            System.out.println(e.toString());
        });
    }*/

    //Affichier tous les médias présents dans la liste
    public void afficherMedia() {
        listMedia.forEach(media -> {
            System.out.println(media.toString());
        });
    }
}
