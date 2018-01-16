package com.partite.graphics;

import com.partite.partita.Partita;
import com.partite.partita.PartitaPallavolo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionButton implements ActionListener{
    private int cEvento;
    private PartitaPallavolo pp;
    private TabellonePallavolo tabellonePallavolo;

    public ActionButton(PartitaPallavolo pp, TabellonePallavolo tabellonePallavolo){
        this.pp = pp;
        this.tabellonePallavolo = tabellonePallavolo;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        pp.eseguiEvento();
        tabellonePallavolo.repaint();
    }
}
