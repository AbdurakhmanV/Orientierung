import java.util.Random;

public class A16_GaudiMitArrays_V1 {
    public static void main(String[] args) {
        Random randomChooser = new Random();
        int[] myNumbersArray = {5, 13, 144, 9, 3, 12, 317, 8, 33, 27};
        int[] randomNumbersArray = new int[100];
        boolean[] booleanArray = new boolean[10];

        int i;
        for (i = 0; i < randomNumbersArray.length; ++i) {
            randomNumbersArray[i] = randomChooser.nextInt(100);
        }

        for (i = 0; i < booleanArray.length; ++i) {
            if (i % 2 == 0) {
                booleanArray[i] = true;
            } else {
                booleanArray[i] = false;
            }
        }

        for (i = 0; i < booleanArray.length; ++i) {
            System.out.println(booleanArray[i]);
        }

    }
}


//-        Lege einen eindimensionalen Array mit 10 beliebigen int-Werten an, den du mit Hilfe der geschwungenen Klammern {} befüllst.
//
//        -        Lege mit Hilfe von Schleifen einen zweiten eindimensionalen Array mit 100 int-Werten an, den du mit Zufallszahlen zwischen 0 und 100 befüllst.
//
//        -        Lege mit Hilfe von Schleifen einen dritten eindimensionalen Array mit 10 boolean Werten an, wobei auf jedes true in diesem Array ein false folgt und umgekehrt (es kommt also abwechselnd true und false vor).
//
//        Anforderung 1: Programmiere dein Programm so, dass du nur an einer Stelle etwas ändern musst, um den letzten Array auf 100 Elemente erweitern zu können, und immer noch sind die Werte in dem Array abwechselnd true oder false sind.