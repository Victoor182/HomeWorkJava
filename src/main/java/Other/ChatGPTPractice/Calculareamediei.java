package Other.ChatGPTPractice;

public class Calculareamediei {

    public static double calculMedie (int [] a ){
        int suma = 0 ;
        for(int i =0; i < a.length; i++ ){
            suma += a[i] ;

        }
        double medie = (double) suma / a.length;
        return medie;

    }

    public static void main(String[] args) {
        int[] a = { 25 , 30 , 40 ,50};
        double medie = calculMedie(a);
        System.out.println(medie);
    }
}
