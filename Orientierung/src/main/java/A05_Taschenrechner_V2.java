import java.util.Scanner;

public class A05_Taschenrechner_V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        char operator;

        System.out.println("Das ist ein Taschenrechner mit den Variablen a und b und den vier Grundrechenarten.\nWaehle eine Zahl fuer die Variable a aus.");
        a = scan.nextInt();
        System.out.println("Waehle nun eine Zahl fuer b aus.");
        b = scan.nextInt();
        System.out.println("Welche Grundrechenart soll verwendet werden. Gib eines von den Zeichen '+, -, *, /' aus.\nDu darfst auch den Modulo verwenden.");
        scan.nextLine();
        operator = scan.nextLine().charAt(0);

        switch(operator){
            case '+': System.out.println(a + " + " + b + " = "+ (a+b)); break;
            case '-': System.out.println(a + " - " + b + " = "+ (a-b));break;
            case '*': System.out.println(a + " * " + b + " = "+ (a*b));break;
            case '/': System.out.println(a + " / " + b + " = "+ ((double)a/b));break;
            case '%': System.out.println(a + " % " + b + " = "+ (a%b));break;
            default: System.out.println("Du darfst nur eines dieser Zeichen '+,-,*,/, %' verwenden!");
        }
    }
}



//Achtung: Lies dir erst das Tutorial zum Thema SWITCH/CASE durch, bevor du hier weiterarbeitest! Du findest es bei den Tutorials weiter oben über der Aufgabenliste.
//
//        Nun werden wir unseren Taschenrechner upgraden!
//
//        Benutze den Scanner, um die beiden Zahlen für die Berechnung vom Benutzer eingeben zu lassen.
//
//        Zusätzlich lässt du den Benutzer eine Variable vom Datentyp char eingeben, um den Operator (+, -, *, /, %) auszuwählen, mit dem gerechnet werden soll. Verwende dazu nicht .nextInt() sondern .nextLine().charAt(0) – dieser Befehl nimmt das erste Zeichen eines eingegebenen Strings und speichert ihn. Achtung: Wenn du von .nextInt() auf .nextLine() wechselst, musst do dazwischen noch einmal ein .nextLine() einfügen, sonst funktioniert das Ganze nicht richtig.
//
//        Um dir etwas Arbeit zu ersparen, kannst du den folgenden Code-Block einfach 1:1 in deine main-Methode übernehmen:
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Gib die erste Zahl ein:");
//        int a = sc.nextInt();
//        System.out.println("Gib die zweite Zahl ein:");
//        int b = sc.nextInt();
//
//        System.out.println("Gib den Operator (+, -, *, /, %) ein:");
//        sc.nextLine(); // ohne diesem Befehl klappt es nicht
//        char operator = sc.nextLine().charAt(0);
//        Je nachdem, welcher Operator gewählt wurde, soll eine andere Rechnung angezeigt werden. Verwende SWITCH/CASE, um hier mehrere verschiedene Programmflüsse zu realisieren. (Siehe die Hilfestellungen über den einzelnen Aufgaben für Erklärungen zu SWITCH/CASE).
//
//        Achtung: Wenn der Benutzer ein zum Beispiel ein +Symbol eingegeben hat, verwendest du case ‘+‘: – du brauchst also die einfachen Anführungsstriche beim case, weil es ja ein char-Datentyp ist! Genauso würdest du, wenn du eine String-Variable mit switch überprüfst, z.B. case "Linz": schreiben
//
//        Hier z.B. mit den Eingaben 6, 4 und ‘-‘:
//
//        Gib die erste Zahl ein:
//        6
//        Gib die zweite Zahl ein:
//        4
//        Gib den Operator (+, -, *, /, %) ein:
//        -
//        6 – 4 = 2
//
//        Anforderung 1: Es soll nur die Rechnung für den ausgewählten Operator angezeigt werden. Alle anderen nicht.
//
//        Anforderung 2: Das Programm soll mit allen 5 Operatoren funktionieren
//
//        Anforderung 3: Wenn beim Operator ein anderes Zeichen als +, -, *, / oder % eingegeben wurde, wird statt einer Rechnung „Falscher Operator“ ausgegeben.
