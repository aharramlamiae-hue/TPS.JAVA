public class Point{
    private double abs;
    private double ord;

    public Point(double abs,double ord){
        this.abs = abs;
        this.ord = ord;
    }

    public double getabs(){
        return  abs;
    }

    public double getord(){
        return ord;
    }

    public void setabs(double abs){
        this.abs=abs;
    }

    public void setord(double ord){
        this.ord=ord;
    }

    @Override
    public String toString() {
        return "(" + abs + ", " + ord + ")";
    }

    public double  calculerDistance(Point p){
        return (Math.sqrt(Math.pow(this.abs-p.abs,2 )+Math.pow(this.ord-p.ord,2 )));
    }

    public Point calculerMilieu(Point p){
        double xM=(this.abs+p.abs)/2;
        double yM=(this.ord+p.ord)/2;
        return new Point(xM, yM);

    }
}