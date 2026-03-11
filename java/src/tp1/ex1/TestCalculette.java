public class TestCalculette {
    public static void main(String[] args) {
        Calculette c1 = new Calculette(); 
        c1.afficher();
        System.out.println("Addition : " + c1.addition());

        Calculette c2 = new Calculette(1, 5); 
        c2.afficher();
        System.out.println("Addition : " + c2.addition());
        System.out.println("Soustraction : " + c2.soustraction());
        System.out.println("Multiplication : " + c2.multiplication());
        System.out.println("Division : " + c2.division());
        System.out.println("recopie : " + new Calculette(c2).addition());


        Calculette c3 = new Calculette(8, 0); 
        c3.afficher();
        System.out.println("Division : " + c3.division());

    }
}
