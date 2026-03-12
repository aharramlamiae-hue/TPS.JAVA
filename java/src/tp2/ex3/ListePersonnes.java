public class ListePersonnes {
    private Personne[]personnes;

    public ListePersonnes(Personne[]personnes){
        this.personnes=personnes;
    }

    public Personne[] getPersonnes() {
        return personnes;
    }

    public void setPersonnes(Personne[] personnes) {
        this.personnes = personnes;
    }

    public Personne findByNom(String s) {
        for (Personne p : personnes) {
            if (p.getNom().equals(s)) {
                return p;
            }
        }
        return null;
    }

    public boolean findByCodePostal(String cp) {
        for (Personne A : personnes) {
            for (Adresse S : A.getAdresses()) {
                if (S.getCodePostal().equals(cp)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int countPersonneVille(String ville) {
        int count = 0;
        for (Personne A : personnes) {
            for (Adresse S : A.getAdresses()) {
                if (S.getVille().equals(ville)) {
                    count++;
                    break; // once one address matches, move to next person
                }
            }
        }
        return count;
    }

    public void editPersonneNom(String oldNom, String newNom) {
        for (Personne A : personnes) {
            if (A.getNom().equals(oldNom)) {
                A.setNom(newNom);
            }
        }
    }

    public void editPersonneVille(String nom, String newVille) {
        for (Personne A : personnes) {
            if (A.getNom().equals(nom)) {
                for (Adresse S : A.getAdresses()) {
                    S.setVille(newVille);
                }
            }
        }
    }












}
