
import java.util.Scanner;

public class A20_KinoVerwaltung_V1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String outputText;
        int ticketPrice = 15;
        int wallet;
        int chosenMovieNumber;
        int amountOfSelectedTickets;
        int totalPrice;
        int allTicketsAmount = 0;
        boolean access;

        String[][] movies = {
                {"1", "Batman", "20:15", "1", "2"},
                {"2", "Matrix", "22:00", "3", "4"},
                {"3", "Matrix 2", "17:00", "2", "0"}
        };
        System.out.println("Wie viel Geld hast du mit?");
        wallet = scan.nextInt();

        if (wallet < 15) {
            System.out.println("Sie haben zu wenig Geld!.");
        } else {
            for (int i = 0; i < movies.length; i++) {
                allTicketsAmount += Integer.parseInt(movies[i][4]);
            }
            do {
                if (allTicketsAmount == 0) {
                    System.out.println("""
                            Alle Tickets wurden ausverkauft.
                            Beehre uns bald wieder.""");
                    chosenMovieNumber = 0;
                } else {
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Filmnr", "Filmname", "Uhrzeit", "Saal", "Restplaetze");
                    for (String[] movie : movies) {
                        int tickets = Integer.parseInt(movie[4]);
                        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", movie[0], movie[1], movie[2], movie[3], (tickets > 0 ? "verfuegbar" : "ausgebucht"));
                    }
                    System.out.println("allTicketsAmount: " + allTicketsAmount);

                    System.out.println("""
                            \n\nWelchen Film willst du schauen?
                            Schreib 0 zum abbrechen.""");
                    do {
                        chosenMovieNumber = controlNumberInput();
                        if (chosenMovieNumber > movies.length) {
                            System.out.println("Dieser Film existiert nicht!");
                        }
                    } while (chosenMovieNumber > movies.length);

                    if (chosenMovieNumber == 0) {
                        System.out.println("Das Programm wurde beendet.");
                    } else {
                        String[] movie = movies[chosenMovieNumber - 1];
                        int tickets = Integer.parseInt(movie[4]);
                        if (tickets <= 0) {
                            System.out.println("Dieser Film ist ausgebucht!\n");
                        } else {

                            do {
                                System.out.print("Fuer den Film " + movie[1]);
                                outputText = tickets == 1 ? " gibt es noch ein Ticket um " + ticketPrice + " Euro.\nWillst du es kaufen?" :
                                        " sind noch " + tickets + " Tickets um jeweils " + ticketPrice + " verfuegbar.\nWie viele moechtest du haben?";
                                outputText = outputText + "\nDruecke 0 zum Abbrechen.";
                                System.out.println(outputText);
                                access = tickets == 1 ? approval() : true;
                                if (access) {
                                    amountOfSelectedTickets = tickets == 1 ? 1 : controlNumberInput();
                                    if (amountOfSelectedTickets > tickets) {
                                        System.out.println("So viele Tickets gibt es nicht.");
                                    }
                                }else{
                                    amountOfSelectedTickets = 0;
                                }
                            } while (amountOfSelectedTickets > tickets);

                            if (amountOfSelectedTickets == 0) {
                                chosenMovieNumber = -1;
                            } else {
                                totalPrice = amountOfSelectedTickets * ticketPrice;
                                if (wallet >= totalPrice) {
                                    wallet -= totalPrice;
                                    tickets -= amountOfSelectedTickets;
                                    movies[chosenMovieNumber - 1][4] = String.valueOf(tickets);


                                    outputText = amountOfSelectedTickets == 1 ? "Du hast fuer den Film " + movie[1] + " ein Tickets um " + totalPrice + " Euro gekauft." :
                                            "Du hast fuer den Film " + movie[1] + " " + amountOfSelectedTickets + " Tickets um " + totalPrice + " Euro gekauft.";
                                    outputText = outputText + "\nDu hast jetzt noch " + wallet + " Euro uebrig.\n";
                                    System.out.println(outputText);
                                    allTicketsAmount -= amountOfSelectedTickets;
                                } else {
                                    System.out.println("Du hast leider dafuer nicht genuegend Geld dabei.");
                                }
                            }
                        }
                    }
                }

            } while (chosenMovieNumber != 0);
        }
    }


    public static int controlNumberInput() {
        int chooseNumber;
        Scanner scan = new Scanner(System.in);
        while (true) {
            if (!scan.hasNextInt()) {
                System.out.println("Du kannst nur eine Zahl reinschreiben.");
                scan.nextLine();
            } else {
                chooseNumber = scan.nextInt();
                if (chooseNumber < 0) {
                    System.out.println("Du kannst keine negative Zahlen eingeben.");
                } else {
                    return chooseNumber;
                }
            }
        }
    }

    public static boolean approval() {
        Scanner scan = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Antworte mit 'ja' oder 'nein'");
            String text = scan.next();
            if (text.equals("ja") || text.equals("JA") || text.equals("Ja") || text.equals("jA")) {
                return true;
            } else if (text.equals("nein") || text.equals("Nein") || text.equals("NEIN") || text.equals("neiN")) {
                return false;
            }
        }
    }

}




//    Stell dir vor, du bist im Kino. Im Kino seht ihr auf dem Monitor das Kinoprogramm. Dieses besteht aus verschiedensten Filmen, Uhrzeiten, einen Kinosaal, ausgebucht (j/n) und ob der Film ausgebucht ist (wenn seatsLeft > 0, dann kann man noch Tickets kaufen). Erstelle eine kleine Anzeigentafel in der Konsole in der du ein paar aktuelle Filme die du zb bei Cineplexx findest, anzeigst. Frage den Kinobesucher so lange, welchen Film er/sie sehen möchte, bis der Besucher einen nicht ausgebuchten Film wählt oder abbricht, ohne ein Ticket zu kaufen.
//
//        Am Anfang wird der Benutzer gefragt, wie viel Geld er mit hat. Ein jedes Kino-Ticket kostet 15€, egal welches.
//
//        Wählte er einen nicht ausgebuchten Film, wird er gefragt, wie viele Tickets er will. Hat er genügend Geld dafür UND sind noch genügend Plätze frei, bekommt er seine Tickets. Dabei werden das Geld was er bezahlt von seinem Geld abgezogen, und die freien Plätze für den jeweiligen Film weniger.
//        (Hinweis: du kannst mit der Methode Integer.parseInt(„25“) einen String in einen int umwandeln, und mit der Methode String.valueOf(23) einen int in einen String zurückumwandeln.
//
//        Das wiederholt sich so lange, bis der Benutzer die Zahl 0 eingibt.
//
//        Das könnte z.B. so aussehen:
//
//        Filmnr   Filmname              Uhrzeit     Saal     Restplätze
//        --------------------------------------------------------------
//        1.       Batman                  20:15        1      verfügbar
//        2.       Matrix                  22:00        3      verfügbar
//        3.       Matrix 2                17:00        2     ausgebucht
//        --------------------------------------------------------------
//        Welchen (nicht ausgebuchten) Film möchtest du sehen? (0 zum abbrechen)
//        2
//        Es sind noch 2 Tickets um jeweils 15€ dafür verfügbar. Wie viele möchtest du kaufen?
//        2
//        Du kaufst 2 Tickets um 30€ und hast jetzt noch 20.0€
//        Filmnr   Filmname              Uhrzeit     Saal     Restplätze
//        --------------------------------------------------------------
//        1.       Batman                  20:15        1      verfügbar
//        2.       Matrix                  22:00        3     ausgebucht
//        3.       Matrix 2                17:00        2     ausgebucht
//        --------------------------------------------------------------
//        Welchen (nicht ausgebuchten) Film möchtest du sehen? (0 zum abbrechen)
//        0
//
//        Speichere die Nummer des Films, den der Benutzer gekauft hat, in der ArrayList-Variable chosenMovies, und zwar so oft, wie der Benutzer den Film auch gekauft hat. Wenn also der Benutzer 2x den Film Batman und danach 1x den Film Matrix kauft, steht in der ArrayList [1, 1, 2].
//
//        Jeder Kauf eines Nutzers reduziert die Anzahl verfügbarer Plätze für den Film entsprechend, und führt (falls keine Plätze mehr übrig sind) im Extremfall auch dazu, dass bei dem Film nun auch „ausgebucht“ steht (siehe oben).
//
//        Anforderung 1: Verwende zum Speichern der Film-Daten einen 2-dimensionalen String-Array!
//        Anforderung 2: Wenn der Kino-Besitzer die Film-Daten im Film-Array verändert (z.B. einen Film hinzufügt oder mehr Plätze in einem Kino-Saal zulässt), muss das Programm trotzdem funktionieren!
//
//        Anforderung 3: Jede Benutzer-Eingabe muss auf ihre Sinnhaftigkeit überprüft werden! Z.B. soll es nicht möglich sein, bei der Anzahl der zu kaufenden Tickets eine Minuszahl einzugeben!