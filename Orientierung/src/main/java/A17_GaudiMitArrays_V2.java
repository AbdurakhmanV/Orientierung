import java.util.Scanner;

public class A17_GaudiMitArrays_V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] alphabetArray = new char[26];
        char first = 'A';
        char last = 90;
        int allLetters = alphabetArray.length;

        System.out.println("\n" + alphabet);
        System.out.println("""
                Um wie viele Stellen sollen die Buchstaben im Alphabet verschoben werden?"
                Gib die Anzahl der Stellen an. 
                Eine positive Zahl verschiebt das Alphabet nach rechts und eine negative Zahl nach rechts.""");

        int shiftAmount = scan.nextInt();
        shiftAmount %= 26;

        int shiftAmountCopy = shiftAmount - 1;
        int i;

        if (shiftAmount >= 0) {
            for (i = shiftAmount; i < alphabetArray.length; ++i) {
                alphabetArray[i] = first++;
            }

            for (i = 0; i < shiftAmount; ++i) {
                alphabetArray[i] = last;
                alphabetArray[i] = (char) (alphabetArray[i] - shiftAmountCopy);
                --shiftAmountCopy;
            }
        } else {
            for (i = allLetters + shiftAmount; i < alphabetArray.length; ++i) {
                alphabetArray[i] = first++;
            }

            for (i = 0; i < allLetters + shiftAmount; ++i) {
                alphabetArray[i] = last;
                alphabetArray[i] = (char) (alphabetArray[i] - (allLetters + shiftAmountCopy));
                --shiftAmountCopy;
            }
        }

        for (i = 0; i < alphabetArray.length; ++i) {
            System.out.print(alphabetArray[i] + " ");
        }

    }
}



//    Lege einen char-Array an, den du mit allen Großbuchstaben füllst, die existieren (also A-Z). Du kannst dazu auch einen String verwenden, den du mit .toCharArray() in einen char-Array umwandelst:
//
//        ABCDEFGHIJKLMNOPQRSTUVWXYZ
//
//        Erstelle zusätzlich eine int-Variable namens howMuch, die du zum Testen mal auf 3 setzt.
//
//        Schreibe nun einen Algorithmus, der dir den gesamten Inhalt des Arrays um den Wert howMuch (anfangs 3) nach „rechts“ verschiebt. Die Buchstaben, die sich rechts nicht mehr im Array ausgehen, werden vorne im Array wieder angefügt:
//
//        XYZABCDEFGHIJKLMNOPQRSTUVW
//
//        Anforderung 1: Dein Programm soll mit einer beliebigen positiven Zahl für howMuch funktionieren.
//
//        Anforderung 2: Dein Programm soll auch mit Minus-Zahlen funktionieren. Dann verschiebt sich alles nach links statt nach rechts.
//
//        Hinweis: Möglicherweise hilft dir die ASCII-Tabelle dabei, diese Aufgabe zu lösen…?


