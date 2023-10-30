package org.example;
import java.util.ArrayList;
import java.util.List;

public class Licitante implements Observable {
    private String nome;
    private int dinheiro;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(String LicitanteNome, int LicitanteDinheiro) {
        for(Observer observer: observers) {observer.update(LicitanteNome, LicitanteDinheiro);}
    }

    public void setDinheiro(String nome, int dinheiro) {notifyObservers(nome, dinheiro);}
}
