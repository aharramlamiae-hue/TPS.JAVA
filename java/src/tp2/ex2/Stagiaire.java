public class Stagiaire {
    private String nom;
    private float[] notes;

    // Constructeur
    public Stagiaire(String nom, float[] notes) {
        this.nom = nom;
        this.notes = notes;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float[] getNotes() {
        return notes;
    }

    public void setNotes(float[] notes) {
        this.notes = notes;
    }

    public float calculerMoyenne(){
        float s=0;
        for(int i=0;i<notes.length;i++){
            s=s+notes[i];
        }
        return s/notes.length;
    }

    public float trouverMax(){
        float Max=notes[0];
        for(int i=1;i<notes.length;i++){
            if(notes[i]>Max){
                Max=notes[i];
            }
        }
        return Max;
    }

    public float trouverMin(){
        float Min=notes[0];
        for(int i=1;i<notes.length;i++){
            if(notes[i]<Min){
                Min=notes[i];
            }
        }
        return Min;
    }
}
