import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        // 10. Saisie des coordonnées
        System.out.println("Entrez les coordonnées du premier point (x y) : ");
        Point p1 = new Point(sc.nextDouble(), sc.nextDouble());

        System.out.println("Entrez les coordonnées du deuxième point (x y) : ");        Point p2 = new Point(sc.nextDouble(), sc.nextDouble());

        System.out.println("Entrez les coordonnées du troisième point (x y) : ");
        Point p3 = new Point(sc.nextDouble(), sc.nextDouble());

        TroisPoints tp = new TroisPoints(p1, p2, p3);

        // Affichage des détails
        System.out.println("Points saisis : " + p1 + ", " + p2 + ", " + p3);

        System.out.println("Distance P1-P2 : " + p1.calculerDistance(p2));
        System.out.println("Distance P1-P3 : " + p1.calculerDistance(p3));
        System.out.println("Distance P2-P3 : " + p2.calculerDistance(p3));

        System.out.println("Milieu P1-P2 : " + p1.calculerMilieu(p2));
        System.out.println("Milieu P1-P3 : " + p1.calculerMilieu(p3));
        System.out.println("Milieu P2-P3 : " + p2.calculerMilieu(p3));

        System.out.println("Les points sont alignés ? " + tp.sontAlignes());
        System.out.println("Forment-ils un triangle isocèle ? " + tp.estIsocele());
        }

        
    }
}
