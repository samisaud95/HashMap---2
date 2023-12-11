import java.util.*;
//Creare un hashmap prendere tutti i valori, ordinarli e stamparli

public class Main {
    public static void main(String[] args) {
        // Creo un HashMap che si chiama colori
        Map<String, String> Colori = new HashMap<>();

        // Aggiungo ogni colore, la chiave include "COLOR"
        Colori.put(" Blue", "Blue");
        Colori.put("Giallo", "Giallo");
        Colori.put(" Rosso", "Rosso");
        Colori.put(" Nero", "Nero");
        Colori.put(" Marrone", "Marrone");
        Colori.put(" Bianco", "Bianco");

        // Stampiamo tutti gli elementi della HashMap
        System.out.println("Gli Colori sono:" + Colori);

        // nella stampa si possono vederen tutti disordinati, mettiamoli tutti in ordine

        // Creiamo un ArrayList per ordinare la lista
        List<String> coloriOrdinato = new ArrayList<>(Colori.values());

        // Ordiniamo tutti i valori
        Collections.sort(coloriOrdinato);

        // Stampiamo questi valori ordinati dell' alfabeto
        System.out.println("Gli Colori Ordinati sono: " + coloriOrdinato);
    }
}