import java.util.Scanner;

public class A10_Taschenrechner_V3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                
                Das ist ein Taschenrechner mit den Variablen a und b und den vier Grundrechenarten.
                
                Waehle zuerst einen Operator von den Zeichen '+, -, *, /, %' aus.
                Durch 'x' wird das Programm beendet.
                Du darfst auch den Modulo verwenden.
                """);
        String text;
        char operator;
        do {
            do {
                System.out.println("Whaele zuerst einen Operator aus.");
                text = scan.next();
                if(text.length() != 1){
                    operator = 'a';
                }else{
                    operator = text.charAt(0);
                }
                if(operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%' && operator != 'x'){
                    System.out.println("""
                            Die Eingabe muss korrekt sein.
                            Der Operator kann nur eines von diesen Zeichen '+, -, *, /, %'sein.""");
                }
            } while(operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%' && operator != 'x');

            if (operator == 'x') {
                System.out.println("Das Programm wurde beendet.");
            } else {
                System.out.println("Waehle nun eine Zahl fuer die Variable a aus.");
                int a = scan.nextInt();
                System.out.println("Waehle nun eine Zahl fuer die Variable b aus.");
                int b = scan.nextInt();
                switch (operator) {
                    case '%':
                        System.out.println("" + a + " % " + b + " = " + a % b);
                        break;
                    case '*':
                        System.out.println("" + a + " * " + b + " = " + a * b);
                        break;
                    case '+':
                        System.out.println("" + a + " + " + b + " = " + (a + b));
                        break;
                    case '-':
                        System.out.println("" + a + " - " + b + " = " + (a - b));
                        break;
                    case '/':
                        System.out.println("" + a + " / " + b + " = " + (double)a / (double)b);
                }
                System.out.println();
            }
        } while(operator != 'x');

    }
}


//    Wir wollen einem „echten“ Taschenrechner nun noch näher kommen.
//
//        Ändere deinen Taschenrechner so ab, dass du den Operator (+, -, *, /, %) als erstes eingibst, und dann erst die beiden Zahlen.
//
//        Mit Hilfe einer WHILE-Schleife sorgst du dafür, dass man immer wieder Zahlen und Operatoren eingeben kann.
//
//        Wenn man beim Operator ‚X‘ eingibt, wird man nicht mehr nach den Zahlen gefragt. Die Schleife wird beendet und das Programm endet auch.
//
//        Gib den Operator (+, -, *, /, %) ein:
//        -
//        Gib die erste Zahl ein:
//        6
//        Gib die zweite Zahl ein:
//        4
//        6 – 4 = 2
//        Gib den Operator (+, -, *, /, %) ein:
//        *
//        Gib die erste Zahl ein:
//        8
//        Gib die zweite Zahl ein:
//        3
//        8 * 3 = 24
//        Gib den Operator (+, -, *, /, %) ein:
//        X
//
//
//        Anforderung 1: Der Taschenrechner muss so lange nach neuen Operatoren und Zahlen fragen, bis man ‚X‘ als Operator eingibt.
//
//        Anforderung 2: Gibt man etwas anders als die 5 Operatoren (+, -, *, /, %) oder ‚X‘ ein, wird man nicht nach den 2 Zahlen gefragt, sondern darf gleich einen neuen Operator eingeben.
//
//        Anforderung 3: Gibt man ‚X‘ als Operator ein, endet das Programm, ohne dass man nochmal nach den 2 Zahlen gefragt wird.