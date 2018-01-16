package com.partite.graphics;

import com.partite.partita.PartitaPallavolo;

import javax.swing.*;
import java.awt.*;

public class PallavoloPanelDown extends JPanel {
    public PallavoloPanelDown(PartitaPallavolo partitaPallavolo) {
        setLayout(new GridLayout(1,2));
        JLabel timeoutCasa = new JLabel("" + partitaPallavolo.getTimeoutSetCasa());
        JLabel timeoutOspite = new JLabel("" + partitaPallavolo.getTimeoutSetOspite());


        add(timeoutCasa);
        add(timeoutOspite);

    }
}
