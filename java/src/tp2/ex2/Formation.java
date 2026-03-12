public class Formation {
    private String intitule;
    private int nbrJours;
    private Stagiaire[] stagiaires;

    // Constructeur
    public Formation(String intitule, int nbrJours, Stagiaire[] stagiaires) {
        this.intitule = intitule;
        this.nbrJours = nbrJours;
        this.stagiaires = stagiaires;
    }

    // Getters et Setters
    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getNbrJours() {
        return nbrJours;
    }

    public void setNbrJours(int nbrJours) {
        this.nbrJours = nbrJours;
    }

    public Stagiaire[] getStagiaires() {
        return stagiaires;
    }

    public void setStagiaires(Stagiaire[] stagiaires) {
        this.stagiaires = stagiaires;
    }

    public float calculerMoyenneFormation() {
    float s = 0;
    for (int i = 0; i < stagiaires.length; i++) {
        s += stagiaires[i].calculerMoyenne(); 
    }
    return s / stagiaires.length;
    }

    public int getIndexMax(){
        int index = 0;
        float max = stagiaires[0].calculerMoyenne();
        for(int i=0; i < stagiaires.length; i++){
            if(stagiaires[i].calculerMoyenne()>max){
                max=stagiaires[i].calculerMoyenne();
                index=i;
            }
        }
        return index; 
    }

    public void afficherNomMax(){
        int i =getIndexMax();
        System.out.println("Nom de startigie:"+ stagiaires[i].getNom());
    }

    public void afficherMinMax(){
        int i =getIndexMax();
        System.out.println("Note minimale:"+ stagiaires[i].trouverMin());
    }

    public void trouverMoyenneParNom(String nom) {
        for (int i = 0; i < stagiaires.length; i++) {
            if (stagiaires[i].getNom().equalsIgnoreCase(nom)) {
                System.out.println("Moyenne de " + nom + " : " + stagiaires[i].calculerMoyenne());
                return; 
            }
        }   
        System.out.println("Stagiaire " + nom + " non trouvé.");
        
    }



}