public class A02_Taschenrechner_V1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println("Erste Variable: " + a + "\nZweite Variable: " + b + "\n" + a + " + " + b + " = " + (a + b) + "\n" + a + " - " + b + " = " + (a - b) + "\n" + a + " * " + b + " = " + (a + b) + "\n" + a + " / " + b + " = " + (double)a / (double)b + "\n" + a + " % " + b + " = " + a % b);
    }
}

//    Wir programmieren einen einfachen Taschenrechner!
//
//        Lege 2 int-Variablen an und gebe ihnen Startwerte deiner Wahl, also z.B.:
//
//        a = 5
//        b = 3
//
//        Dann gib mit System.out.println() Zeile für Zeile aus:
//
//        Erste Variable: 5
//        Zweite Variable: 3
//        5 + 3 = 8
//        5 – 3 = 2
//        5 * 3 = 15
//        5 / 3 = 1,666666667
//        5 % 3 = 2
//
//        Anforderung 1: Dein Programm muss sowohl die beiden Variablen, die Rechnungen als auch die Ergebnisse ausgeben.
//
//        Anforderung 2: Änderst du eine oder beide der Variablen a und/oder b, müssen die Rechnungen, die daraus generiert werden, sich entsprechend mit ändern.
