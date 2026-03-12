public class Personne {
    private String nom;
    private char sexe;
    private Adresse[] adresses;

    public Personne(String nom, char sexe, Adresse[] adresses) {
        this.nom = nom;
        this.sexe = sexe;
        this.adresses = adresses;
    }

    // getters
    public String getNom() {
        return nom;
    }

    public char getSexe() {
        return sexe;
    }

    public Adresse[] getAdresses() {
        return adresses;
    }

    // setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public void setAdresses(Adresse[] adresses) {
        this.adresses = adresses;
    }
}
