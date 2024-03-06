package esercizio3;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    private Cliente cliente;
    private List<Articolo> articoli;
    private double totaleCosto;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new ArrayList<>();
        this.totaleCosto = 0.0;
    }

    public void aggiungiArticolo(Articolo articolo) {
        articoli.add(articolo);
        totaleCosto += articolo.getPrezzo();
    }

    public void rimuoviArticolo(Articolo articolo) {
        if(articoli.remove(articolo)) { // Rimuove l'articolo se presente
            totaleCosto -= articolo.getPrezzo();
        }
    }

    // Metodo per calcolare il totale potrebbe non essere necessario dato che il totaleCosto viene aggiornato
    // dinamicamente con ogni aggiunta o rimozione

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Articolo> getArticoli() {
        return new ArrayList<>(articoli); // Restituisce una copia dell'elenco per evitare modifiche esterne
    }

    // Il metodo setArticoli potrebbe non essere necessario o desiderabile qui
    // dato che gli articoli vengono gestiti tramite i metodi aggiungiArticolo e rimuoviArticolo.
    // Per impostare direttamente l'elenco  si potrebbe aggiungere qui

    public double getTotaleCosto() {
        return totaleCosto;
    }

    // Non è fornito un setTotaleCosto poiché il totale viene calcolato automaticamente
    // basandosi sulle operazioni di aggiunta e rimozione degli articoli.
}

