import java.util.Random;
import java.util.Scanner;

public class A09_MuenzeWerfen_V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random coin = new Random();
        int headAmount = 0;
        int tailAmount = 0;
        System.out.println("Wie oft soll die Muenze geworfen werden?");
        int toss = scan.nextInt();

        for(int i = 0; i < toss; ++i) {
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
        } else {
            System.out.println("Thomas hat gewonnen.");
        }

    }



}
//    MuenzeWerfenV2 (for-Schleife)
//    Stefan ist ein mieser Verlierer und mag nicht, dass ein einziger Münzwurf entscheidet, wer das Ticket bekommt.
//
//        Er macht dir den Vorschlag, dass ihr die Münze ja auch 5 Mal werfen könnt. Wer am öftesten gewinnt, bekommt das Ticket.
//
//        Benutze eine FOR-Schleife, um die Münze 5 Mal werfen zu lassen.
//
//        Lege 2 int-Variablen an, um zu speichern, wie oft die Münze auf Kopf gelandet ist und wie oft auf Zahl.
//
//        Nach jedem Wurf erhöhst du die entsprechende Variable um 1.
//
//        Nachdem die Münze 5 Mal geworfen wurde, gibst du aus, wie oft die Münze auf Kopf und auf Zahl gelandet ist:
//
//        Werfe Münze… Kopf!
//        Werfe Münze… Zahl!
//        Werfe Münze… Zahl!
//        Werfe Münze…Kopf!
//        Werfe Münze…Kopf!
//        Summe Kopf: 3
//        Summe Zahl: 2
//        Ich bekomme das Ticket.
//
//        Sobald das Programm mit 5x werfen funktioniert, ändere es so ab, dass der Benutzer über die Konsole eingeben kann, wie oft geworfen wird. Achtung: dadurch kann es vorkommen,
//        dass der Benutzer eine gerade Zahl (z.B. 4) eingibt und es zu einem Unentschieden kommt - was du bei der End-Ausgabe, wer gewonnen hat, einbauen musst!
//
//        Anforderung 1: Das Programm soll mit 5 Mal die Münze werfen funktionieren.
//
//        Anforderung 2: Wenn du das Programm öfter startest, sollen unterschiedliche Werte rauskommen
//
//        Anforderung 3: Dann ändere dein Programm so ab, dass der Benutzer über die Konsole (mit der Klasse Scanner) eingeben kann, wie oft die Münze geworfen wird.


