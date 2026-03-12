
public class Testeex3 {
    public static void main(String[] args) {
        Adresse a1 = new Adresse("Rue 1", "Tétouan", "93000");
        Adresse a2 = new Adresse("Rue 2", "Tanger", "90000");
        Adresse a3 = new Adresse("Rue 3", "Tétouan", "93000");

        Personne p1 = new Personne("Ali", 'M', new Adresse[]{a1});
        Personne p2 = new Personne("Sara", 'F', new Adresse[]{a2});
        Personne p3 = new Personne("Youssef", 'M', new Adresse[]{a3});

        ListePersonnes lp = new ListePersonnes(new Personne[]{p1, p2, p3});

        // Test findByNom
        Personne found = lp.findByNom("Sara");
        System.out.println(found != null ? "Trouvé : " + found.getNom() : "Non trouvé");

        // Test findByCodePostal
        System.out.println("Code postal 93000 existe ? " + lp.findByCodePostal("93000"));

        // Test countPersonneVille
        System.out.println("Nombre de personnes à Tétouan : " + lp.countPersonneVille("Tétouan"));

        // Test editPersonneNom
        lp.editPersonneNom("Ali", "Mohamed");
        System.out.println("Nouveau nom de p1 : " + p1.getNom());

        // Test editPersonneVille
        lp.editPersonneVille("Sara", "Casablanca");
        System.out.println("Nouvelle ville de Sara : " + p2.getAdresses()[0].getVille());
    }
}
