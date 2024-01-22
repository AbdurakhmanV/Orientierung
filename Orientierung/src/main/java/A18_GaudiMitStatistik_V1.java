public class A18_GaudiMitStatistik_V1 {
    public static void main(String[] args) {
        String sentence = "Das wussten wir damals nicht. Erst seit 223 Tagen. #Wusstest du es?!";
        char[] sentenceAnalysingArray = sentence.toCharArray();
        int bigLetterAmount = 0;
        int smallLetterAmount = 0;
        int numbersAmount = 0;
        int symbolAmount = 0;

        for(int i = 0; i < sentenceAnalysingArray.length; ++i) {
            if (sentenceAnalysingArray[i] >= 'A' && sentenceAnalysingArray[i] <= 'Z') {
                ++bigLetterAmount;
            } else if (sentenceAnalysingArray[i] > 'Z' && sentenceAnalysingArray[i] <= 'z') {
                ++smallLetterAmount;
            } else if (sentenceAnalysingArray[i] >= '0' && sentenceAnalysingArray[i] <= '9') {
                ++numbersAmount;
            }

            if (sentenceAnalysingArray[i] > '0') {
                ++symbolAmount;
            }
        }

        System.out.println("Grossbuchstaben: " + bigLetterAmount + "\nKleinbuchstaben: " + smallLetterAmount + "\nZahlen: " + numbersAmount + "\nSonstige Zeichen: " + symbolAmount);
    }
}


//    Lege eine String-Variable mit einem Satz an, in dem Großbuchstaben, Kleinbuchstaben, Zahlen und Sonderzeichen vorkommen, z.B. folgender:
//
//        „Unter #Handy finden sich 6 große Anbieter, 2 davon sind aber die besten!“
//
//        Dann schreibe ein Programm, dass jedes einzelne Zeichen im String darauf überprüft, in welche Gruppe es gehört:
//
//        -        Großbuchstabe
//
//        -        Kleinbuchstabe
//
//        -        Zahlen
//
//        -        Sonstige Zeichen (#, ?, Leerzeichen, …)
//
//        Gib aus, wie viele im String zu finden sind:
//
//        Content: Unter #Handy finden sich 6 große Anbieter, 2 davon sind aber die besten!
//        Großbuchstaben: 3
//        Kleinbuchstaben: 51
//        Zahlen: 2
//        Sonstige Zeichen: 16
//
//        Hinweis: die folgenden Funktionen/Informationen werden hilfreich sein:
//
//        -        Mit der Funktion .charAt() bekommst du von einem String das Zeichen an einer bestimmten Stelle:
//        char z = Niklas.charAt(2) // ‚k‘ als char-Wert zurückgeben
//        Das erste Zeichen im String bekommst du mit .charAt(0), das zweite mit .charAt(1) usw.
//
//        -        Mit der Funktion .toCharArray() kannst du aus einem String einen char[]-Array generieren lassen, der alle Zeichen des Strings einzeln als char-Werte in ein Array packt.
//        char[] myArr = „Ich bin super“.toCharArray(); // erzeugt char[] mit den Zeichen des Strings
//
//        Mit Hilfe der ASCII-Tabelle kannst du herausfinden, welcher int-Wert hinter welchem char-Zeichen steckt (schau dazu in der Spalte „dec“, was für Dezimalsystem steht). Mit diesen int-Werten kannst du auch rechnen oder sie in IF und Schleifen verwenden:
//        char z = ‘B‘;
//        z++;
//        System.out.println(z); // gibt ‚C‘ aus
//        if (z > ‘Z‘) {
//        System.out.println(„Geht übers Alphabet hinaus!“);
//        }