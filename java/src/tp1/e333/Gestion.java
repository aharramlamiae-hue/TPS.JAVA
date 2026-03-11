package tp1.ex3;
import java.util.ArrayList;
import  java.util.List;

public class Gestion {
    private List<Mesure> mesures;

    public Gestion() {
        this.mesures = new ArrayList<>();
    }

    public List<Mesure> getMesures() {
        return mesures;
    }

    public void setMesures(List<Mesure> mesures) {
        this.mesures = mesures;
    }   

    public void ajouterMesure(Mesure m) {
        if (m.getValeur() >= (-100) && m.getValeur() <= 100) {
            mesures.add(m);
            System.out.println("Mesure " + m.getValeur() + " est valide.");
        } else {
            System.out.println("Mesure " + m.getValeur() + " est invalide.");
        }
            
    }
    
    public int  nbmesures() {
        return mesures.size();
    }

    public int sommemesures(){
        int som=0;
        for(int i=0;i<mesures.size();i++){
            som+=mesures.get(i).getValeur();
        }
        return som;
    }

    public void affichermesure() {
        for (int i = 0; i < mesures.size(); i++) {
            System.out.println("Mesure " + (i + 1) + ": " + mesures.get(i).getValeur());
        }
    }

    public double  moyenne(){
        if (nbmesures() == 0) {
            System.out.println("Aucune mesure disponible pour calculer la moyenne.");
            return 0;
        }
        double moy = (double)sommemesures() / nbmesures();
        return moy;
    }

}
