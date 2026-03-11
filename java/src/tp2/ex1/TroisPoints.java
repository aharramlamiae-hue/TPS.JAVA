public class TroisPoints {
    // 7. Attributs privés
    private Point premier;
    private Point deuxieme;
    private Point troisieme;

    // Constructeur avec 3 paramètres
    public TroisPoints(Point premier, Point deuxieme, Point troisieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
        this.troisieme = troisieme;
    }

    // Getters et Setters
    public Point getPremier() {
        return premier;
    }

    public void setPremier(Point premier) {
        this.premier = premier;
    }

    public Point getDeuxieme() {
        return deuxieme;
    }

    public void setDeuxieme(Point deuxieme) {
        this.deuxieme = deuxieme;
    }

    public Point getTroisieme() {
        return troisieme;
    }

    public void setTroisieme(Point troisieme) {
        this.troisieme = troisieme;
    }

    // 8. Vérifier si les points sont alignés
    public boolean sontAlignes() {
        double AB = premier.calculerDistance(deuxieme);
        double AC = premier.calculerDistance(troisieme);
        double BC = deuxieme.calculerDistance(troisieme);

        return (Math.abs(AB - (AC + BC)) < 1e-9) ||
               (Math.abs(AC - (AB + BC)) < 1e-9) ||
               (Math.abs(BC - (AB + AC)) < 1e-9);
    }

    // 9. Vérifier si le triangle est isocèle
    public boolean estIsocele() {
        double AB = premier.calculerDistance(deuxieme);
        double AC = premier.calculerDistance(troisieme);
        double BC = deuxieme.calculerDistance(troisieme);

        return (Math.abs(AB - AC) < 1e-9) ||
               (Math.abs(AB - BC) < 1e-9) ||
               (Math.abs(AC - BC) < 1e-9);
    }
}
