package Class;

import java.time.LocalDate;

public class Videogames extends Games {

    private String piattaforma;
    private int durataOre;
    private String genere;

    public Videogames(int id, String titolo, LocalDate annoDiPubblicazione, double price) {
        super(id, titolo, annoDiPubblicazione, price);
        this.piattaforma = piattaforma;
        this.durataOre = durataOre;
        this.genere = genere;
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }

    public int getDurataOre() {
        return durataOre;
    }

    public void setDurataOre(int durataOre) {
        this.durataOre = durataOre;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
