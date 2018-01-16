package com.partite.graphics;

import com.partite.partita.PartitaPallavolo;

import javax.swing.*;
import java.awt.*;

public class PallavoloPanelUp extends JPanel {

    public PallavoloPanelUp(PartitaPallavolo partitaPallavolo) {
        setLayout(new GridLayout(1,3));
        JLabel squadraCasa = new JLabel(partitaPallavolo.getSquadraCasa());
        JLabel setInCorso = new JLabel(partitaPallavolo.getSetInCorso() + "");
        JLabel squadraOspite = new JLabel(partitaPallavolo.getSquadraOspite());
        add(squadraCasa);
        add(setInCorso);
        add(squadraOspite);
    }
}
