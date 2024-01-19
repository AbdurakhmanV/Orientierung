import java.util.Random;
import java.util.Scanner;

public class A11_MuenzeWerfen_V3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random coin = new Random();
        int headAmount = 0;
        int tailAmount = 0;

        int tossAmount;
        do {
            do {
                System.out.println("""
                        Wie oft soll die Muenze geworfen werden?
                        Wir duerfen nur 1 bis 10 mal werfen.""");
                tossAmount = scan.nextInt();
            } while (tossAmount < 1);
        } while (tossAmount > 10);

        for (int i = 0; i < tossAmount; ++i) {
            boolean face = coin.nextBoolean();
            if (face) {
                ++headAmount;
                System.out.println("Werfe Muenze - Kopf!");
            } else {
                ++tailAmount;
                System.out.println("Werfe Muenze - Zahl!");
            }
        }

        System.out.println("Summe Kopf: " + headAmount);
        System.out.println("Summe Zahl: " + tailAmount);
        if (headAmount == tailAmount) {
            System.out.println("Keiner hat gewonnen.");
        } else if (headAmount > tailAmount) {
            System.out.println("Ich habe gewonnen.");
        } else{
            System.out.println("Thomas hat gewonnen.");
        }

    }
}


//    Bei der letzten Version war es ja mit Hilfe des Scanners möglich zu bestimmen, wie oft die Münze geworfen werden soll.
//
//        Blöderweise könnte ein dummer (oder bösartiger) User jetzt auf die Idee kommen, bei der Zahl zum Beispiel eine Minuszahl einzugeben, oder eine unglaublich hohe Zahl wie 999999. Dann würde es ja Tage dauern, bis wir wissen, wer das Ticket bekommt.
//
//        Benutze daher eine DO-WHILE-Schleife, um die Eingabe der Zahl so lange zu wiederholen, bis der Benutzer eine Zahl eingegeben hat, die zwischen 1 und 10 liegt. Außerdem muss es eine ungerade Zahl sein.
//
//        Wie oft soll die Münze geworfen werden (ungerade Zahl 1-10)?
//        99
//        Wie oft soll die Münze geworfen werden (ungerade Zahl 1-10)?
//        -2
//        Wie oft soll die Münze geworfen werden (ungerade Zahl 1-10)?
//        14
//        Wie oft soll die Münze geworfen werden (ungerade Zahl 1-10)?
//        7
//        Werfe Münze… Kopf!
//        Werfe Münze… Zahl!
//        Werfe Münze… Zahl!
//        Werfe Münze…Kopf!
//        Werfe Münze…Zahl!
//        Werfe Münze… Zahl!
//        Werfe Münze…Kopf!
//        Summe Kopf: 3
//        Summe Zahl: 4
//        Stefan bekommt das Ticket.
//
//        Anforderung 1: Der Benutzer muss so lange in der DO-WHILE-Schleife gefangen sein, bis er eine sinnvolle Zahl eingibt. Falls er z.B. extra-böse ist und einen Buchstaben eingibt, musst du dich (noch) nicht darum kümmern.

