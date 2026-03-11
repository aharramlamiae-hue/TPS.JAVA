

public class Test {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("Ali", "Ben", 12, "Rabat", 12345);
        Etudiant e2 = new Etudiant("Sara", "El", 8, "Casablanca", 54321);
        Etudiant e3 = new Etudiant("Youssef", "Omar", 15, "Fes", 67890);

        Etudiant e4 = new Etudiant("Amina", "Bentawite", 12, "Rabat", 12345);
        Etudiant e5 = new Etudiant("Karim", "Elhadey", 8, "Casablanca", 54321);
        Etudiant e6 = new Etudiant("Yasmine", "Omaryy", 15, "Fes", 67890);


        Etudiant[] etudiants = new Etudiant[6];
        GroupeEtudiant groupeA = new GroupeEtudiant("Groupe A", "CIVIL", etudiants);
        GroupeEtudiant groupeB = new GroupeEtudiant("Groupe B", "INFO", etudiants);

        groupeA.ajouterEtudiant(e1);
        groupeA.ajouterEtudiant(e2);
        groupeA.ajouterEtudiant(e3);
        groupeB.ajouterEtudiant(e4);
        groupeB.ajouterEtudiant(e5);
        groupeB.ajouterEtudiant(e6);

        System.out.println("Liste des étudiants dans le groupe A:");
        groupeA.afficherEtudiantsgroup();

        System.out.println("\nListe des étudiants dans le groupe B:");
        groupeB.afficherEtudiantsgroup();

        System.out.println("\nÉtudiants avec une moyenne supérieure ou égale à 10:");
        groupeA.afficherMoyenne();
        groupeB.afficherMoyenne();
        System.out.println("\nNombre total d'étudiants dans le groupe A: " + groupeA.nbEtudiantsGroupe());
        System.out.println("Nombre total d'étudiants dans le groupe B: " + groupeB.nbEtudiantsGroupe());
        System.out.println("Nombre total d'étudiants : " + (groupeA.nbEtudiantsGroupe() + groupeB.nbEtudiantsGroupe()));

    }
}
