/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.GeneradorSudoku;
import Vista.JFInicio;
import Vista.JFJuego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tatiduran
 */
public class Inicio implements ActionListener{
    private JFInicio inicio;
    private JFJuego juego=new JFJuego();
    
    public Inicio(JFInicio ini){
        this.inicio=ini;
        inicio.setVisible(true);
        this.inicio.getBtnFacil().addActionListener(this);
        this.inicio.getBtnMedio().addActionListener(this);
        this.inicio.getBtnDificil().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.inicio.getBtnFacil())){
            juego.setVisible(true);
            Juego sud=new Juego(juego, 40);
            this.inicio.dispose();
        }else if(e.getSource().equals(this.inicio.getBtnMedio())){
            juego.setVisible(true);
            Juego sud=new Juego(juego, 50);
            this.inicio.dispose();
        }else if(e.getSource().equals(this.inicio.getBtnDificil())){
            juego.setVisible(true);
            Juego sud=new Juego(juego, 60);
            this.inicio.dispose();
        }
    
    }
    
}
