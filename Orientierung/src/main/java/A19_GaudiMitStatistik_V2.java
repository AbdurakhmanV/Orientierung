import java.util.Random;
import java.util.Scanner;

public class A19_GaudiMitStatistik_V2 {
    public static void main(String[] args) {
        Scanner scannerForUser = new Scanner(System.in);
        Random randomChooser = new Random();
        int[] accidentalNumbers = new int[5];
        int b = -1;

        int a;
        for (a = 0; a < accidentalNumbers.length; ++a) {
            accidentalNumbers[a] = randomChooser.nextInt(100);
        }

        String answer;
        do {
            System.out.println("Sollen die ungerodneten Werte ausgegeben werden?\nAntworte mit 'ja' oder 'nein'.");
            answer = scannerForUser.next();
        } while (!answer.equals("ja") && !answer.equals("nein"));

        int i;
        int c;
        int randomNumbersCopy;
        int[] var10;
        if (answer.equals("ja")) {
            System.out.println("ungeordnete Array Elemente:");
            var10 = accidentalNumbers;
            i = accidentalNumbers.length;

            for (c = 0; c < i; ++c) {
                randomNumbersCopy = var10[c];
                System.out.print("" + randomNumbersCopy + " ");
            }
        }

        do {
            System.out.println("\nSollen die gerodneten Werte ausgegeben werden?\nAntworte mit 'ja' oder 'nein'.");
            answer = scannerForUser.next();
        } while (!answer.equals("ja") && !answer.equals("nein"));

        for (a = accidentalNumbers.length - 1; a >= 0; --a) {
            ++b;

            for (i = 0; i < accidentalNumbers.length - b; ++i) {
                if (accidentalNumbers[a] < accidentalNumbers[i]) {
                    c = accidentalNumbers[a];
                    accidentalNumbers[a] = accidentalNumbers[i];
                    accidentalNumbers[i] = c;
                }
            }
        }

        var10 = accidentalNumbers;
        i = accidentalNumbers.length;

        for (c = 0; c < i; ++c) {
            randomNumbersCopy = var10[c];
            System.out.print("" + randomNumbersCopy + " ");
        }

        scannerForUser.close();
    }
}


//    Um statistische Auswertungen vorzunehmen, müssen wir unsere Werte oftmals in die richtige Reihenfolge bringen.
//
//        -        Lege einen int-Array mit 100 zufälligen Werten von jeweils 0-100 an.
//
//        -        Entwerfe auf dem Papier (Pseudo-Code und/oder Ablaufdiagramm) einen nachvollziehbaren Algorithmus, um diese zufälligen Werte aufsteigend zu ordnen.
//
//        -        Probiere deine Lösungs-Idee in IntelliJ aus.
//
//        Anforderung 1: Der Algorithmus in deinem Programm muss mit deinem Pseudo-Code und/oder Ablauf-Diagramm auf dem Papier zusammenpassen.
//
//        Anforderung 2: Die Aufgabe besteht natürlich darin, selbst einen Sortier-Algorithmus zu entwerfen und nicht einfach nur .sort() zu verwenden ;)