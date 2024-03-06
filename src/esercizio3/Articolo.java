package esercizio3;
public class Articolo {
    private String codiceArticolo;
    private String descrizione;
    private double prezzo;
    private int numeroPezzi;

    public Articolo(String codiceArticolo, String descrizione, double prezzo, int numeroPezzi) {
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.numeroPezzi = numeroPezzi;
    }

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public void setCodiceArticolo(String codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getNumeroPezzi() {
        return numeroPezzi;
    }

    public void setNumeroPezzi(int numeroPezzi) {
        this.numeroPezzi = numeroPezzi;
    }
}


