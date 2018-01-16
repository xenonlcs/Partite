package com.partite.partita;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Evento {
    private String codice;
    private String descrizione;
    private Date data;


    public Evento(String temp) throws ParseException {
        String[] temp1 = temp.split("\t");
        codice = temp1[0];
        descrizione = temp1[1];

        String datetime = temp1[2];
        String[] temp2 = datetime.split("\\s");
        String[] date = temp2[0].split("/");
        String[] time = temp2[1].split(":");

        data =  new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(datetime);
    }

    public String getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Date getData() {
        return data;
    }

}
