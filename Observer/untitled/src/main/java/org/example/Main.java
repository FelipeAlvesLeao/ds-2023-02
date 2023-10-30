package org.example;

public class Main {
    public static void main(String[] args) {
        Leiloeiro leiloeiroA = new Leiloeiro();
        Leiloeiro leiloeiroB = new Leiloeiro();
        Licitante licitante = new Licitante();

        licitante.registerObserver(leiloeiroA);
        licitante.registerObserver(leiloeiroB);

        licitante.setDinheiro("A", 1200);

        licitante.removeObserver(leiloeiroA);

    }
}