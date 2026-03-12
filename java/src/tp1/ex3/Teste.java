import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        try (Scanner clavier = new Scanner(System.in)) {
            Gestion gm = new Gestion();

            System.out.print("Entrez le nombre de mesures à ajouter: ");
            int x = clavier.nextInt();

            for (int i = 0; i < x; i++) {
                System.out.print("Entrez la valeur de la mesure " + (i+1) + ": ");
                int valeur = clavier.nextInt();
                gm.ajouterMesure(new Mesure(valeur));
            }

            System.out.println("Nombre de mesures: " + gm.nbmesures());
            System.out.println("Somme des mesures: " + gm.sommemesures());
            gm.affichermesure();
            System.out.println("Moyenne des mesures: " + gm.moyenne());
        }
    }
    
}
