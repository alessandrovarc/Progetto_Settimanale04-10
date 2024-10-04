package alessandro_varchetta.Class;

import java.time.LocalDate;

public class GiochiDaTavolo extends Games {

    private int numeroGiocatori;
    private int durataPartita;

    public GiochiDaTavolo(int id, String titolo, int annoDiPubblicazione, double price, int numeroGiocatori, int durataPartita) {
        super(id, titolo, annoDiPubblicazione, price);
        if(numeroGiocatori < 2 || numeroGiocatori > 10) {
            throw new IllegalArgumentException("il numero dei giocatori non è nel range concesso!!");
        }
        this.numeroGiocatori = numeroGiocatori;
        this.durataPartita = durataPartita;
    }

    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }

    public void setNumeroGiocatori(int numeroGiocatori) {
        this.numeroGiocatori = numeroGiocatori;
    }

    public int getDurataPartita() {
        return durataPartita;
    }

    public void setDurataPartita(int durataPartita) {
        this.durataPartita = durataPartita;
    }
}
