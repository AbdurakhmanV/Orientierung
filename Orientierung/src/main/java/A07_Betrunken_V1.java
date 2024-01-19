import java.util.Scanner;

public class A07_Betrunken_V1 {
    public static void main(String[] args) {
        Scanner scannerForUser = new Scanner(System.in);
        System.out.println("Mein Sohn wie viel Bier hast du getrunken?");
        int beer = scannerForUser.nextInt();
        System.out.println("Mein Sohn viele Shots hast du getrunken?");
        int shots = scannerForUser.nextInt();
        if (beer + shots == 0) {
            System.out.println("Du bist nicht betrunken Sohn.");
        } else if (beer + shots <= 2) {
            System.out.println("Du bist leicht betrunken Sohn.");
        } else if (beer + shots <= 6) {
            if (beer == 6) {
                System.out.println("Du bist betrunken mein Sohn.");
            } else {
                System.out.println("Mein Sohn du bist hoffnungslos betrunken.");
            }
        } else if (beer + shots > 6) {
            System.out.println("Mein Sohn du bist hoffnungslos betrunken.");
        }

    }
}





//    Du diskutierst mit deinem 16-jährigen Sohn darüber, ab wie vielen Getränken man definitiv zu viel Alkohol getrunken hat. Er redet immer nur von „ein paar Bier“ oder „ein paar Shots“.
//
//        Du entscheidest, genaue Regeln aufzustellen, ab wann er für dich basierend auf den Werten der beiden int-Variablen „beer“ und „shots“ als betrunken gilt:
//
//        ·        Wenn es 0 Getränke waren -> „gar nicht betrunken“
//
//        ·        Wenn es zusammen 1 bis 2 Getränke waren -> „leicht betrunken“
//
//        ·        Maximal 6 Getränke, wenn es nur Bier war und sonst nichts -> „Betrunken“
//
//        ·        Sonst -> „Hoffnungslos betrunken“
//
//        Schreib ein Programm, das mit den 2 Variablen (Bier und Shots) errechnet, ob der Sohn als betrunken gilt.
//
//        Der Benutzer gibt ein, wie viele Bier und/oder Shots er getrunken hat.
//
//        Dann soll das Programm ihm sagen, was sein Ergebnis ist:
//
//        ·        „Gar nicht betrunken“
//
//        ·        „Leicht betrunken“
//
//        ·        „Betrunken“
//
//        ·        „Hoffnungslos betrunken“
//
//        Wie viel Bier hast du getrunken?
//        3
//        Wie viel Shots hast du getrunken?
//        0
//        Du bist betrunken.
//
//        Anforderung 1: Es darf immer nur 1 Ergebnis rauskommen, und die Ergebnisse müssen stimmen.
//
//        Anforderung 2: Löse die Aufgabe mit Hilfe von IF und ELSE
//
//        Anforderung 3: Wir kümmern uns nur um sinnvolle Eingaben – Eingaben wie -3 Bier oder Buchstaben statt Zahlen sind uns (noch) egal.

