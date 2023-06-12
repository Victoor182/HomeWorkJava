package Other.ChatGPTPractice;

public class Calculematematice {

    public static void  calculeMatematice (int a , int b ) {
        int suma = a + b ;
        int diferenta = a - b ;
        int produs = a * b ;
        System.out.println( "suma: " + suma);
        System.out.println("Diferenta: " + diferenta);
        System.out.println("produs: " + produs);

        if ( b !=0) {
            double impartire = a / b ;
            System.out.println("impartire: " + impartire);
        }else {
            System.out.println(" impartirea la 0 este imposibila");
        }

    }

    public static void main(String[] args) {

        calculeMatematice(10 ,5);
    }

}
