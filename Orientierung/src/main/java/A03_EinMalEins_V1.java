public class A03_EinMalEins_V1 {
    public static void main(String[] args) {
        int a = 1;

        for(int b = 2; a <= 10; ++a) {
            System.out.println("" + a + " * " + b + " = " + a * b);
        }

    }
}


//    Wir wollen die 2er-Reihe vom kleinen 1x1 mit System.out.println() mit Hilfe von 2 int-Variablen namens a und b ausgeben, also in etwa so:
//
//        1 x 2 = 2
//        2 x 2 = 4
//        3 x 2 = 6
//        4 x 2 = 8
//        5 x 2 = 10
//        6 x 2 = 12
//        7 x 2 = 14
//        8 x 2 = 16
//        9 x 2 = 18
//        10 x 2 = 20
//
//        Anforderung 1: Wie beim Taschenrechner soll sowohl die Rechnung als auch das Ergebnis ausgegeben werden.
//
//        Anforderung 2: Arbeite mit a++ oder ++a bzw. mit b++ oder ++b, um diese Aufgabe zu erfüllen
//
//        Anforderung 3: Dein Programm soll so gestaltet sein, dass du mit nur einer einzigen Änderung im Code statt der 2er-Reihe auch die 3er, 4er oder 7er-Reihe ausgeben kannst.
