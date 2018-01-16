package com.partite.partita;

import java.util.ArrayList;

public class PartitaPallavolo extends Partita {

    public static ArrayList<String> codiciPossibili = new ArrayList<>();

    private int setInCorso;
    private int setCasa;
    private int setOspite;
    private int timeoutSetCasa;
    private int timeoutSetOspite;

    public PartitaPallavolo(String squadraCasa, String squadraOspite) {
        super(squadraCasa, squadraOspite);

        setInCorso = 1;
        this.setCasa = 0;
        this.setOspite = 0;
        this.timeoutSetCasa = 0;
        this.timeoutSetOspite = 0;
    }



    @Override
    public void aggiungiEvento(Evento evento) {
        if(codiciPossibili.contains(evento.getCodice())){
            eventList.add(evento);
        }else{
            System.err.println("Codice " +evento.getCodice() + " non valido");
        }
    }

    public int getSetCasa() {
        return setCasa;
    }

    public int getSetOspite() {
        return setOspite;
    }

    public int getTimeoutSetCasa() {
        return timeoutSetCasa;
    }

    public int getTimeoutSetOspite() {
        return timeoutSetOspite;
    }

    public int getSetInCorso() {
        return setInCorso;
    }

    public void eseguiEvento(){

        if(cEvento<eventList.size()){
            Evento temp = eventList.get(cEvento);
            if(temp.getCodice().equals("V-00")){
                //iniziopartita
            }else if(temp.getCodice().equals("V-01")){
                setInCorso+=1;
            }else if(temp.getCodice().equals("V-02")){
                //fineset
            }else if(temp.getCodice().equals("V-03")){
                punteggioCasa+=1;
            }else if(temp.getCodice().equals("V-04")){
                punteggioOspite+=1;
            }else if(temp.getCodice().equals("V-05")){
                timeoutSetCasa+=1;
            }else if(temp.getCodice().equals("V-06")){
                timeoutSetOspite+=1;
            }else if(temp.getCodice().equals("V-98")){
                //commentogenerico
            }else if(temp.getCodice().equals("V-99")){
                //finepartita
            }
        }

        cEvento++;
    }
}
