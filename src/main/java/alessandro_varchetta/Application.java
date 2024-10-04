package alessandro_varchetta;

import alessandro_varchetta.Class.Games;
import alessandro_varchetta.Class.GiochiDaTavolo;
import alessandro_varchetta.Class.Videogames;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Collezione collezione = new Collezione();

        Scanner scanner = new Scanner(System.in);

        List<Games> listaGiochi = Arrays.asList(
                new Videogames(1, "Tekken 8", 2024, 79.90, "PS5,XBOX,PC", 90, Videogames.Genere.PICCHIADURO),
                new Videogames(2, "Genshin Impact",2020, 00.00,"PS5, XBOX,PC", 80, Videogames.Genere.ACTION_RPG),
                new Videogames(3,"Bayonetta 3",2020, 49.90, "Nintendo Switch, PC", 110, Videogames.Genere.AVVENTURA ),
                new Videogames(4, "FIFA 25", 2024, 79.90, "PS5, XBOX, PC",95, Videogames.Genere.SPORT),
                new GiochiDaTavolo(5,"Risiko", 2010, 35.50, 6, 3),
                new GiochiDaTavolo(6,"Monopoly", 1990, 29.90, 6, 4),
                new GiochiDaTavolo(7, "Mercante in fiera", 2000, 29.90, 8, 2)
        );

        for(Games giocoSingolo: listaGiochi) {
            try {
                collezione.aggiungiGioco(giocoSingolo);
            } catch (IllegalArgumentException error) {
                System.out.println(error.getMessage());
            }
        }
        int choice = 0;
        do {
            System.out.println(" \n Menu:");
            System.out.println("1: Aggiungi il gioco");
            System.out.println("2: cerca il gioco per ID");
            System.out.println("3: cerca il gioco per il prezzo");
            System.out.println("4: ricerca per il numero di giocatori");
            System.out.println("5: rimuovi un elemento tramite ID");
            System.out.println("6: stampa la lista dei Giochi");

            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("chiudi il programma");
                    break;
                case 2:

            }

        }
    }
}
