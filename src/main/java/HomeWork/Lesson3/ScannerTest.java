package HomeWork.Lesson3;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Give Name ");
         String name = scanner.nextLine();
       // System.out.println("are Texted: " + word);

        System.out.println("Give sex ");
        char gender = scanner.nextLine().charAt(0);

        System.out.println("Give age ");
        int age = scanner.nextInt();

        System.out.println("give tel nr ");
        long PhoneNumber = scanner.nextLong();

        System.out.println("Give Ident ");
        double id = scanner.nextDouble();

        System.out.println(" Name: " + name);
        System.out.println("Sex: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + PhoneNumber);
        System.out.println("id: " + id);

    }
}
