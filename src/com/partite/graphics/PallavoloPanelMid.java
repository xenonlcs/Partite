package com.partite.graphics;

import com.partite.partita.Partita;
import com.partite.partita.PartitaPallavolo;
import sun.misc.JavaLangAccess;

import javax.swing.*;
import java.awt.*;

public class PallavoloPanelMid extends JPanel{
    PartitaPallavolo partitaPallavolo;
    JLabel setCasa;
    JLabel punteggioCasa;
    JLabel punteggioOspite;
    JLabel setOspite;

    public PallavoloPanelMid(PartitaPallavolo partitaPallavolo) {
        setLayout(new GridLayout(1,4));
        setCasa = new JLabel("" + partitaPallavolo.getSetCasa());
        punteggioCasa = new JLabel("" + partitaPallavolo.getPunteggioCasa());
        punteggioOspite = new JLabel("" + partitaPallavolo.getPunteggioOspite());
        setOspite = new JLabel("" + partitaPallavolo.getSetOspite());

        add(setCasa);
        add(punteggioCasa);
        add(punteggioOspite);
        add(setOspite);

        this.partitaPallavolo=partitaPallavolo;
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponents(g);
        setCasa.setText("" + partitaPallavolo.getSetCasa());
        punteggioCasa.setText("" + partitaPallavolo.getPunteggioCasa());
        punteggioOspite.setText("" + partitaPallavolo.getPunteggioOspite());
        setOspite.setText("" + partitaPallavolo.getSetOspite());

    }
}
