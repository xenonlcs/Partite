package com.partite.partita;

import java.util.ArrayList;

public class PartitaCalcio extends Partita {

    public static ArrayList<String> codiciPossibili = new ArrayList<>();

    private int tempoInCorso;

    public PartitaCalcio(String squadraCasa, String squadraOspite) {
        super(squadraCasa, squadraOspite);
        tempoInCorso = 1;
    }

    @Override
    public void aggiungiEvento(Evento evento) {
        if(codiciPossibili.contains(evento.getCodice())){
            eventList.add(evento);
        }else{
            System.err.println("Codice " +evento.getCodice() + " non valido");
        }
    }
}
