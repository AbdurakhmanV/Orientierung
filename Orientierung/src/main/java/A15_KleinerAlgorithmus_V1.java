import java.util.Scanner;

public class A15_KleinerAlgorithmus_V1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = 1;
            int b = 1;
            System.out.println("What should be the counter for the algorithm?");
            int counter = scan.nextInt();

            for(int i = 0; i < counter; ++i) {
                int c = a + b;
                System.out.println("" + a + " + " + b + " = " + c);
                if (a < b) {
                    a = c;
                } else {
                    b = c;
                }
            }
        }
    }


//    Lege 4 int-Variablen a, b, c und counter an.
//
//            Die ersten beiden Zahlen a und b sind anfangs 1.
//
//            Die dritte Zahl c ist die Summe aus den ersten beiden Zahlen.
//
//            Nun soll die nächste Zahl die Summe aus den beiden vorherigen sein, und so weiter.
//
//            Jeden Schritt gibst du auf der Konsole mit System.out.println() aus.
//
//            Das Ganze wiederholst du so oft, wie es die Variable counter bestimmt.
//
//            Ein Beispiel für counter = 5:
//
//            1 + 1 = 2
//            1 + 2 = 3
//            2 + 3 = 5
//            3 + 5 = 8
//            5 + 8 = 13
//
//            Überlege dir dazu ein Ablauf-Diagramm oder/und Pseudo-Code, BEVOR du anfängst zu programmieren! Probiere deine Lösung mit einem Schreibtischtest (Tabelle) aus.
//
//            Erst wenn du einen Lösungs-Ansatz hast, von dem du glaubst, dass er funktionieren könnte, programmierst du ihn auch in IntelliJ.
//
//            Anforderung 1: Dein Ablauf-Diagramm und/oder dein Pseudo-Code soll deinem Programm-Code entsprechen.
//
//            Anforderung 2: Verwende dazu maximal 5 Variablen.


