import java.util.Scanner;

public class A14_CleanThis_V1 {
    public static void main(String[] args) {
        int age = 17;
        boolean withAdult = false;
        boolean vip = true;

        if (age >= 4 && age < 16 && withAdult || age >= 16) {
            if (age >= 18) System.out.println("Gründes Band");
            else if (age >= 16) System.out.println("Gelbes Band");
            else System.out.println("Rotes Band");
            if (vip) System.out.println("Goldenes Band dazu!");
            else System.out.println("Kein goldenes Band dazu!");
        } else System.out.println("Kein Zutritt!");
    }
}

