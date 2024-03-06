package esercizio2;

import java.util.ArrayList;
import java.util.List;

public class SIM {
    private String numeroTelefono;
    private double credito;
    private List<Chiamata> chiamate;

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0; // credito iniziale a 0
        this.chiamate = new ArrayList<>();
    }

    public void aggiungiChiamata(Chiamata chiamata) {
        if(chiamate.size() >= 5) {
            chiamate.remove(0); // Rimuove la chiamata più vecchia se la lista ne contiene già 5
        }
        chiamate.add(chiamata);
    }

    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + "€");
        System.out.println("Ultime 5 chiamate:");
        for(Chiamata chiamata : chiamate) {
            System.out.println("  Numero chiamato: " + chiamata.getNumeroChiamato() + ", Durata: " + chiamata.getDurata() + " min");
        }
    }

    // Getter e Setter come necessario
}

