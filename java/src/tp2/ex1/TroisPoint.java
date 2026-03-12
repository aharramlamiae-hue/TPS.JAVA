public class TroisPoint {
    
    private Point premier;
    private Point deuxieme;
    private Point troisieme;

    // Constructeur avec 3 paramètres
    public TroisPoint(Point premier, Point deuxieme, Point troisieme) {
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

    public boolean sontAlignes(){
        double AB = premier.calculerDistance(deuxieme);
        double AC = premier.calculerDistance(troisieme);
        double BC = deuxieme.calculerDistance(troisieme); 
        return (Math.abs(AB - (AC + BC)) < 0.0000000000001) ||
               (Math.abs(AC - (AB + BC)) < 0.0000000000001) ||
               (Math.abs(BC - (AB + AC)) < 0.0000000000001);
    }

    public boolean estIsocele(){
        double AB = premier.calculerDistance(deuxieme);
        double AC = premier.calculerDistance(troisieme);
        double BC = deuxieme.calculerDistance(troisieme); 
        return (Math.abs(AB - AC ) < 0.0000000000001) ||
               (Math.abs(AC - AB ) < 0.0000000000001) ||
               (Math.abs(BC - AB ) < 0.0000000000001);
    }

   
}
