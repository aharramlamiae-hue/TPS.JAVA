

public class Etudiant{
    private String nom;
    private String prenom;
    private int  moyenne;
    private String adresse;
    private int cne;
    static int nombreEtudiant=0;


    public Etudiant (String nom, String prenom, int moyenne, String adresse, int cne){
        this.nom=nom;
        this.prenom=prenom;
        this.moyenne=moyenne;
        this.adresse=adresse;
        this.cne=cne;
    }

    public Etudiant(){

    }

    public Etudiant(Etudiant c){
        this.nom=c.nom;
        this.prenom=c.prenom;
        this.moyenne=c.moyenne;
        this.adresse=c.adresse;
        this.cne=c.cne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(int moyenne) {
        this.moyenne = moyenne;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCne() {
        return cne;
    }

    public void setCne(int cne) {
        this.cne = cne;
    }

    public void afficher(){
        System.out.println("Nom: "+nom);
        System.out.println("Prenom: "+prenom);
        System.out.println("Moyenne: "+moyenne);
        System.out.println("Adresse: "+adresse);
        System.out.println("CNE: "+cne);
    }

    public static int getnombreEtudiant(){
        return nombreEtudiant;
    }
}