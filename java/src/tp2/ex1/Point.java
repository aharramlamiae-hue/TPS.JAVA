public class Point {
    // 1. Attributs privés
    private double abs;
    private double ord;

    // 4. Constructeur avec paramètres
    public Point(double abs, double ord) {
        this.abs = abs;
        this.ord = ord;
    }

    // 2. Getters et Setters
    public double getAbs() {
        return abs;
    }

    public void setAbs(double abs) {
        this.abs = abs;
    }

    public double getOrd() {
        return ord;
    }

    public void setOrd(double ord) {
        this.ord = ord;
    }

    // 3. Méthode toString()
    @Override
    public String toString() {
        return "(" + abs + ", " + ord + ")";
    }

    // 5. Calculer la distance entre deux points
    public double calculerDistance(Point p) {
        return Math.sqrt(Math.pow(this.abs - p.abs, 2) + Math.pow(this.ord - p.ord, 2));
    }

    // 6. Calculer le milieu entre deux points
    public Point calculerMilieu(Point p) {
        double xM = (this.abs + p.abs) / 2;
        double yM = (this.ord + p.ord) / 2;
        return new Point(xM, yM);
    }
}
