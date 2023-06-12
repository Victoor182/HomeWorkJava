package Other.ChatGPTPractice;

public class Temperatura {
    public static  double conversieTemperatura (int a) {
        double Fahrenheit = a * 9/5 +32;
        return Fahrenheit;
    }

    public static void main(String[] args) {
       double rezultat = conversieTemperatura(80);
        System.out.println(rezultat);

    }

}
