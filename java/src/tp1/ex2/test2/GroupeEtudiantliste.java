
import java.util.ArrayList;
import  java.util.List;

public class GroupeEtudiantliste{
    private String nomGroupe;
    private List<Etudiant> listetudiants;
    private String niveau;
    private int nombreGroupe=0;

    public GroupeEtudiantliste(String nomGroupe, String niveau) {
        this.nomGroupe = nomGroupe;
        this.niveau = niveau;
        this.listetudiants = new ArrayList<>();
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public List<Etudiant> getEtudiants() {
        return listetudiants;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public void setEtudiants(List<Etudiant> listetudiants) {
        this.listetudiants = listetudiants;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public int getNombreGroupe() {
        return nombreGroupe;
    }
    
    public void setNombreGroupe(int nombreGroupe) {
        this.nombreGroupe = nombreGroupe;
    }

    public void ajouterEtudiant(Etudiant e) {
        listetudiants.add(e);
        nombreGroupe++;
    }

    public void afficherEtudiantsgroup() {
        for (int i = 0; i < listetudiants.size(); i++) {
            Etudiant e = listetudiants.get(i);
            System.out.println("Etudiant " + (i + 1) + ": " + e.getNom() + " " + e.getPrenom() + ", Moyenne: " + e.getMoyenne() + ", Adresse: " + e.getAdresse() + ", CNE: " + e.getCne());
        }
    }

    public void afficherMoyenne() {
        for (int i = 0; i < listetudiants.size(); i++) {
            if (listetudiants.get(i).getMoyenne() >= 10) {
                System.out.println("Etudiant " + (i + 1) + ": " + listetudiants.get(i).getNom() + " " + listetudiants.get(i).getPrenom() + ", Moyenne: " + listetudiants.get(i).getMoyenne() +", Groupe: " + nomGroupe );
            }
        }
    }

    public int nbEtudiantsGroupe() {
        return nombreGroupe; 
    }

    public int nbTotalEtudiants() {
    return listetudiants.size();
    }
}
