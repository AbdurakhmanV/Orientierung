import java.util.Random;
import java.util.Scanner;

public class A13_MuenzeWerfen_V4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random coin = new Random();
        int headAmount = 0;
        int tailAmount = 0;
        int allTosses = 0;

        boolean agreement;
        do {
            int tossAmount;
            do {
                do {
                    System.out.println("""
                            Wie oft soll die Muenze geworfen werden?
                            Wir duerfen nur 1 bis 10 mal werfen und die Summe aller Würfe darf nicht gerade sein.
                            """);
                    tossAmount = scan.nextInt();
                } while (tossAmount < 1 || tossAmount > 10);
                if ((tossAmount + allTosses) % 2 == 0) {
                    System.out.println("Die Summe aller Würfe darf nicht gerade sein.");
                }
            } while ((tossAmount + allTosses) % 2 == 0);

            allTosses += tossAmount;

            for (int i = 0; i < tossAmount; ++i) {
                boolean head = coin.nextBoolean();
                if (head) {
                    ++headAmount;
                    System.out.println("Werfe Muenze - Kopf!");
                } else {
                    ++tailAmount;
                    System.out.println("Werfe Muenze - Zahl!");
                }
            }

            System.out.println("Summe Kopf: " + headAmount);
            System.out.println("Summe Zahl: " + tailAmount);
            if (headAmount > tailAmount) {
                System.out.println("Ich habe gewonnen.");
            } else if (headAmount < tailAmount) {
                System.out.println("Thomas hat gewonnen.");
            }

            System.out.println("""
                                        
                    Bist du zufrieden mit dem Ergebnis?
                    Antworte mit 'true' fuer ja oder 'false' fuer nein.""");

            agreement = scan.nextBoolean();
        } while (!agreement);

    }
}


//    Dein Freund Stefan gibt einfach nicht auf!
//
//        Nun will er immer wenn eine bestimmte Anzahl geworfen wurde gefragt werden, ob er denn zufrieden ist mit dem Ergebnis (Antwort ist true oder false, also ein boolean).
//
//        Ist er es nicht, soll erneut für einige Male eine Münze geworfen werden (der Benutzer kann wieder eingeben, wie oft), und die Summen der Kopf- bzw. Zahl-Ergebnisse werden zu den bisherigen dazugezählt.
//        Das geht so lange weiter, bis der Benutzer eingibt, dass er mit dem Ergebnis zufrieden ist.
//
//        Wie oft soll die Münze geworfen werden (INSGESAMT ungerade neue Zahl 1-10)?
//        99
//        Wie oft soll die Münze geworfen werden (INSGESAMT ungerade neue Zahl 1-10)?
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
//        Bist du mit dem Ergebnis zufrieden?
//        false
//        Wie oft soll die Münze geworfen werden (INSGESAMT ungerade neue Zahl 1-10)?
//        5
//        Wie oft soll die Münze geworfen werden (INSGESAMT ungerade neue Zahl 1-10)?
//        4
//        Werfe Münze… Kopf!
//        Werfe Münze… Zahl!
//        Werfe Münze… Zahl!
//        Werfe Münze…Kopf!
//        Summe Kopf: 5
//        Summe Zahl: 6
//        Bist du mit dem Ergebnis zufrieden?
//        true
//        Stefan bekommt das Ticket.
//
//        Anforderung 1: Das Ganze geht so lange weiter, bis bei der Frage zu der Zufriedenheit „true“ eingegeben wird.
//
//        Anforderung 2: Die Zahl die der Benutzer eingibt um festzulegen wie oft die Münze geworfen wird muss im Gesamten ungerade sein.
//        Wird beim ersten Mal z.B. die Zahl 7 gewählt (ungerade), kann beim zweiten Mal nicht noch einmal eine ungerade Zahl wie z.B. 5 gewählt werden (sonst wäre es insgesamt eine gerade Zahl).
//        Insgesamt darf die Zahl aber über 10 sein, nur nicht pro "Bist du mit dem Ergebnis zufrieden?"-Runde.