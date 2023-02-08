public class Journal {
    private String dateParution;
    private String noArticle;
    private String maisonEdition;

    public Journal() {
        super();
    }

    public Journal(String dateParution, String noArticle, String maisonEdition) {
        super();
        this.dateParution = dateParution;
        this.noArticle = noArticle;
        this.maisonEdition = maisonEdition;
    }

    public String getDateParution() {
        return dateParution;
    }

    public void setDateParution(String dateParution) {
        this.dateParution = dateParution;
    }

    public String getNoArticle() {
        return noArticle;
    }

    public void setNoArticle(String noArticle) {
        this.noArticle = noArticle;
    }

    public String getMaisonEdition() {
        return maisonEdition;
    }

    public void setMaisonEdition(String maisonEdition) {
        this.maisonEdition = maisonEdition;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "dateParution='" + dateParution + '\'' +
                ", noArticle='" + noArticle + '\'' +
                ", maisonEdition='" + maisonEdition + '\'' +
                '}';
    }
}
