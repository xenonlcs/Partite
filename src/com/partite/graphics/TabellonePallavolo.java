package com.partite.graphics;

import com.partite.partita.PartitaCalcio;
import com.partite.partita.PartitaPallavolo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabellonePallavolo extends JFrame {

    PartitaPallavolo pp;

    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;

    public TabellonePallavolo(PartitaPallavolo pp){
        this.pp = pp;

        setSize(WIDTH, HEIGHT);
        setLayout(new GridLayout(4,1));

        PallavoloPanelUp panelUp = new PallavoloPanelUp(this.pp);
        PallavoloPanelMid panelMid = new PallavoloPanelMid(this.pp);
        PallavoloPanelDown panelDown = new PallavoloPanelDown(this.pp);
        JButton nextEvent = new JButton("Prossimo evento");

        ActionButton ab1= new ActionButton(pp,this);
        nextEvent.addActionListener(ab1);

        Container contentPane = getContentPane();

        contentPane.add(panelUp);
        contentPane.add(panelMid);
        contentPane.add(panelDown);
        contentPane.add(nextEvent);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

    }
}
