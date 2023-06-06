package HomeWork.Scanner7method;

import java.util.Scanner;

public class scannerUndMethod {
    public static void main(String[] args) {
        System.out.println(" This is first point from home work!");
        Scanner scanner = new Scanner(System.in);
        String a  = scanner.nextLine();
        String b = scanner.nextLine();
        // words need have 4 Character !!!
        String c = a.substring(0, 2);
        String d = b.substring(2, 4);
        System.out.println(c+d);
        System.out.println("Type Go to start second Home work");
        String io = scanner.nextLine();

        System.out.println("Now we make second point Home work");

        int result = towNumber(5, 2);
        System.out.println(result);
        int result2 = f(5, 2);
        System.out.println(result2);
        int result3 = g(5,2);
        System.out.println(result3);
        int result4 = h(5,2);
        System.out.println(result4);
        System.out.println("Type Go to start next point Home work");
        String rf = scanner.nextLine();
        double result5 = chanche(100, 0.89);
        System.out.println(result5 + "$");
        System.out.println("Type Go to start next point Home work");
        String op = scanner.nextLine();
        int smallPizza = 24;
        int BigPizza = 28;
        int caloris = 40;
        double par = par(smallPizza);
        double par2 = par(BigPizza);
        int Z = (int)((par2 - par)*caloris);
        System.out.println(Z + " To much caloris");

    }
    public static double par(int a){
        double radius = a / 2.0;
        return Math.PI*Math.pow(radius, 2);
        // for method are me Chat GPT help !!!!
    }

    public static double chanche(double euro, double curs){
        return euro*curs;
    }

    public static int towNumber(int ab ,int ac) {
        return ab+ac;
    }
    public static int f(int ab ,int ac){
        return ab*ac;
    }
    public static int g(int ab,int ac){
        return ab/ac;
    }
    public static int h(int ab, int ac){
        return ab-ac;
    }


}
