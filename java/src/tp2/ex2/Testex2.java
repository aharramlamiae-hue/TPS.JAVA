public class Testex2 {
    public static void main(String[] args) {
        // Création de stagiaires
        Stagiaire s1 = new Stagiaire("Ali", new float[]{12, 14, 16});
        Stagiaire s2 = new Stagiaire("Sara", new float[]{15, 17, 18});
        Stagiaire s3 = new Stagiaire("Youssef", new float[]{10, 11, 13});

        // Création d’une formation
        Stagiaire[] liste = {s1, s2, s3};
        Formation f = new Formation("POO en Java", 10, liste);

        // Tests
        System.out.println("Moyenne de la formation : " + f.calculerMoyenneFormation());
        f.afficherNomMax();
        f.afficherMinMax();
        f.trouverMoyenneParNom("Sara");
    }
}
