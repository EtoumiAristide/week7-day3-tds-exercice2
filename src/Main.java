public class Main {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Une si longue lettre", "Mariama Ba", 150);
        Livre livre2 = new Livre("Et pourtant elle pleurait", "Isaï Biton COulibaly", 250);
        Livre livre3 = new Livre("Les frasques d'Ebinto", "Amadou Kone", 119);

        System.out.println("============== LIVRE =================");
        TraitementMedia<Livre> medialLivre = new TraitementMedia<Livre>();
        medialLivre.ajouterMedia(livre1);
        medialLivre.ajouterMedia(livre2);
        medialLivre.ajouterMedia(livre3);
        medialLivre.afficherMedia();

        System.out.println("============== VIDEO =================");

        Video video1 = new Video("mp4", "25Mb", "Arafat: Kpangor");
        Video video2 = new Video("Mpeg", "85Ko", "Debordo: Spécialité ivoirienne");
        Video video3 = new Video("Avi", "1Go", "Initiation à Angular");

        TraitementMedia<Video> mediaVideo = new TraitementMedia<Video>();
        mediaVideo.ajouterMedia(video1);
        mediaVideo.ajouterMedia(video2);
        mediaVideo.ajouterMedia(video3);

        mediaVideo.afficherMedia();


    }
}