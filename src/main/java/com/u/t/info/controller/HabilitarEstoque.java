/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.controller;

import com.u.t.info.view.TelaSupervisor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author agata
 */
public class HabilitarEstoque implements ActionListener{

    private TelaSupervisor tela;

    public HabilitarEstoque(TelaSupervisor tela) {
        this.tela = tela;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        tela.getCardLayout().show(tela.getPainel(), "1");
    }

}
