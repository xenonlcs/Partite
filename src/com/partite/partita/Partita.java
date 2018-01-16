package com.partite.partita;


import java.util.ArrayList;

public abstract class Partita implements PartitaInterface{

    protected String squadraCasa;
    protected int punteggioCasa;
    protected String squadraOspite;
    protected int punteggioOspite;

    protected ArrayList<Evento> eventList;
    protected int cEvento;



    public Partita(String squadraCasa, String squadraOspite) {
        this.squadraCasa = squadraCasa;
        this.punteggioCasa = 0;
        this.squadraOspite = squadraOspite;
        this.punteggioOspite = 0;
        this.cEvento = 0;
        eventList = new ArrayList<>();
    }

    public String getSquadraCasa() {
        return squadraCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public int getPunteggioCasa() {
        return punteggioCasa;
    }

    public int getPunteggioOspite() {
        return punteggioOspite;
    }

    public int getcEvento() {
        return cEvento;
    }

    public void setcEvento(int cEvento) {
        this.cEvento = cEvento;
    }
}
