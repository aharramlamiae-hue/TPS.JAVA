public class Calculette {
     private int a;
    private int b;

    public Calculette() {
        this.a = 0;
        this.b = 0;
    }

    public Calculette(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }

    public Calculette(Calculette c) {
        this.a = c.a;
        this.b = c.b;
    }

    public int addition() {
        return a + b;
    }

    public int soustraction() {
        return a - b;
    }

    public int multiplication() {
        return a * b;
    }

    public double division() {
        if (b == 0) {
            System.out.println("Erreur : Division par zéro !");
            return Double.NaN; 
        }
        return (double) a / b;
    }

    // Méthode pour afficher les valeurs
    public void afficher() {
        System.out.println("a = " + a + ", b = " + b);
    }
}
