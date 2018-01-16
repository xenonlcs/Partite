package com.partite.main;

import com.partite.graphics.TabellonePallavolo;
import com.partite.partita.Evento;
import com.partite.partita.Partita;
import com.partite.partita.PartitaCalcio;
import com.partite.partita.PartitaPallavolo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {

        PartitaCalcio.codiciPossibili.add("C-00");
        PartitaCalcio.codiciPossibili.add("C-01");
        PartitaCalcio.codiciPossibili.add("C-02");
        PartitaCalcio.codiciPossibili.add("C-04");
        PartitaCalcio.codiciPossibili.add("C-05");
        PartitaCalcio.codiciPossibili.add("C-98");
        PartitaCalcio.codiciPossibili.add("C-99");


        PartitaPallavolo.codiciPossibili.add("V-00");
        PartitaPallavolo.codiciPossibili.add("V-01");
        PartitaPallavolo.codiciPossibili.add("V-02");
        PartitaPallavolo.codiciPossibili.add("V-03");
        PartitaPallavolo.codiciPossibili.add("V-04");
        PartitaPallavolo.codiciPossibili.add("V-05");
        PartitaPallavolo.codiciPossibili.add("V-06");
        PartitaPallavolo.codiciPossibili.add("V-98");
        PartitaPallavolo.codiciPossibili.add("V-99");


        Partita p1 = new PartitaCalcio("Juventus","Inter");
        PartitaPallavolo p2 = new PartitaPallavolo("Virtus Bologna","Riso Scotti");

        try {
            FileReader fileCalcio = new FileReader("calcio.txt");
            FileReader fileVolley = new FileReader("volley.txt");

            BufferedReader inCalcio = new BufferedReader(fileCalcio);
            BufferedReader inPallavolo = new BufferedReader(fileVolley);

            String temp;
            while((temp = inCalcio.readLine())!=null){
                Evento eventoCalcio = new Evento(temp);
                p1.aggiungiEvento(eventoCalcio);
            }

            while((temp = inPallavolo.readLine())!=null){
                Evento eventoPallavolo = new Evento(temp);
                p2.aggiungiEvento(eventoPallavolo);
            }


            inCalcio.close();
            inPallavolo.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        new TabellonePallavolo(p2);
        System.out.println("END");

    }
}
