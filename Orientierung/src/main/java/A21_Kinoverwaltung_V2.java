import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class A21_Kinoverwaltung_V2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();

        double wallet;
        int chosenOptions = 1;

        double ticketPrice = 15;
        double snackPrice = 0;
        double totalPrice;

        int chooseAmountOfTickets = 0;

        int chooseAmountOfSnacks = 0;
        int amountOfChosenSnack = 0;


        int lottoCost = 5;
        int winPrice = 25;
        boolean gewinnspiel;

        ArrayList<Integer> chosenMoviesList = new ArrayList<>();
        ArrayList<Integer> chosenSnacksList = new ArrayList<>();

        String[][] movies = {
                {"1", "Batman", "20:15", "1", "2"},
                {"2", "Matrix", "22:00", "3", "9"},
                {"3", "Matrix 2", "17:00", "2", "0"}
        };
        String[][] cinemaProgram = {
                {"1", "Ticket Kaufen"},
                {"2", "Snacks Kaufen"},
                {"3", "Film ansehen"},
                {"4", "Snacks essen"},
                {"5", "Beim Gweinnspiel mitmachen (kostet 5€)"},
                {"6", "Kino Verlassen"}
        };
        String[][] snacks = {
                {"1", "Popcorn", "1.00", "30"},
                {"2", "Chips", "2.00", "20"},
                {"3", "Schokolade", "3.50", "10"},
        };


        System.out.println("Wie viel Geld hast du mit?");
        wallet = scanner.nextInt();

        if (wallet < 15) {
            System.out.println("Sie haben zu wenig Geld!.");
        } else {
            while (chosenOptions != 0) {
                for (int i = 0; i < cinemaProgram.length; i++) {
                    String options = cinemaProgram[i][1];
                    int chosenNumber = Integer.parseInt(cinemaProgram[i][0]);
                    System.out.println("   " + chosenNumber + "  " + options);
                }
                int chooseMovieNumber = 1;
                int chooseSnackNumber = 1;
                int chooseYourTicket = 1;
                int consumeSnackNumber = 1;

                System.out.println("Was willst du als naechstes tun?.");
                do {
                    chosenOptions = scanner.nextInt();
                    if (chosenOptions < 0 || chosenOptions > cinemaProgram.length) {
                        System.out.println("Bitte gib eine gueltige Auswahl ein!.");
                    }
                } while (chosenOptions < 0 || chosenOptions > cinemaProgram.length);

                if (chosenOptions == 0) {
                    System.out.println("Besuch uns bald wieder.");
                }

                if (chosenOptions == 1) {

                    while (chooseMovieNumber != 0) {
                        // String Formatierung
                        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Filmnr", "Filmname", "Uhrzeit", "Saal", "Restplaetze");

                        for (String[] movie : movies) {
                            int tickets = Integer.parseInt(movie[4]);
                            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", movie[0], movie[1], movie[2], movie[3], (tickets > 0 ? "verfügbar" : "ausgebucht"));
                        }

                        System.out.println("Welchen Film möchtest du schauen?\nDrücke 0 zum Abbrechen.");

                        do {
                            chooseMovieNumber = scanner.nextInt();
                            if (chooseMovieNumber < 0 || chooseMovieNumber > movies.length) {
                                System.out.println("Dieser Film existiert nicht!\nVersuch es nochmal.");
                            }
                        } while (chooseMovieNumber < 0 || chooseMovieNumber > movies.length);

                        if (chooseMovieNumber != 0) {

                            if (chooseMovieNumber > movies.length) {
                                System.out.println("Dieser Film existiert nicht!");
                            } else {


                                String[] movie = movies[chooseMovieNumber - 1];
                                int tickets = Integer.parseInt(movie[4]);


                                System.out.println("Es sind noch " + tickets + " Tickets um jeweils " + ticketPrice + " Euro verfügbar. Wie viele möchtest du kaufen?");
                                chooseAmountOfTickets = scanner.nextInt();
                                totalPrice = chooseAmountOfTickets * ticketPrice;
                                if (chooseAmountOfTickets < 0) {
                                    System.out.println("Minus geht nicht");
                                } else if (chooseAmountOfTickets > tickets) {
                                    System.out.println("Es gibt nicht so viele Tickets.");
                                } else if (wallet >= totalPrice) {
                                    wallet -= totalPrice;
                                    tickets -= chooseAmountOfTickets;
                                    movies[chooseMovieNumber - 1][4] = String.valueOf(tickets);
                                    System.out.println("Du kaufst " + chooseAmountOfTickets + " Tickets für " + totalPrice + " Euro und hast jetzt noch " + wallet + " Euro.");
                                    for (int i = 0; i < chooseAmountOfTickets; i++) {
                                        chosenMoviesList.add(Integer.parseInt(movie[0]));
                                    }

                                } else {
                                    System.out.println("Du hast zu wenig Geld!");
                                    chooseMovieNumber = 0;
                                }

                            }
                        }
                    }
                } else if (chosenOptions == 2) {
                    //snacks anfang------------------------------------------------------------------------------------------------------------
                    while (chooseSnackNumber != 0) {

                        System.out.printf("%-20s%-20s%-20s%-20s\n", "Nr", "Snack", "Preis", "Auf Lager");
                        for (String[] snack : snacks) {
                            amountOfChosenSnack = Integer.parseInt(snack[3]);
                            System.out.printf("%-20s%-20s%-20s%-20s\n", snack[0], snack[1], snack[2], (amountOfChosenSnack > 0 ? "verfügbar" : "ausverkauft"));
                        }
                        do {
                            chooseSnackNumber = scanner.nextInt();
                            if (chooseSnackNumber < 0 || chooseSnackNumber > snacks.length) {
                                System.out.println("Dieser Snack existiert nicht!\nVersuch es nochmal.");
                            }
                        } while (chooseSnackNumber < 0 || chooseSnackNumber > snacks.length);

                        if (chooseSnackNumber != 0) {
                            String[] snack = snacks[chooseSnackNumber - 1];
                            chooseAmountOfSnacks = Integer.parseInt(snack[3]);
                            snackPrice = Double.parseDouble(snack[2]);


                            System.out.println("Es sind noch " + chooseAmountOfSnacks + " Snacks um jeweils " + snackPrice + " Euro verfügbar. Wie viele möchtest du kaufen?");
                            amountOfChosenSnack = scanner.nextInt();
                            totalPrice = amountOfChosenSnack * snackPrice;
                            if (amountOfChosenSnack < 0) {
                                System.out.println("Minus geht nicht");
                            } else if (amountOfChosenSnack > chooseAmountOfSnacks) {
                                System.out.println("Es gibt nicht so viele Tickets.");
                            } else if (wallet >= totalPrice) {
                                wallet -= totalPrice;
                                chooseAmountOfSnacks -= amountOfChosenSnack;
                                snacks[chooseSnackNumber - 1][3] = String.valueOf(chooseAmountOfSnacks);
                                System.out.println("Du kaufst " + amountOfChosenSnack + " Snacks für " + totalPrice + " Euro und hast jetzt noch " + wallet + " Euro.");
                                for (int i = 0; i < amountOfChosenSnack; i++) {
                                    chosenSnacksList.add(Integer.parseInt(snack[0]));
                                }

                            } else {
                                System.out.println("Du hast zu wenig Geld!");
                                chooseSnackNumber = 0;
                            }

                        }
                    }

                } else if (chosenOptions == 3) {

                    while (chooseYourTicket != 0) {
                        System.out.printf("%-20s%-20s\n", "Nr", "Film");

                        for (int i = 0; i < chosenMoviesList.size(); i++) {
                            String[] movie = movies[chosenMoviesList.get(i) - 1];
                            System.out.printf("%-20s%-20s\n", movie[0], movie[1]);
                        }
                        System.out.println("Welchen Film (für den du noch ein Ticket hast) möchtest du sehen?\nDrücke 0 zum Abbrechen.");

                        do {
                            chooseYourTicket = scanner.nextInt();
                            if (!(chosenMoviesList.contains(chooseYourTicket)) && (chooseYourTicket != 0)) {
                                System.out.println("Deine Tickets haben nicht diese Nummer.\nVersuch es nochmal.");
                            }
                        } while (!(chosenMoviesList.contains(chooseYourTicket)) && (chooseYourTicket != 0));
                        if (chooseYourTicket != 0) {
                            chosenMoviesList.remove(Integer.valueOf(chooseYourTicket));

                            System.out.println("Du hast " + movies[chooseYourTicket - 1][1] + " ausgewählt. Viel Spaß!");
                        }
                    }

                } else if (chosenOptions == 4) {
                    while (consumeSnackNumber != 0) {
                        System.out.printf("%-20s%-20s\n", "Nr", "Snack");

                        for (int i = 0; i < chosenSnacksList.size(); i++) {
                            String[] snack = snacks[chosenSnacksList.get(i) - 1];
                            System.out.printf("%-20s%-20s\n", snack[0], snack[1]);
                        }

                        System.out.println("Welchen Film (für den du noch ein Ticket hast) möchtest du sehen?\nDrücke 0 zum Abbrechen.");

                        do {
                            consumeSnackNumber = scanner.nextInt();
                            if (!(chosenSnacksList.contains(consumeSnackNumber)) && (consumeSnackNumber != 0)) {
                                System.out.println("Deine Snacks haben nicht diese Nummer.\nVersuch es nochmal.");
                            }
                        } while (!(chosenSnacksList.contains(consumeSnackNumber)) && (consumeSnackNumber != 0));

                        if (consumeSnackNumber != 0) {
                            chosenSnacksList.remove(Integer.valueOf(consumeSnackNumber));
                            System.out.println("Du verspeist " + snacks[consumeSnackNumber - 1][1] + ".");
                        }
                    }

                } else if (chosenOptions == 5) {
                    int a = 1;
                    int b = 1;
                    int c = a + b;

                    System.out.println("Willst du beim Gewinnspiel mit machen? true oder false");
                    gewinnspiel = scanner.nextBoolean();

                    if (gewinnspiel) {

                        boolean gewonnen = false;

                        int x = ran.nextInt(200) + 1;
                        System.out.println("Du machst beim Gewinnspiel mit!");
                        System.out.println(" Deine Glückzahl ist : " + x);

                        if (x % 10 == 0) {
                            gewonnen = true;
                        }

                        if (!gewonnen) {
                            for (int i = 0; i < 10; i++) {
                                c = a + b;
                                System.out.println(a + " + " + b + " = " + c);
                                a = b;
                                b = c;
                                if (x == c) {
                                    gewonnen = true;
                                }
                            }
                        }

                        if (gewonnen) {
                            wallet -= lottoCost;
                            wallet += winPrice;
                            System.out.println(x + " ist eine Fibonacci-Nummer oder durch 10 teilbar! Du Gewinnst 20 Euro!");
                        } else {
                            wallet -= lottoCost;
                            System.out.println(x + " ist KEINE Fibonacci-Nummer. Leider nicht gewonnen.");
                        }
                    }

                } else if (chosenOptions == 6) {
                    System.out.println("Du verlässt das Kino. Auf wiedersehen!");
                    System.exit(0);
                }
            }
        }
    }
}






//    Ein Kinobesitzer in der Stadt in der du wohnst hat dich gebeten, ein Programm für sein Kino zu schreiben.
//
//        Als erstes wird der Benutzer des Programms aufgefordert einzugeben wie viel Geld er mit hat:
//
//        Wie viel Geld hast du mit?
//        20
//
//        Erstelle dann einen 2-dimensionalen String-Array, in dem du diverse Kino-Daten festlegst (movieName, startingTime, room, seatsLeft), sowie ein zweites 2-D-Array, in dem du Snackdaten eingibst (snackName, price, stockLeft).
//        (Achtung: Der Kino-Besitzer soll nur mit Änderungen an diesen Arrays sein Kino-Angebot selbst verändern können).
//
//        Im Kino angekommen, kann der Besucher folgendes machen:
//
//        Was willst du als nächstes tun? (Du hast noch 40.0€)
//        1. Ticket kaufen (von KinoVerwaltungV1)
//        2. Snacks kaufen
//        3. Film ansehen
//        4. Snacks essen
//        5. Beim Gewinnspiel mitmachen (kostet 5€)
//        6. Kino verlassen
//
//        Je nachdem, wofür er sich entscheidet, kommt er in verschiedene „Unterprogramme“:
//
//        Ticket kaufen (Auswahl 1)
//        Hinweis: Diesen Teil hast du schon in KinoVerwaltungV1 vorbereitet.
//
//        Im Kino seht ihr auf dem Monitor das Kinoprogramm. Dieses besteht aus verschiedensten Filmen, Uhrzeiten, einen Kinosaal, ausgebucht (j/n) und ob der Film ausgebucht ist (wenn seatsLeft > 0, dann kann man noch Tickets kaufen). Erstelle eine kleine Anzeigentafel in der Konsole in der du ein paar aktuelle Filme die du zb bei Cineplexx findest, anzeigst. Frage den Kinobesucher so lange, welchen Film er/sie sehen möchte, bis der Besucher einen nicht ausgebuchten Film wählt oder abbricht, ohne ein Ticket zu kaufen.
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
//        Speichere die Nummer des Films, den der Benutzer gekauft hat, in der ArrayList-Variable chosenMovies, und zwar so oft, wie der Benutzer den Film auch gekauft hat.
//
//        Jeder Kauf eines Nutzers reduziert die Anzahl verfügbarer Plätze für den Film entsprechend, und führt (falls keine Plätze mehr übrig sind) im Extremfall auch dazu, dass bei dem Film nun auch „ausgebucht“ steht (siehe oben).
//
//        Snacks kaufen (Auswahl 2)
//        Hier geht’s zur Snackbar. Dort gibt es ähnlich wie bei der Filmauswahl mindestens 3 verschiedene Snacks mit entsprechenden Preisen, z.B. so:
//
//        Nr Snack                   Preis     Auf lager?
//        -----------------------------------------------------
//        1. Popcorn                  1.00      auf Lager
//        2. Chips                    2.00      auf Lager
//        3. Schokolade               3.50      auf Lager
//        -----------------------------------------------------
//        Welchen (noch vorhandenen) Snack möchtest du kaufen? (0 zum abbrechen)
//        3
//        Es sind noch 2 Schokolade um jeweils 3.50€ verfügbar. Wie viele möchtest du kaufen?
//        1
//        Du kaufst 1 Schokolade um 3.5€ und hast jetzt noch 46.5€
//        Nr Snack                   Preis     Auf lager?
//        -----------------------------------------------------
//        1. Popcorn                  1.00      auf Lager
//        2. Chips                    2.00      auf Lager
//        3. Schokolade               3.50      auf Lager
//        -----------------------------------------------------
//        Welchen (noch vorhandenen) Snack möchtest du kaufen? (0 zum abbrechen)
//        0
//
//        Der Benutzer kann so lange einkaufen, wie er Geld mithat und das Geld für seine Wünsche reicht.
//
//        Will er etwas kaufen, wofür sein Geld nicht reicht, wird ihm das mitgeteilt. Den Rest, den er schon gekauft hat, bekommt er aber natürlich trotzdem, und bezahlt das Ganze auch.
//
//        Immer wenn er Snacks eingekauft hat, speicherst du diese Snacks in der ArrayList-Variable chosenSnacks.
//
//        Film ansehen (Auswahl 3)
//        Der Benutzer sieht eine Auswahl an Filmen, für die er Tickets gekauft hat (basierend am Inhalt der ArrayList chosenFilms), und kann einen davon wählen:
//
//        Welchen Film (für den du noch ein Ticket hast) möchtest du sehen? (0 für abbrechen)
//        1. Batman
//        2. Matrix
//        1
//        Du schaust dir den Film Batman an. Viel Spaß!
//
//        Danach wird dieser Film aus der ArrayList chosenFilms entfernt, damit der Benutzer nur dann nochmal den Film anschauen kann, wenn er auch mehrere Tickets dafür gekauft hat.
//
//        Hinweis 1: Du kannst dir aussuchen, ob der Benutzer immer nur 1 Film ansieht oder eingeben kann, wie viele er auf einmal ansehen will (z.B. wenn er mit seinen FreundInnen ins Kino gehen würde).
//
//        Hinweis 2: Du kannst dir aussuchen, ob du in der Liste der verfügbaren Filme diese mehrfach anzeigst, wenn sie mehrfach gekauft wurden, oder nur 1x/Filmart.
//
//        Snacks essen (Auswahl 4)
//        Dieser Punkt funktioniert recht ähnlich wie Film anschauen, nur wird ein Snack gegessen:
//
//        Welchen deiner Snacks willst du essen? (0 für abbrechen)
//        1. Schokolade
//        1
//        Du verspeist 1 Schokolade. Mjam!
//
//        Auch hier „verschwindet“ der gegessene Snack natürlich dabei aus der ArrayList chosenSnacks.
//
//        Hinweis 1: Du kannst dir aussuchen, ob der Benutzer immer nur 1 Snack isst oder eingeben kann, wie viele er auf einmal essen will.
//
//        Hinweis 2: Du kannst dir aussuchen, ob du in der Liste der verfügbaren Snacks diese mehrfach anzeigst, wenn sie mehrfach gekauft wurden, oder nur 1x/Snack.
//
//        Gewinnspiel (Auswahl 5)
//        Der Benutzer kann für 5€ bei einem Gewinnspiel mitmachen.
//
//        Kauft der Benutzer ein Los, erstellst du eine Zufallszahl zwischen 1 und 200. Dann überprüfst du, ob diese Zufallszahl ein Teil der Fibonacci-Folge ist.
//        (Hinweis: Den Algorithmus für die Fibonacci-Folge hast du in der Aufgabe KleinerAlgorithmusV1 bereits vorbereitet, du musst ihn nur hier einfügen und entsprechend anpassen)
//
//        Wenn die Zufallszahl Teil der Fibonacci-Folge oder durch 10 teilbar ist, bekommt der Benutzer 25€ (da das Gewinnspiel-Los 5€ gekostet hat, hat er also jetzt 20€ mehr als vorher)
//
//        Du machst beim Gewinnspiel mit!
//        Deine Glückszahl ist: 55
//        1 + 1 = 2
//        1 + 2 = 3
//        2 + 3 = 5
//        3 + 5 = 8
//        5 + 8 = 13
//        8 + 13 = 21
//        13 + 21 = 34
//        21 + 34 = 55
//        55 ist eine Fibonacci-Nummer! Du gewinnst 20€!
//
//        Wenn er kein Glück hatte, kostet ihn das 5€ für das Lotterielos (sein Geldbetrag wird also -5 gerechnet).
//
//        Du machst beim Gewinnspiel mit!
//        Deine Glückszahl ist: 23
//        1 + 1 = 2
//        1 + 2 = 3
//        2 + 3 = 5
//        3 + 5 = 8
//        5 + 8 = 13
//        8 + 13 = 21
//        13 + 21 = 34
//        23 ist KEINE Fibonacci-Nummer! Leider nicht gewonnen.
//
//        Kino verlassen (Auswahl 6)
//        Der Besucher wird verabschiedet:
//
//        Du verlässt das Kino. Auf wiedersehen!
//
//
//
//        Anforderung 1: Die Filmdaten und die Snack-Daten sollen durch den Kino-Betreiber direkt in den jeweiligen 2dimensionalen Arrays verändert werden können. Beide Daten-Arrays finden sich gleich am Beginn des Programms.
//
//        Anforderung 2: Wenn die Film-Daten oder Snack-Daten verändert werden, werden die veränderten Daten direkt ins Programm eingebaut, und du musst nichts mehr extra umprogrammieren.
//
//        Anforderung 3: Alle Benutzer-Eingaben sind auf dumme oder bösartige User abgesichert. So kann ein Besucher z.B. keinen Film 7 wählen, wenn es gar keinen Film 7 gibt. Was du nicht überprüfen musst, sind falsche Datentypen, also z.B. Buchstaben statt Zahlen bei den Eingaben.