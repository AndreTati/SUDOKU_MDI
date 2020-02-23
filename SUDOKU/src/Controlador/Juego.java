/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.GeneradorSudoku;
import Vista.JFInicio;
import Vista.JFJuego;
import Vista.JFJuegoResuelto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author tatiduran
 */
public class Juego implements ActionListener, KeyListener{
    private JFJuego sudoku;
    private JFJuegoResuelto resuelto = new JFJuegoResuelto();
    private GeneradorSudoku generador;
    private JFInicio inicio=new JFInicio();

    public Juego(JFJuego juego, int n){
        this.sudoku=juego;
        this.generador = new GeneradorSudoku(n);
        sudoku.setVisible(true);
        this.sudoku.getBtnVolver().addActionListener(this);
        this.sudoku.getTxt00().addKeyListener(this);
        this.sudoku.getTxt01().addKeyListener(this);
        this.sudoku.getTxt02().addKeyListener(this);
        this.sudoku.getTxt03().addKeyListener(this);
        this.sudoku.getTxt04().addKeyListener(this);
        this.sudoku.getTxt05().addKeyListener(this);
        this.sudoku.getTxt06().addKeyListener(this);
        this.sudoku.getTxt07().addKeyListener(this);
        this.sudoku.getTxt08().addKeyListener(this);
        this.sudoku.getTxt10().addKeyListener(this);
        this.sudoku.getTxt11().addKeyListener(this);
        this.sudoku.getTxt12().addKeyListener(this);
        this.sudoku.getTxt13().addKeyListener(this);
        this.sudoku.getTxt14().addKeyListener(this);
        this.sudoku.getTxt15().addKeyListener(this);
        this.sudoku.getTxt16().addKeyListener(this);
        this.sudoku.getTxt17().addKeyListener(this);
        this.sudoku.getTxt18().addKeyListener(this);
        this.sudoku.getTxt20().addKeyListener(this);
        this.sudoku.getTxt21().addKeyListener(this);
        this.sudoku.getTxt22().addKeyListener(this);
        this.sudoku.getTxt23().addKeyListener(this);
        this.sudoku.getTxt24().addKeyListener(this);
        this.sudoku.getTxt25().addKeyListener(this);
        this.sudoku.getTxt26().addKeyListener(this);
        this.sudoku.getTxt27().addKeyListener(this);
        this.sudoku.getTxt28().addKeyListener(this);
        this.sudoku.getTxt30().addKeyListener(this);
        this.sudoku.getTxt31().addKeyListener(this);
        this.sudoku.getTxt32().addKeyListener(this);
        this.sudoku.getTxt33().addKeyListener(this);
        this.sudoku.getTxt34().addKeyListener(this);
        this.sudoku.getTxt35().addKeyListener(this);
        this.sudoku.getTxt36().addKeyListener(this);
        this.sudoku.getTxt37().addKeyListener(this);
        this.sudoku.getTxt38().addKeyListener(this);
        this.sudoku.getTxt40().addKeyListener(this);
        this.sudoku.getTxt41().addKeyListener(this);
        this.sudoku.getTxt42().addKeyListener(this);
        this.sudoku.getTxt43().addKeyListener(this);
        this.sudoku.getTxt44().addKeyListener(this);
        this.sudoku.getTxt45().addKeyListener(this);
        this.sudoku.getTxt46().addKeyListener(this);
        this.sudoku.getTxt47().addKeyListener(this);
        this.sudoku.getTxt48().addKeyListener(this);
        this.sudoku.getTxt50().addKeyListener(this);
        this.sudoku.getTxt51().addKeyListener(this);
        this.sudoku.getTxt52().addKeyListener(this);
        this.sudoku.getTxt53().addKeyListener(this);
        this.sudoku.getTxt54().addKeyListener(this);
        this.sudoku.getTxt55().addKeyListener(this);
        this.sudoku.getTxt56().addKeyListener(this);
        this.sudoku.getTxt57().addKeyListener(this);
        this.sudoku.getTxt58().addKeyListener(this);
        this.sudoku.getTxt60().addKeyListener(this);
        this.sudoku.getTxt61().addKeyListener(this);
        this.sudoku.getTxt62().addKeyListener(this);
        this.sudoku.getTxt63().addKeyListener(this);
        this.sudoku.getTxt64().addKeyListener(this);
        this.sudoku.getTxt65().addKeyListener(this);
        this.sudoku.getTxt66().addKeyListener(this);
        this.sudoku.getTxt67().addKeyListener(this);
        this.sudoku.getTxt68().addKeyListener(this);
        this.sudoku.getTxt70().addKeyListener(this);
        this.sudoku.getTxt71().addKeyListener(this);
        this.sudoku.getTxt72().addKeyListener(this);
        this.sudoku.getTxt73().addKeyListener(this);
        this.sudoku.getTxt74().addKeyListener(this);
        this.sudoku.getTxt75().addKeyListener(this);
        this.sudoku.getTxt76().addKeyListener(this);
        this.sudoku.getTxt77().addKeyListener(this);
        this.sudoku.getTxt78().addKeyListener(this);
        this.sudoku.getTxt80().addKeyListener(this);
        this.sudoku.getTxt81().addKeyListener(this);
        this.sudoku.getTxt82().addKeyListener(this);
        this.sudoku.getTxt83().addKeyListener(this);
        this.sudoku.getTxt84().addKeyListener(this);
        this.sudoku.getTxt85().addKeyListener(this);
        this.sudoku.getTxt86().addKeyListener(this);
        this.sudoku.getTxt87().addKeyListener(this);
        this.sudoku.getTxt88().addKeyListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.sudoku.getBtnVolver())) {
            inicio.setVisible(true);
            Inicio ini = new Inicio(inicio);
            this.sudoku.dispose();
        }else if (e.getSource().equals(this.sudoku.getBtnResuelto())) {
            resuelto.setVisible(true);
            JuegoResuelto resul = new JuegoResuelto(this.generador.getMatrizMadre(), resuelto);
            this.sudoku.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    
    }

    
    
}
