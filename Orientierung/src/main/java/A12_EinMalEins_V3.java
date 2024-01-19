public class A12_EinMalEins_V3 {
    public static void main(String[] args) {
        System.out.println("Dieser Taschenrechner zeigt dir alle Malreihen von 1 bis 10 an.");
        int a = 1;
        int b = 1;

        while (a <= 10 && b <= 10) {
            System.out.println("" + a + " * " + b + " = " + a * b);
            ++a;
            if (a == 11) {
                System.out.println();
                a = 1;
                ++b;
            }

        }
    }
}


//    Ändere dein Programm so ab, dass es nicht nur z.B. die 2er-Reihe oder die 3er-Reihe ausgibt, sondern alle Reihen von 1-10. Nutze dafür entweder verschachtelte Schleifen oder eine Schleife und ein IF/ELSE.
//
//        1 * 1 = 1
//        2 * 1 = 2
//        3 * 1 = 3
//        4 * 1 = 4
//        5 * 1 = 5
//        6 * 1 = 6
//        7 * 1 = 7
//        8 * 1 = 8
//        9 * 1 = 9
//        10 * 1 = 10
//        1 * 2 = 2
//        2 * 2 = 4
//        3 * 2 = 6
//        4 * 2 = 8
//        5 * 2 = 10
//        6 * 2 = 12
//        7 * 2 = 14
//        8 * 2 = 16
//        9 * 2 = 18
//        10 * 2 = 20
//        1 * 3 = 3
//        2 * 3 = 6
//        …… und so weiter bis….
//        7 * 9 = 63
//        8 * 9 = 72
//        9 * 9 = 81
//        10 * 9 = 90
//        1 * 10 = 10
//        2 * 10 = 20
//        3 * 10 = 30
//        4 * 10 = 40
//        5 * 10 = 5
//        6 * 10 = 60
//        7 * 10 = 70
//        8 * 10 = 80
//        9 * 10 = 90
//        10 * 10 = 100
//
//        Anforderung 1: Du solltest am Ende genau 100 Zeilen in der Konsole haben, von 1*1=1 bis 10*10=100