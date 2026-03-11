

public class GroupeEtudiant{
    private String nomG;
    private String niveau;
    private Etudiant[] etudiants;
    private int nombreGroupe=0;

    public GroupeEtudiant(String nomG ,String niveau , Etudiant[] etudiants){
        this.nomG=nomG;
        this.niveau=niveau;
        this.etudiants=etudiants;
    }
    
    public String getNomG() {
        return nomG;
    }

    public String getNiveau() {
        return niveau;
    }

    public Etudiant[] getEtudiants() {
        return etudiants;
    }

    public void setNomG(String nomG) {
        this.nomG = nomG;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public void setEtudiants(Etudiant[] etudiants) {
        this.etudiants = etudiants;
    }

    public void ajouterEtudiant(Etudiant e) {
        if (nombreGroupe < etudiants.length) {
            etudiants[nombreGroupe++] = e;
        } else {
            System.out.println("Groupe plein");
        }
    }

    public void afficherEtudiantsgroup() {
        for (int i = 0; i < nombreGroupe; i++) {
            Etudiant e = etudiants[i];
            System.out.println("Etudiant " + (i + 1) + ": " + e.getNom() + " " + e.getPrenom() + ", Moyenne: " + e.getMoyenne() + ", Adresse: " + e.getAdresse() + ", CNE: " + e.getCne());
        }
    }

    public void afficherMoyenne() {
        for (int i = 0; i < nombreGroupe; i++) {
            if (etudiants[i].getMoyenne() >= 10) {
                System.out.println("Etudiant " + (i + 1) + ": " + etudiants[i].getNom() + " " + etudiants[i].getPrenom() + ", Moyenne: " + etudiants[i].getMoyenne() +", Groupe: " + nomG );
            }
        }
    }

    public int nbEtudiantsGroupe() {
        return nombreGroupe ;
    }

    public int nbTotalEtudiants() {
        return etudiants.length;
    }   
}
