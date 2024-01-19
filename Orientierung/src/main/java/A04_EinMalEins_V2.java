import java.util.Scanner;

public class A04_EinMalEins_V2 {
    public static void main(String[] args) {
        Scanner scannerForUser = new Scanner(System.in);
        int a = 1;

        System.out.println("Dieses Programm rechnet eine Malreihe aus.\nWhaele eine Malreihe aus, indem du eine Zahl in die Konsole reinschreibst.");
        int b = scannerForUser.nextInt();


        while(a<=10){
            System.out.println(a + " * " + b + " = " + (a*b));
            a++;
        }
    }
}

//Achtung: Lies dir erst das Tutorial zum Thema Scanner bis zum 2. Kapitel durch, bevor du hier weiterarbeitest! Du findest es bei den Tutorials weiter oben über der Aufgabenliste.
//
//        Wir wollen die Version 1 unseres 1x1-Programms so erweitern, dass der Benutzer in der Konsole eingeben kann, welche Reihe er berechnet haben will, also z.B. die 3er, die 6er oder die 7er-Reihe.
//
//        Gib dazu einen entsprechenden Aufforderungs-Satz mit Hilfe von System.out.println() aus.
//
//        Dann lass den Benutzer mit Hilfe der Scanner-Klasse einen Wert für die Variable eingeben, die die Art der Reihe bestimmt. Wenn der Benutzer also z.B. die Zahl 3 eingibt, gibst du die 3er-Reihe aus. Gibt er 7 ein, die 7er-Reihe, usw.
//
//        Hier ein Beispiel, wie das Ganze in etwa aussehen könnte, falls der Benutzer die Zahl 6 eingibt:
//
//        Welche Reihe soll ausgegeben werden?
//        6
//        1 x 6 = 6
//        2 x 6 = 12
//        3 x 6 = 18
//        4 x 6 = 24
//        5 x 6 = 30
//        6 x 6 = 36
//        7 x 6 = 42
//        8 x 6 = 48
//        9 x 6 = 54
//        10 x 6 = 60
//
//        Anforderung 1: Wir gehen davon aus, dass der Benutzer auf jeden Fall eine Zahl eingeben wird und keine Buchstaben oder Ähnliches. Es ist kein dummer oder bösartiger User.
//
//        Anforderung 2: Je nachdem, was der Benutzer eingibt, wird eine andere Reihe des 1x1 ausgegeben.
