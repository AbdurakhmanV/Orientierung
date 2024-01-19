public class A14_CleanThis_V1 {
    public static void main(String[] args) {
        int age = 17;
        boolean withAdult = false;
        boolean vip = true;

        if (age >= 4 && age < 16 && withAdult || age >= 16) {
            if (age >= 18) System.out.println("Gründes Band");
            else if (age >= 16) System.out.println("Gelbes Band");
            else System.out.println("Rotes Band");
            if (vip) System.out.println("Goldenes Band dazu!");
            else System.out.println("Kein goldenes Band dazu!");
        } else System.out.println("Kein Zutritt!");
    }
}



//    Lege eine neue Klasse namens „CleanThis“ an, in die du den Code unten reinkopierst (Warnung: er ist von einem schlechten Programmierer programmiert und funktioniert nicht richtig. Und selbst dort, wo es funktioniert, geht das auch besser.)
//
//        „Kürze“ dann das Programm auf unter X Zeilen, in dem du alles was nicht notwendig ist entfernst bzw. so umschreibst, dass es den Anforderungen unten entspricht.
//
//        Auf wie viele Zeilen kannst du es kürzen?
//
//        Was das Programm können muss:
//
//        Wir besuchen ein Festival! Die Farbe deiner Armbändchen bestimmt, ob du Alkohol konsumieren und auch in den Backstage Bereich darfst.
//
//        Dafür wird folgendes am Eingang kontrolliert:
//
//        -        Bist du mindestens 18, bekommst du ein grünes Armbändchen.
//
//        -        Bist du zwischen 16 und 18, bekommst du ein gelbes Band
//
//        -        Kinder zwischen 4 und 15 Jahren dürfen nur eintreten, wenn eine Begleitperson
//        dabei ist. Diese erhalten ein rotes Armbändchen.
//
//        -        Alle anderen dürfen das Festivalgelände nicht betreten
//
//        Zusätzlich gilt:
//
//        -        Hast du ein VIP-Ticket gekauft, bekommst du zusätzlich zu dem oben ermittelten
//        Bändchen auch noch ein goldenes dazu. (aber nur, wenn du zu den Personen gehörst, die das Festival betreten dürfen!)
//
//        -        Sind die Bedingungen nicht erfüllt, reichen die farbigen Armbänder (grün, gelb, rot) oder „kein Zutritt“ von oben
//
//        Ermittle, welche Armbändchenfarbe der Besucher erhält (und ob er ein VIP-Ticket bekommt),
//        und gib diese Information in der Konsole aus.
//
//
//        Die noch nicht optimierte Version:
//
//public class CleanThisOriginal {
//
//    public static void main(String[] args) {
//
//        int age = 17;
//
//        boolean withAdult = true;
//
//        boolean VIP = true;
//
//
//
//        if (age >= 18) {
//
//            System.out.println("Grünes Band");
//
//            if (VIP == true) {
//
//                System.out.println("Goldenes Band dazu!");
//
//            }
//
//            else {
//
//                System.out.println("Kein goldenes Band dazu!");
//
//            }
//
//        }
//
//        if (age >= 16 && age < 18) {
//
//            System.out.println("Gelbes Band");
//
//            if (VIP == true) {
//
//                System.out.println("Goldenes Band dazu!");
//
//            }
//
//            else {
//
//                System.out.println("Kein goldenes Band dazu!");
//
//            }
//
//        }
//
//        if (age >= 4 && age < 16) {
//
//            if (withAdult == true) {
//
//                System.out.println("Rotes Band");
//
//                if (VIP == true) {
//
//                    System.out.println("Goldenes Band dazu!");
//
//                }
//
//                else {
//
//                    System.out.println("Kein goldenes Band dazu!");
//
//                }
//
//            }
//
//            else if (withAdult == false) {
//
//                System.out.println("Kein Zutritt");
//
//            }
//
//        }
//
//        if (age < 4) {
//
//            System.out.println("Kein Zutritt");
//
//        }
//
//    }
//
//}
//
//
//Anforderung 1: Trotz all deiner Kürzungen muss das Programm trotzdem noch mit allen Fällen laut Angabe funktionieren.
//
//        Anforderung 2: Es zählt nicht als Zeilen-Reduktion, wenn du einfach mehrere Befehlszeilen nebeneinander schreibst. Deine „Kürzung“ muss einen echten Mehrwert für das Programm haben und darf das Programm nicht unübersichtlicher machen.
//
//        Anforderung 3: Kürze das gesamte Programm auf maximal 20-25 Zeilen (eine Anzahl von < 20 ist durchaus möglich!)
