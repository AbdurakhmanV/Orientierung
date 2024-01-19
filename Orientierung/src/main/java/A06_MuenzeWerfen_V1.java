import java.util.Random;

public class A06_MuenzeWerfen_V1 {
    public static void main(String[] args) {
        Random r = new Random();

        boolean kopf = r.nextBoolean(); // zufälliger Wert von true oder false

        if(kopf){
            System.out.println("Die Muenze ist auf Kopf gelandet.\nIch habe gewonnen.");
        }
        else{
            System.out.println("Die Muenze ist auf Zahl gelandet.\nThomas hat gewonnen.");
        }

    }
}


//    Stell dir vor, dein Freund Stefan hat dir vorgeschlagen, eine Münze zu werfen, um herauszufinden, wer das letzte Ticket zu dem Konzert bekommt, zu dem ihr beide hinwollt.
//
//        Bei Kopf gewinnst du, bei Zahl bekommt er das Ticket.
//
//        Lege eine boolean-Variable an, in der du speicherst, ob die Münze auf Kopf liegen geblieben ist oder nicht (true = Kopf, false = Zahl).
//
//        Schreibe ein Programm, das dir basierend auf deiner boolean-Variable ausgibt, wer jetzt das Ticket bekommt – du oder Stefan.
//
//        Dann nutze die Random-Klasse, um zufällig zu bestimmen, ob in deiner boolean-Variable der Wert true oder false drinstehen soll (eben wie wenn man tatsächlich eine Münze werfen würde).
//
//        Die Klasse Random funktioniert so (du brauchst in diesem Fall nur die .nextBoolean()-Methode:
//
//        Random r = new Random();
//
//        boolean kopf = r.nextBoolean(); // zufälliger Wert von true oder false
//
//
//        Die Ausgabe in der Konsole sollte dann entweder so aussehen (wenn die boolean-Variable true ist):
//
//        Die Münze ist auf Kopf gelandet – ich gewinne.
//
//        Oder so (wenn die boolean-Variable false ist)
//
//        Die Münze ist auf Zahl gelandet – Stefan gewinnt.
//
//        Anforderung 1: Es wird nur einer der beiden Sätze ausgegeben
//
//        Anforderung 2: Wenn du das Programm mehrmals startest, kommen unterschiedliche Ergebnisse raus, weil der Wert der boolean-Variable ja zufällig bestimmt wird.
//
