import java.util.Scanner;

public class A08_Betrunken_V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mein Sohn! Darfst du ueberhaupt Autofahren?");
        System.out.println("Wie alt bist du?");
        int age = scan.nextInt();
        if (age < 17) {
            System.out.println("Du darfst ueberhaupt nicht Auto fahren.");
        } else {
            System.out.println("Mein Sohn hast du einen Fuehrerschein?\nAntworte mit 'true' oder 'false'.");
            scan.nextLine();
            boolean licence = scan.nextBoolean();
            if (!licence) {
                System.out.println("Du darfst ueberhaupt nicht Auto fahren.");
            } else {
                System.out.println("Mein Sohn wie viel Bier hast du getrunken?");
                int beer = scan.nextInt();
                System.out.println("Mein Sohn wie viele Shots hast du getrunken?");
                int shots = scan.nextInt();
                if (beer + shots == 0 ) {
                    System.out.println("Du darfst fahren mein Sohn.");
                } else if (beer + shots <= 2 && age >= 19) {
                    System.out.println("Du bist leicht betrunken Sohn und darfst noch fahren.\nIch aber sage, so nicht!!!");
                } else {
                    System.out.println("So nicht!!!");
                }
            }
        }

    }
}




//    Dein Sohn ist mittlerweile etwas älter geworden und hat mit 17 den Führerschein gemacht.
//
//        Bis er 19 ist, darf er beim Auto fahren gar nicht betrunken sein.
//
//        Wenn er mindestens 19 ist, darf er auch leicht betrunken Auto fahren, aber nicht mehr.
//
//        Lege zusätzlich zu den bisherigen Variablen noch zwei Variablen an, deren Werte du mit Hilfe des Scanners einliest:
//
//        ·        age (int)
//
//        ·        license (boolean)
//
//        Erweitere dein altes Programm so, dass es nun bestimmen kann, ob der Sohn Auto fahren darf.
//
//        Dies hängt davon ab:
//
//        ·        Wie alt er ist (er muss mind. 17 sein, sonst darf er gar nicht fahren)
//
//        ·        Ob er einen Führerschein dabei hat (er muss ihn dabei haben, sonst darf er nicht fahren)
//
//        ·        Wie betrunken er ist (bis 19 darf er gar nicht getrunken haben, ab 19 nur leicht betrunken)
//
//        Wie alt bist du?
//        20
//        Hast du deinen Führerschein dabei?
//        true
//        Wie viel Bier hast du getrunken?
//        1
//        Wie viel Shots hast du getrunken?
//        1
//        Du darfst Auto fahren.
//
//        Anforderung 1: Es darf immer nur 1 Ergebnis rauskommen, und die Ergebnisse müssen stimmen.
