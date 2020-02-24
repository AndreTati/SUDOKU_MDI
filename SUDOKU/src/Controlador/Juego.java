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
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author tatiduran
 */
public class Juego implements ActionListener, KeyListener {

    private JFJuego sudoku;
    private JFJuegoResuelto resuelto = new JFJuegoResuelto();
    private GeneradorSudoku generador;
    private JFInicio inicio = new JFInicio();

    public Juego(JFJuego juego, int n) {
        this.sudoku = juego;
        this.generador = new GeneradorSudoku(n);
        sudoku.setVisible(true);
        this.sudoku.getBtnVolver().addActionListener(this);
        this.sudoku.getBtnResuelto().addActionListener(this);
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
        generarTablero(this.generador.getMatriz());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.sudoku.getBtnVolver())) {
            inicio.setVisible(true);
            Inicio ini = new Inicio(inicio);
            this.sudoku.dispose();
        } else if (e.getSource().equals(this.sudoku.getBtnResuelto())) {
            resuelto.setVisible(true);
            JuegoResuelto resul = new JuegoResuelto(this.generador.getMatrizMadre(), resuelto);
            this.sudoku.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource().equals(this.sudoku.getTxt00())) {
            if (generador.comprobarValor(this.sudoku.getTxt00().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt00().getText()), 0)) {
                    this.sudoku.getTxt00().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt00().getText()), 0)) {
                    this.sudoku.getTxt00().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt00().getText()), 0, 0)) {
                    this.sudoku.getTxt00().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt00().getText()), 0, 0)) {
                    this.sudoku.getTxt00().setForeground(Color.black);
                    this.sudoku.getTxt00().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt00().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt00().setEditable(false);
                    this.generador.getMatriz()[0][0]=Integer.parseInt(this.sudoku.getTxt00().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt00().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt01())) {
            if (generador.comprobarValor(this.sudoku.getTxt01().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt01().getText()), 0)) {
                    this.sudoku.getTxt01().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt01().getText()), 1)) {
                    this.sudoku.getTxt01().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt01().getText()), 0, 1)) {
                    this.sudoku.getTxt01().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt01().getText()), 0, 1)) {
                    this.sudoku.getTxt01().setForeground(Color.black);
                    this.sudoku.getTxt01().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt01().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt01().setEditable(false);
                    this.generador.getMatriz()[0][1]=Integer.parseInt(this.sudoku.getTxt01().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt01().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt02())) {
            if (generador.comprobarValor(this.sudoku.getTxt02().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt02().getText()), 0)) {
                    this.sudoku.getTxt02().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt02().getText()), 2)) {
                    this.sudoku.getTxt02().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt02().getText()), 0, 2)) {
                    this.sudoku.getTxt02().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt02().getText()), 0, 2)) {
                    this.sudoku.getTxt02().setForeground(Color.black);
                    this.sudoku.getTxt02().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt02().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt02().setEditable(false);
                    this.generador.getMatriz()[0][2]=Integer.parseInt(this.sudoku.getTxt02().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt02().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt03())) {
            if (generador.comprobarValor(this.sudoku.getTxt03().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt03().getText()), 0)) {
                    this.sudoku.getTxt03().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt03().getText()), 3)) {
                    this.sudoku.getTxt03().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt03().getText()), 0, 3)) {
                    this.sudoku.getTxt03().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt03().getText()), 0, 3)) {
                    this.sudoku.getTxt03().setForeground(Color.black);
                    this.sudoku.getTxt03().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt03().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt03().setEditable(false);
                    this.generador.getMatriz()[0][3]=Integer.parseInt(this.sudoku.getTxt03().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt03().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt04())) {
            if (generador.comprobarValor(this.sudoku.getTxt04().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt04().getText()), 0)) {
                    this.sudoku.getTxt04().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt04().getText()), 4)) {
                    this.sudoku.getTxt04().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt04().getText()), 0, 4)) {
                    this.sudoku.getTxt04().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt04().getText()), 0, 4)) {
                    this.sudoku.getTxt04().setForeground(Color.black);
                    this.sudoku.getTxt04().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt04().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt04().setEditable(false);
                    this.generador.getMatriz()[0][4]=Integer.parseInt(this.sudoku.getTxt04().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt04().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt05())) {
            if (generador.comprobarValor(this.sudoku.getTxt05().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt05().getText()), 0)) {
                    this.sudoku.getTxt05().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt05().getText()), 5)) {
                    this.sudoku.getTxt05().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt05().getText()), 0, 5)) {
                    this.sudoku.getTxt05().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt05().getText()), 0, 5)) {
                    this.sudoku.getTxt05().setForeground(Color.black);
                    this.sudoku.getTxt05().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt05().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt05().setEditable(false);
                    this.generador.getMatriz()[0][5]=Integer.parseInt(this.sudoku.getTxt05().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt05().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt06())) {
            if (generador.comprobarValor(this.sudoku.getTxt06().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt06().getText()), 0)) {
                    this.sudoku.getTxt06().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt06().getText()), 6)) {
                    this.sudoku.getTxt06().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt06().getText()), 0, 6)) {
                    this.sudoku.getTxt06().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt06().getText()), 0, 6)) {
                    this.sudoku.getTxt06().setForeground(Color.black);
                    this.sudoku.getTxt06().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt06().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt06().setEditable(false);
                    this.generador.getMatriz()[0][6]=Integer.parseInt(this.sudoku.getTxt06().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt06().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt07())) {
            if (generador.comprobarValor(this.sudoku.getTxt07().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt07().getText()), 0)) {
                    this.sudoku.getTxt07().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt07().getText()), 7)) {
                    this.sudoku.getTxt07().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt07().getText()), 0, 7)) {
                    this.sudoku.getTxt07().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt07().getText()), 0, 7)) {
                    this.sudoku.getTxt07().setForeground(Color.black);
                    this.sudoku.getTxt07().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt07().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt07().setEditable(false);
                    this.generador.getMatriz()[0][7]=Integer.parseInt(this.sudoku.getTxt07().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt07().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt08())) {
            if (generador.comprobarValor(this.sudoku.getTxt08().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt08().getText()), 0)) {
                    this.sudoku.getTxt08().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt08().getText()), 8)) {
                    this.sudoku.getTxt08().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt08().getText()), 0, 8)) {
                    this.sudoku.getTxt08().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt08().getText()), 0, 8)) {
                    this.sudoku.getTxt08().setForeground(Color.black);
                    this.sudoku.getTxt08().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt08().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt08().setEditable(false);
                    this.generador.getMatriz()[0][8]=Integer.parseInt(this.sudoku.getTxt08().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt08().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt10())) {
            if (generador.comprobarValor(this.sudoku.getTxt10().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt10().getText()), 1)) {
                    this.sudoku.getTxt10().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt10().getText()), 0)) {
                    this.sudoku.getTxt10().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt10().getText()), 1, 0)) {
                    this.sudoku.getTxt10().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt10().getText()), 1, 0)) {
                    this.sudoku.getTxt10().setForeground(Color.black);
                    this.sudoku.getTxt10().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt10().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt10().setEditable(false);
                    this.generador.getMatriz()[1][0]=Integer.parseInt(this.sudoku.getTxt10().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt10().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt11())) {
            if (generador.comprobarValor(this.sudoku.getTxt11().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt11().getText()), 1)) {
                    this.sudoku.getTxt11().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt11().getText()), 1)) {
                    this.sudoku.getTxt11().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt11().getText()), 1, 1)) {
                    this.sudoku.getTxt11().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt11().getText()), 1, 1)) {
                    this.sudoku.getTxt11().setForeground(Color.black);
                    this.sudoku.getTxt11().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt11().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt11().setEditable(false);
                    this.generador.getMatriz()[1][1]=Integer.parseInt(this.sudoku.getTxt11().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt11().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt12())) {
            if (generador.comprobarValor(this.sudoku.getTxt12().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt12().getText()), 1)) {
                    this.sudoku.getTxt12().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt12().getText()), 2)) {
                    this.sudoku.getTxt12().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt12().getText()), 1, 2)) {
                    this.sudoku.getTxt12().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt12().getText()), 1, 2)) {
                    this.sudoku.getTxt12().setForeground(Color.black);
                    this.sudoku.getTxt12().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt12().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt12().setEditable(false);
                    this.generador.getMatriz()[1][2]=Integer.parseInt(this.sudoku.getTxt12().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt12().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt13())) {
            if (generador.comprobarValor(this.sudoku.getTxt13().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt13().getText()), 1)) {
                    this.sudoku.getTxt13().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt13().getText()), 3)) {
                    this.sudoku.getTxt13().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt13().getText()), 1, 3)) {
                    this.sudoku.getTxt13().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt13().getText()), 1, 3)) {
                    this.sudoku.getTxt13().setForeground(Color.black);
                    this.sudoku.getTxt13().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt13().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt13().setEditable(false);
                    this.generador.getMatriz()[1][3]=Integer.parseInt(this.sudoku.getTxt13().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt13().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt14())) {
            if (generador.comprobarValor(this.sudoku.getTxt14().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt14().getText()), 1)) {
                    this.sudoku.getTxt14().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt14().getText()), 4)) {
                    this.sudoku.getTxt14().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt14().getText()), 1, 4)) {
                    this.sudoku.getTxt14().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt14().getText()), 1, 4)) {
                    this.sudoku.getTxt14().setForeground(Color.black);
                    this.sudoku.getTxt14().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt14().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt14().setEditable(false);
                    this.generador.getMatriz()[1][4]=Integer.parseInt(this.sudoku.getTxt14().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt14().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt15())) {
            if (generador.comprobarValor(this.sudoku.getTxt15().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt15().getText()), 1)) {
                    this.sudoku.getTxt15().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt15().getText()), 5)) {
                    this.sudoku.getTxt15().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt15().getText()), 1, 5)) {
                    this.sudoku.getTxt15().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt15().getText()), 1, 5)) {
                    this.sudoku.getTxt15().setForeground(Color.black);
                    this.sudoku.getTxt15().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt15().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt15().setEditable(false);
                    this.generador.getMatriz()[1][5]=Integer.parseInt(this.sudoku.getTxt15().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt15().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt16())) {
            if (generador.comprobarValor(this.sudoku.getTxt16().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt16().getText()), 1)) {
                    this.sudoku.getTxt16().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt16().getText()), 6)) {
                    this.sudoku.getTxt16().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt16().getText()), 1, 6)) {
                    this.sudoku.getTxt16().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt16().getText()), 1, 6)) {
                    this.sudoku.getTxt16().setForeground(Color.black);
                    this.sudoku.getTxt16().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt16().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt16().setEditable(false);
                    this.generador.getMatriz()[1][6]=Integer.parseInt(this.sudoku.getTxt16().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt16().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt17())) {
            if (generador.comprobarValor(this.sudoku.getTxt17().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt17().getText()), 1)) {
                    this.sudoku.getTxt17().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt17().getText()), 7)) {
                    this.sudoku.getTxt17().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt17().getText()), 1, 7)) {
                    this.sudoku.getTxt17().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt17().getText()), 1, 7)) {
                    this.sudoku.getTxt17().setForeground(Color.black);
                    this.sudoku.getTxt17().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt17().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt17().setEditable(false);
                    this.generador.getMatriz()[1][7]=Integer.parseInt(this.sudoku.getTxt17().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt17().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt18())) {
            if (generador.comprobarValor(this.sudoku.getTxt18().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt18().getText()), 1)) {
                    this.sudoku.getTxt18().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt18().getText()), 8)) {
                    this.sudoku.getTxt18().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt18().getText()), 1, 8)) {
                    this.sudoku.getTxt18().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt18().getText()), 1, 8)) {
                    this.sudoku.getTxt18().setForeground(Color.black);
                    this.sudoku.getTxt18().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt18().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt18().setEditable(false);
                    this.generador.getMatriz()[1][8]=Integer.parseInt(this.sudoku.getTxt18().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt18().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt20())) {
            if (generador.comprobarValor(this.sudoku.getTxt20().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt20().getText()), 2)) {
                    this.sudoku.getTxt20().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt20().getText()), 0)) {
                    this.sudoku.getTxt20().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt20().getText()), 2, 0)) {
                    this.sudoku.getTxt20().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt20().getText()), 2, 0)) {
                    this.sudoku.getTxt20().setForeground(Color.black);
                    this.sudoku.getTxt20().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt20().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt20().setEditable(false);
                    this.generador.getMatriz()[2][0]=Integer.parseInt(this.sudoku.getTxt20().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt20().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt21())) {
            if (generador.comprobarValor(this.sudoku.getTxt21().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt21().getText()), 2)) {
                    this.sudoku.getTxt21().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt21().getText()), 1)) {
                    this.sudoku.getTxt21().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt21().getText()), 2, 1)) {
                    this.sudoku.getTxt21().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt21().getText()), 2, 1)) {
                    this.sudoku.getTxt21().setForeground(Color.black);
                    this.sudoku.getTxt21().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt21().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt21().setEditable(false);
                    this.generador.getMatriz()[2][1]=Integer.parseInt(this.sudoku.getTxt21().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt21().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt22())) {
            if (generador.comprobarValor(this.sudoku.getTxt22().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt22().getText()), 2)) {
                    this.sudoku.getTxt22().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt22().getText()), 2)) {
                    this.sudoku.getTxt22().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt22().getText()), 2, 2)) {
                    this.sudoku.getTxt22().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt22().getText()), 2, 2)) {
                    this.sudoku.getTxt22().setForeground(Color.black);
                    this.sudoku.getTxt22().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt22().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt22().setEditable(false);
                    this.generador.getMatriz()[2][2]=Integer.parseInt(this.sudoku.getTxt22().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt22().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt23())) {
            if (generador.comprobarValor(this.sudoku.getTxt23().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt23().getText()), 2)) {
                    this.sudoku.getTxt23().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt23().getText()), 3)) {
                    this.sudoku.getTxt23().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt23().getText()), 2, 3)) {
                    this.sudoku.getTxt23().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt23().getText()), 2, 3)) {
                    this.sudoku.getTxt23().setForeground(Color.black);
                    this.sudoku.getTxt23().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt23().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt23().setEditable(false);
                    this.generador.getMatriz()[2][3]=Integer.parseInt(this.sudoku.getTxt23().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt23().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt24())) {
            if (generador.comprobarValor(this.sudoku.getTxt24().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt24().getText()), 2)) {
                    this.sudoku.getTxt24().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt24().getText()), 4)) {
                    this.sudoku.getTxt24().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt24().getText()), 2, 4)) {
                    this.sudoku.getTxt24().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt24().getText()), 2, 4)) {
                    this.sudoku.getTxt24().setForeground(Color.black);
                    this.sudoku.getTxt24().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt24().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt24().setEditable(false);
                    this.generador.getMatriz()[2][4]=Integer.parseInt(this.sudoku.getTxt24().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt24().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt25())) {
            if (generador.comprobarValor(this.sudoku.getTxt25().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt25().getText()), 2)) {
                    this.sudoku.getTxt25().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt25().getText()), 5)) {
                    this.sudoku.getTxt25().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt25().getText()), 2, 5)) {
                    this.sudoku.getTxt25().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt25().getText()), 2, 5)) {
                    this.sudoku.getTxt25().setForeground(Color.black);
                    this.sudoku.getTxt25().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt25().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt25().setEditable(false);
                    this.generador.getMatriz()[2][5]=Integer.parseInt(this.sudoku.getTxt25().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt25().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt26())) {
            if (generador.comprobarValor(this.sudoku.getTxt26().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt26().getText()), 2)) {
                    this.sudoku.getTxt26().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt26().getText()), 6)) {
                    this.sudoku.getTxt26().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt26().getText()), 2, 6)) {
                    this.sudoku.getTxt26().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt26().getText()), 2, 6)) {
                    this.sudoku.getTxt26().setForeground(Color.black);
                    this.sudoku.getTxt26().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt26().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt26().setEditable(false);
                    this.generador.getMatriz()[2][6]=Integer.parseInt(this.sudoku.getTxt26().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt26().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt27())) {
            if (generador.comprobarValor(this.sudoku.getTxt27().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt27().getText()), 2)) {
                    this.sudoku.getTxt27().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt27().getText()), 7)) {
                    this.sudoku.getTxt27().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt27().getText()), 2, 7)) {
                    this.sudoku.getTxt27().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt27().getText()), 2, 7)) {
                    this.sudoku.getTxt27().setForeground(Color.black);
                    this.sudoku.getTxt27().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt27().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt27().setEditable(false);
                    this.generador.getMatriz()[2][7]=Integer.parseInt(this.sudoku.getTxt27().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt27().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt28())) {
            if (generador.comprobarValor(this.sudoku.getTxt28().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt28().getText()), 2)) {
                    this.sudoku.getTxt28().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt28().getText()), 8)) {
                    this.sudoku.getTxt28().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt28().getText()), 2, 8)) {
                    this.sudoku.getTxt28().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt28().getText()), 2, 8)) {
                    this.sudoku.getTxt28().setForeground(Color.black);
                    this.sudoku.getTxt28().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt28().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt28().setEditable(false);
                    this.generador.getMatriz()[2][8]=Integer.parseInt(this.sudoku.getTxt28().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt28().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt30())) {
            if (generador.comprobarValor(this.sudoku.getTxt30().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt30().getText()), 3)) {
                    this.sudoku.getTxt30().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt30().getText()), 0)) {
                    this.sudoku.getTxt30().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt30().getText()), 3, 0)) {
                    this.sudoku.getTxt30().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt30().getText()), 3, 0)) {
                    this.sudoku.getTxt30().setForeground(Color.black);
                    this.sudoku.getTxt30().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt30().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt30().setEditable(false);
                    this.generador.getMatriz()[3][0]=Integer.parseInt(this.sudoku.getTxt30().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt30().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt31())) {
            if (generador.comprobarValor(this.sudoku.getTxt31().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt31().getText()), 3)) {
                    this.sudoku.getTxt31().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt31().getText()), 1)) {
                    this.sudoku.getTxt31().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt31().getText()), 3, 1)) {
                    this.sudoku.getTxt31().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt31().getText()), 3, 1)) {
                    this.sudoku.getTxt31().setForeground(Color.black);
                    this.sudoku.getTxt31().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt31().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt31().setEditable(false);
                    this.generador.getMatriz()[3][1]=Integer.parseInt(this.sudoku.getTxt31().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt31().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt32())) {
            if (generador.comprobarValor(this.sudoku.getTxt32().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt32().getText()), 3)) {
                    this.sudoku.getTxt32().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt32().getText()), 2)) {
                    this.sudoku.getTxt32().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt32().getText()), 3, 2)) {
                    this.sudoku.getTxt32().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt32().getText()), 3, 2)) {
                    this.sudoku.getTxt32().setForeground(Color.black);
                    this.sudoku.getTxt32().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt32().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt32().setEditable(false);
                    this.generador.getMatriz()[3][2]=Integer.parseInt(this.sudoku.getTxt32().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt32().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt33())) {
            if (generador.comprobarValor(this.sudoku.getTxt33().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt33().getText()), 3)) {
                    this.sudoku.getTxt33().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt33().getText()), 3)) {
                    this.sudoku.getTxt33().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt33().getText()), 3, 3)) {
                    this.sudoku.getTxt33().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt33().getText()), 3, 3)) {
                    this.sudoku.getTxt33().setForeground(Color.black);
                    this.sudoku.getTxt33().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt33().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt33().setEditable(false);
                    this.generador.getMatriz()[3][3]=Integer.parseInt(this.sudoku.getTxt33().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt33().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt34())) {
            if (generador.comprobarValor(this.sudoku.getTxt34().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt34().getText()), 3)) {
                    this.sudoku.getTxt34().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt34().getText()), 4)) {
                    this.sudoku.getTxt34().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt34().getText()), 3, 4)) {
                    this.sudoku.getTxt34().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt34().getText()), 3, 4)) {
                    this.sudoku.getTxt34().setForeground(Color.black);
                    this.sudoku.getTxt34().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt34().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt34().setEditable(false);
                    this.generador.getMatriz()[3][4]=Integer.parseInt(this.sudoku.getTxt34().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt34().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt35())) {
            if (generador.comprobarValor(this.sudoku.getTxt35().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt35().getText()), 3)) {
                    this.sudoku.getTxt35().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt35().getText()), 5)) {
                    this.sudoku.getTxt35().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt35().getText()), 3, 5)) {
                    this.sudoku.getTxt35().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt35().getText()), 3, 5)) {
                    this.sudoku.getTxt35().setForeground(Color.black);
                    this.sudoku.getTxt35().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt35().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt35().setEditable(false);
                    this.generador.getMatriz()[3][5]=Integer.parseInt(this.sudoku.getTxt35().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt35().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt36())) {
            if (generador.comprobarValor(this.sudoku.getTxt36().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt36().getText()), 3)) {
                    this.sudoku.getTxt36().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt36().getText()), 6)) {
                    this.sudoku.getTxt36().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt36().getText()), 3, 6)) {
                    this.sudoku.getTxt36().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt36().getText()), 3, 6)) {
                    this.sudoku.getTxt36().setForeground(Color.black);
                    this.sudoku.getTxt36().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt36().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt36().setEditable(false);
                    this.generador.getMatriz()[3][6]=Integer.parseInt(this.sudoku.getTxt36().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt36().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt37())) {
            if (generador.comprobarValor(this.sudoku.getTxt37().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt37().getText()), 3)) {
                    this.sudoku.getTxt37().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt37().getText()), 7)) {
                    this.sudoku.getTxt37().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt37().getText()), 3, 7)) {
                    this.sudoku.getTxt37().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt37().getText()), 3, 7)) {
                    this.sudoku.getTxt37().setForeground(Color.black);
                    this.sudoku.getTxt37().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt37().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt37().setEditable(false);
                    this.generador.getMatriz()[3][7]=Integer.parseInt(this.sudoku.getTxt37().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt37().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt38())) {
            if (generador.comprobarValor(this.sudoku.getTxt38().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt38().getText()), 3)) {
                    this.sudoku.getTxt38().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt38().getText()), 8)) {
                    this.sudoku.getTxt38().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt38().getText()), 3, 8)) {
                    this.sudoku.getTxt38().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt38().getText()), 3, 8)) {
                    this.sudoku.getTxt38().setForeground(Color.black);
                    this.sudoku.getTxt38().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt38().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt38().setEditable(false);
                    this.generador.getMatriz()[3][8]=Integer.parseInt(this.sudoku.getTxt38().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt38().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt40())) {
            if (generador.comprobarValor(this.sudoku.getTxt40().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt40().getText()), 4)) {
                    this.sudoku.getTxt40().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt40().getText()), 0)) {
                    this.sudoku.getTxt40().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt40().getText()), 4, 0)) {
                    this.sudoku.getTxt40().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt40().getText()), 4, 0)) {
                    this.sudoku.getTxt40().setForeground(Color.black);
                    this.sudoku.getTxt40().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt40().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt40().setEditable(false);
                    this.generador.getMatriz()[4][0]=Integer.parseInt(this.sudoku.getTxt40().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt40().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt41())) {
            if (generador.comprobarValor(this.sudoku.getTxt41().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt41().getText()), 4)) {
                    this.sudoku.getTxt41().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt41().getText()), 1)) {
                    this.sudoku.getTxt41().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt41().getText()), 4, 1)) {
                    this.sudoku.getTxt41().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt41().getText()), 4, 1)) {
                    this.sudoku.getTxt41().setForeground(Color.black);
                    this.sudoku.getTxt41().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt41().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt41().setEditable(false);
                    this.generador.getMatriz()[4][1]=Integer.parseInt(this.sudoku.getTxt41().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt41().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt42())) {
            if (generador.comprobarValor(this.sudoku.getTxt42().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt42().getText()), 4)) {
                    this.sudoku.getTxt42().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt42().getText()), 2)) {
                    this.sudoku.getTxt42().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt42().getText()), 4, 2)) {
                    this.sudoku.getTxt42().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt42().getText()), 4, 2)) {
                    this.sudoku.getTxt42().setForeground(Color.black);
                    this.sudoku.getTxt42().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt42().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt42().setEditable(false);
                    this.generador.getMatriz()[4][2]=Integer.parseInt(this.sudoku.getTxt42().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt42().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt43())) {
            if (generador.comprobarValor(this.sudoku.getTxt43().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt43().getText()), 4)) {
                    this.sudoku.getTxt43().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt43().getText()), 3)) {
                    this.sudoku.getTxt43().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt43().getText()), 4, 3)) {
                    this.sudoku.getTxt43().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt43().getText()), 4, 3)) {
                    this.sudoku.getTxt43().setForeground(Color.black);
                    this.sudoku.getTxt43().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt43().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt43().setEditable(false);
                    this.generador.getMatriz()[4][3]=Integer.parseInt(this.sudoku.getTxt43().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt43().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt44())) {
            if (generador.comprobarValor(this.sudoku.getTxt44().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt44().getText()), 4)) {
                    this.sudoku.getTxt44().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt44().getText()), 4)) {
                    this.sudoku.getTxt44().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt44().getText()), 4, 4)) {
                    this.sudoku.getTxt44().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt44().getText()), 4, 4)) {
                    this.sudoku.getTxt44().setForeground(Color.black);
                    this.sudoku.getTxt44().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt44().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt44().setEditable(false);
                    this.generador.getMatriz()[4][4]=Integer.parseInt(this.sudoku.getTxt44().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt44().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt45())) {
            if (generador.comprobarValor(this.sudoku.getTxt45().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt45().getText()), 4)) {
                    this.sudoku.getTxt45().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt45().getText()), 5)) {
                    this.sudoku.getTxt45().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt45().getText()), 4, 5)) {
                    this.sudoku.getTxt45().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt45().getText()), 4, 5)) {
                    this.sudoku.getTxt45().setForeground(Color.black);
                    this.sudoku.getTxt45().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt45().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt45().setEditable(false);
                    this.generador.getMatriz()[4][5]=Integer.parseInt(this.sudoku.getTxt45().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt45().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt46())) {
            if (generador.comprobarValor(this.sudoku.getTxt46().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt46().getText()), 4)) {
                    this.sudoku.getTxt46().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt46().getText()), 6)) {
                    this.sudoku.getTxt46().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt46().getText()), 4, 6)) {
                    this.sudoku.getTxt46().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt46().getText()), 4, 6)) {
                    this.sudoku.getTxt46().setForeground(Color.black);
                    this.sudoku.getTxt46().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt46().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt46().setEditable(false);
                    this.generador.getMatriz()[4][6]=Integer.parseInt(this.sudoku.getTxt46().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt46().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt47())) {
            if (generador.comprobarValor(this.sudoku.getTxt47().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt47().getText()), 4)) {
                    this.sudoku.getTxt47().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt47().getText()), 7)) {
                    this.sudoku.getTxt47().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt47().getText()), 4, 7)) {
                    this.sudoku.getTxt47().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt47().getText()), 4, 7)) {
                    this.sudoku.getTxt47().setForeground(Color.black);
                    this.sudoku.getTxt47().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt47().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt47().setEditable(false);
                    this.generador.getMatriz()[4][7]=Integer.parseInt(this.sudoku.getTxt47().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt47().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt48())) {
            if (generador.comprobarValor(this.sudoku.getTxt48().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt48().getText()), 4)) {
                    this.sudoku.getTxt48().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt48().getText()), 8)) {
                    this.sudoku.getTxt48().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt48().getText()), 4, 8)) {
                    this.sudoku.getTxt48().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt48().getText()), 4, 8)) {
                    this.sudoku.getTxt48().setForeground(Color.black);
                    this.sudoku.getTxt48().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt48().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt48().setEditable(false);
                    this.generador.getMatriz()[4][8]=Integer.parseInt(this.sudoku.getTxt48().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt48().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt50())) {
            if (generador.comprobarValor(this.sudoku.getTxt50().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt50().getText()), 5)) {
                    this.sudoku.getTxt50().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt50().getText()), 0)) {
                    this.sudoku.getTxt50().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt50().getText()), 5, 0)) {
                    this.sudoku.getTxt50().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt50().getText()), 5, 0)) {
                    this.sudoku.getTxt50().setForeground(Color.black);
                    this.sudoku.getTxt50().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt50().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt50().setEditable(false);
                    this.generador.getMatriz()[5][0]=Integer.parseInt(this.sudoku.getTxt50().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt50().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt51())) {
            if (generador.comprobarValor(this.sudoku.getTxt51().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt51().getText()), 5)) {
                    this.sudoku.getTxt51().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt51().getText()), 1)) {
                    this.sudoku.getTxt51().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt51().getText()), 5, 1)) {
                    this.sudoku.getTxt51().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt51().getText()), 5, 1)) {
                    this.sudoku.getTxt51().setForeground(Color.black);
                    this.sudoku.getTxt51().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt51().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt51().setEditable(false);
                    this.generador.getMatriz()[5][1]=Integer.parseInt(this.sudoku.getTxt51().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt51().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt52())) {
            if (generador.comprobarValor(this.sudoku.getTxt52().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt52().getText()), 5)) {
                    this.sudoku.getTxt52().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt52().getText()), 2)) {
                    this.sudoku.getTxt52().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt52().getText()), 5, 2)) {
                    this.sudoku.getTxt52().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt52().getText()), 5, 2)) {
                    this.sudoku.getTxt52().setForeground(Color.black);
                    this.sudoku.getTxt52().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt52().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt52().setEditable(false);
                    this.generador.getMatriz()[5][2]=Integer.parseInt(this.sudoku.getTxt52().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt52().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt53())) {
            if (generador.comprobarValor(this.sudoku.getTxt53().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt53().getText()), 5)) {
                    this.sudoku.getTxt53().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt53().getText()), 3)) {
                    this.sudoku.getTxt53().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt53().getText()), 5, 3)) {
                    this.sudoku.getTxt53().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt53().getText()), 5, 3)) {
                    this.sudoku.getTxt53().setForeground(Color.black);
                    this.sudoku.getTxt53().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt53().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt53().setEditable(false);
                    this.generador.getMatriz()[5][3]=Integer.parseInt(this.sudoku.getTxt53().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt53().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt54())) {
            if (generador.comprobarValor(this.sudoku.getTxt54().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt54().getText()), 5)) {
                    this.sudoku.getTxt54().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt54().getText()), 4)) {
                    this.sudoku.getTxt54().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt54().getText()), 5, 4)) {
                    this.sudoku.getTxt54().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt54().getText()), 5, 4)) {
                    this.sudoku.getTxt54().setForeground(Color.black);
                    this.sudoku.getTxt54().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt54().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt54().setEditable(false);
                    this.generador.getMatriz()[5][4]=Integer.parseInt(this.sudoku.getTxt54().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt54().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt55())) {
            if (generador.comprobarValor(this.sudoku.getTxt55().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt55().getText()), 5)) {
                    this.sudoku.getTxt55().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt55().getText()), 5)) {
                    this.sudoku.getTxt55().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt55().getText()), 5, 5)) {
                    this.sudoku.getTxt55().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt55().getText()), 5, 5)) {
                    this.sudoku.getTxt55().setForeground(Color.black);
                    this.sudoku.getTxt55().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt55().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt55().setEditable(false);
                    this.generador.getMatriz()[5][5]=Integer.parseInt(this.sudoku.getTxt55().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt55().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt56())) {
            if (generador.comprobarValor(this.sudoku.getTxt56().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt56().getText()), 5)) {
                    this.sudoku.getTxt56().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt56().getText()), 6)) {
                    this.sudoku.getTxt56().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt56().getText()), 5, 6)) {
                    this.sudoku.getTxt56().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt56().getText()), 5, 6)) {
                    this.sudoku.getTxt56().setForeground(Color.black);
                    this.sudoku.getTxt56().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt56().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt56().setEditable(false);
                    this.generador.getMatriz()[5][6]=Integer.parseInt(this.sudoku.getTxt56().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt56().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt57())) {
            if (generador.comprobarValor(this.sudoku.getTxt57().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt57().getText()), 5)) {
                    this.sudoku.getTxt57().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt57().getText()), 7)) {
                    this.sudoku.getTxt57().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt57().getText()), 5, 7)) {
                    this.sudoku.getTxt57().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt57().getText()), 5, 7)) {
                    this.sudoku.getTxt57().setForeground(Color.black);
                    this.sudoku.getTxt57().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt57().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt57().setEditable(false);
                    this.generador.getMatriz()[5][7]=Integer.parseInt(this.sudoku.getTxt57().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt57().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt58())) {
            if (generador.comprobarValor(this.sudoku.getTxt58().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt58().getText()), 5)) {
                    this.sudoku.getTxt58().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt58().getText()), 8)) {
                    this.sudoku.getTxt58().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt58().getText()), 5, 8)) {
                    this.sudoku.getTxt58().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt58().getText()), 5, 8)) {
                    this.sudoku.getTxt58().setForeground(Color.black);
                    this.sudoku.getTxt58().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt58().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt58().setEditable(false);
                    this.generador.getMatriz()[5][8]=Integer.parseInt(this.sudoku.getTxt58().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt58().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt60())) {
            if (generador.comprobarValor(this.sudoku.getTxt60().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt60().getText()), 6)) {
                    this.sudoku.getTxt60().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt60().getText()), 0)) {
                    this.sudoku.getTxt60().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt60().getText()), 6, 0)) {
                    this.sudoku.getTxt60().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt60().getText()), 6, 0)) {
                    this.sudoku.getTxt60().setForeground(Color.black);
                    this.sudoku.getTxt60().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt60().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt60().setEditable(false);
                    this.generador.getMatriz()[6][0]=Integer.parseInt(this.sudoku.getTxt60().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt60().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt61())) {
            if (generador.comprobarValor(this.sudoku.getTxt61().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt61().getText()), 6)) {
                    this.sudoku.getTxt61().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt61().getText()), 1)) {
                    this.sudoku.getTxt61().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt61().getText()), 6, 1)) {
                    this.sudoku.getTxt61().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt61().getText()), 6, 1)) {
                    this.sudoku.getTxt61().setForeground(Color.black);
                    this.sudoku.getTxt61().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt61().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt61().setEditable(false);
                    this.generador.getMatriz()[6][1]=Integer.parseInt(this.sudoku.getTxt61().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt61().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt62())) {
            if (generador.comprobarValor(this.sudoku.getTxt62().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt62().getText()), 6)) {
                    this.sudoku.getTxt62().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt62().getText()), 2)) {
                    this.sudoku.getTxt62().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt62().getText()), 6, 2)) {
                    this.sudoku.getTxt62().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt62().getText()), 6, 2)) {
                    this.sudoku.getTxt62().setForeground(Color.black);
                    this.sudoku.getTxt62().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt62().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt62().setEditable(false);
                    this.generador.getMatriz()[6][2]=Integer.parseInt(this.sudoku.getTxt62().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt62().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt63())) {
            if (generador.comprobarValor(this.sudoku.getTxt63().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt63().getText()), 6)) {
                    this.sudoku.getTxt63().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt63().getText()), 3)) {
                    this.sudoku.getTxt63().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt63().getText()), 6, 3)) {
                    this.sudoku.getTxt63().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt63().getText()), 6, 3)) {
                    this.sudoku.getTxt63().setForeground(Color.black);
                    this.sudoku.getTxt63().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt63().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt63().setEditable(false);
                    this.generador.getMatriz()[6][3]=Integer.parseInt(this.sudoku.getTxt63().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt63().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt64())) {
            if (generador.comprobarValor(this.sudoku.getTxt64().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt64().getText()), 6)) {
                    this.sudoku.getTxt64().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt64().getText()), 4)) {
                    this.sudoku.getTxt64().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt64().getText()), 6, 4)) {
                    this.sudoku.getTxt64().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt64().getText()), 6, 4)) {
                    this.sudoku.getTxt64().setForeground(Color.black);
                    this.sudoku.getTxt64().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt64().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt64().setEditable(false);
                    this.generador.getMatriz()[6][4]=Integer.parseInt(this.sudoku.getTxt64().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt64().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt65())) {
            if (generador.comprobarValor(this.sudoku.getTxt65().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt65().getText()), 6)) {
                    this.sudoku.getTxt65().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt65().getText()), 5)) {
                    this.sudoku.getTxt65().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt65().getText()), 6, 5)) {
                    this.sudoku.getTxt65().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt65().getText()), 6, 5)) {
                    this.sudoku.getTxt65().setForeground(Color.black);
                    this.sudoku.getTxt65().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt65().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt65().setEditable(false);
                    this.generador.getMatriz()[6][5]=Integer.parseInt(this.sudoku.getTxt65().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt65().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt66())) {
            if (generador.comprobarValor(this.sudoku.getTxt66().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt66().getText()), 6)) {
                    this.sudoku.getTxt66().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt66().getText()), 6)) {
                    this.sudoku.getTxt66().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt66().getText()), 6, 6)) {
                    this.sudoku.getTxt66().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt66().getText()), 6, 6)) {
                    this.sudoku.getTxt66().setForeground(Color.black);
                    this.sudoku.getTxt66().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt66().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt66().setEditable(false);
                    this.generador.getMatriz()[6][6]=Integer.parseInt(this.sudoku.getTxt66().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt66().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt67())) {
            if (generador.comprobarValor(this.sudoku.getTxt67().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt67().getText()), 6)) {
                    this.sudoku.getTxt67().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt67().getText()), 7)) {
                    this.sudoku.getTxt67().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt67().getText()), 6, 7)) {
                    this.sudoku.getTxt67().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt67().getText()), 6, 7)) {
                    this.sudoku.getTxt67().setForeground(Color.black);
                    this.sudoku.getTxt67().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt67().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt67().setEditable(false);
                    this.generador.getMatriz()[6][7]=Integer.parseInt(this.sudoku.getTxt67().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt67().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt68())) {
            if (generador.comprobarValor(this.sudoku.getTxt68().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt68().getText()), 6)) {
                    this.sudoku.getTxt68().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt68().getText()), 8)) {
                    this.sudoku.getTxt68().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt68().getText()), 6, 8)) {
                    this.sudoku.getTxt68().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt68().getText()), 6, 8)) {
                    this.sudoku.getTxt68().setForeground(Color.black);
                    this.sudoku.getTxt68().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt68().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt68().setEditable(false);
                    this.generador.getMatriz()[6][8]=Integer.parseInt(this.sudoku.getTxt68().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt68().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt70())) {
            if (generador.comprobarValor(this.sudoku.getTxt70().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt70().getText()), 7)) {
                    this.sudoku.getTxt70().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt70().getText()), 0)) {
                    this.sudoku.getTxt70().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt70().getText()), 7, 0)) {
                    this.sudoku.getTxt70().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt70().getText()), 7, 0)) {
                    this.sudoku.getTxt70().setForeground(Color.black);
                    this.sudoku.getTxt70().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt70().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt70().setEditable(false);
                    this.generador.getMatriz()[7][0]=Integer.parseInt(this.sudoku.getTxt70().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt70().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt71())) {
            if (generador.comprobarValor(this.sudoku.getTxt71().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt71().getText()), 7)) {
                    this.sudoku.getTxt71().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt71().getText()), 1)) {
                    this.sudoku.getTxt71().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt71().getText()), 7, 1)) {
                    this.sudoku.getTxt71().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt71().getText()), 7, 1)) {
                    this.sudoku.getTxt71().setForeground(Color.black);
                    this.sudoku.getTxt71().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt71().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt71().setEditable(false);
                    this.generador.getMatriz()[7][1]=Integer.parseInt(this.sudoku.getTxt71().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt71().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt72())) {
            if (generador.comprobarValor(this.sudoku.getTxt72().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt72().getText()), 7)) {
                    this.sudoku.getTxt72().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt72().getText()), 2)) {
                    this.sudoku.getTxt72().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt72().getText()), 7, 2)) {
                    this.sudoku.getTxt72().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt72().getText()), 7, 2)) {
                    this.sudoku.getTxt72().setForeground(Color.black);
                    this.sudoku.getTxt72().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt72().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt72().setEditable(false);
                    this.generador.getMatriz()[7][2]=Integer.parseInt(this.sudoku.getTxt72().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt72().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt73())) {
            if (generador.comprobarValor(this.sudoku.getTxt73().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt73().getText()), 7)) {
                    this.sudoku.getTxt73().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt73().getText()), 3)) {
                    this.sudoku.getTxt73().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt73().getText()), 7, 3)) {
                    this.sudoku.getTxt73().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt73().getText()), 7, 3)) {
                    this.sudoku.getTxt73().setForeground(Color.black);
                    this.sudoku.getTxt73().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt73().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt73().setEditable(false);
                    this.generador.getMatriz()[7][3]=Integer.parseInt(this.sudoku.getTxt73().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt73().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt74())) {
            if (generador.comprobarValor(this.sudoku.getTxt74().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt74().getText()), 7)) {
                    this.sudoku.getTxt74().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt74().getText()), 4)) {
                    this.sudoku.getTxt74().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt74().getText()), 7, 4)) {
                    this.sudoku.getTxt74().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt74().getText()), 7, 4)) {
                    this.sudoku.getTxt74().setForeground(Color.black);
                    this.sudoku.getTxt74().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt74().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt74().setEditable(false);
                    this.generador.getMatriz()[7][4]=Integer.parseInt(this.sudoku.getTxt74().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt74().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt75())) {
            if (generador.comprobarValor(this.sudoku.getTxt75().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt75().getText()), 7)) {
                    this.sudoku.getTxt75().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt75().getText()), 5)) {
                    this.sudoku.getTxt75().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt75().getText()), 7, 5)) {
                    this.sudoku.getTxt75().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt75().getText()), 7, 5)) {
                    this.sudoku.getTxt75().setForeground(Color.black);
                    this.sudoku.getTxt75().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt75().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt75().setEditable(false);
                    this.generador.getMatriz()[7][5]=Integer.parseInt(this.sudoku.getTxt75().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                    
                }
            } else {
                this.sudoku.getTxt75().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt76())) {
            if (generador.comprobarValor(this.sudoku.getTxt76().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt76().getText()), 7)) {
                    this.sudoku.getTxt76().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt76().getText()), 6)) {
                    this.sudoku.getTxt76().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt76().getText()), 7, 6)) {
                    this.sudoku.getTxt76().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt76().getText()), 7, 6)) {
                    this.sudoku.getTxt76().setForeground(Color.black);
                    this.sudoku.getTxt76().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt76().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt76().setEditable(false);
                    this.generador.getMatriz()[7][6]=Integer.parseInt(this.sudoku.getTxt76().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt76().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt77())) {
            if (generador.comprobarValor(this.sudoku.getTxt77().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt77().getText()), 7)) {
                    this.sudoku.getTxt77().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt77().getText()), 7)) {
                    this.sudoku.getTxt77().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt77().getText()), 7, 7)) {
                    this.sudoku.getTxt77().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt77().getText()), 7, 7)) {
                    this.sudoku.getTxt77().setForeground(Color.black);
                    this.sudoku.getTxt77().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt77().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt77().setEditable(false);
                    this.generador.getMatriz()[7][7]=Integer.parseInt(this.sudoku.getTxt77().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt77().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt78())) {
            if (generador.comprobarValor(this.sudoku.getTxt78().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt78().getText()), 7)) {
                    this.sudoku.getTxt78().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt78().getText()), 8)) {
                    this.sudoku.getTxt78().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt78().getText()), 7, 8)) {
                    this.sudoku.getTxt78().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt78().getText()), 7, 8)) {
                    this.sudoku.getTxt78().setForeground(Color.black);
                    this.sudoku.getTxt78().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt78().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt78().setEditable(false);
                    this.generador.getMatriz()[7][8]=Integer.parseInt(this.sudoku.getTxt78().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt78().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt80())) {
            if (generador.comprobarValor(this.sudoku.getTxt80().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt80().getText()), 8)) {
                    this.sudoku.getTxt80().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt80().getText()), 0)) {
                    this.sudoku.getTxt80().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt80().getText()), 8, 0)) {
                    this.sudoku.getTxt80().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt80().getText()), 8, 0)) {
                    this.sudoku.getTxt80().setForeground(Color.black);
                    this.sudoku.getTxt80().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt80().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt80().setEditable(false);
                    this.generador.getMatriz()[8][0]=Integer.parseInt(this.sudoku.getTxt80().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt80().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt81())) {
            if (generador.comprobarValor(this.sudoku.getTxt81().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt81().getText()), 8)) {
                    this.sudoku.getTxt81().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt81().getText()), 1)) {
                    this.sudoku.getTxt81().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt81().getText()), 8, 1)) {
                    this.sudoku.getTxt81().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt81().getText()), 8, 1)) {
                    this.sudoku.getTxt81().setForeground(Color.black);
                    this.sudoku.getTxt81().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt81().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt81().setEditable(false);
                    this.generador.getMatriz()[8][1]=Integer.parseInt(this.sudoku.getTxt81().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt81().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt82())) {
            if (generador.comprobarValor(this.sudoku.getTxt82().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt82().getText()), 8)) {
                    this.sudoku.getTxt82().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt82().getText()), 2)) {
                    this.sudoku.getTxt82().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt82().getText()), 8, 2)) {
                    this.sudoku.getTxt82().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt82().getText()), 8, 2)) {
                    this.sudoku.getTxt82().setForeground(Color.black);
                    this.sudoku.getTxt82().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt82().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt82().setEditable(false);
                    this.generador.getMatriz()[8][2]=Integer.parseInt(this.sudoku.getTxt82().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt82().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt83())) {
            if (generador.comprobarValor(this.sudoku.getTxt83().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt83().getText()), 8)) {
                    this.sudoku.getTxt83().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt83().getText()), 3)) {
                    this.sudoku.getTxt83().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt83().getText()), 8, 3)) {
                    this.sudoku.getTxt83().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt83().getText()), 8, 3)) {
                    this.sudoku.getTxt83().setForeground(Color.black);
                    this.sudoku.getTxt83().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt83().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt83().setEditable(false);
                    this.generador.getMatriz()[8][3]=Integer.parseInt(this.sudoku.getTxt83().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt83().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt84())) {
            if (generador.comprobarValor(this.sudoku.getTxt84().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt84().getText()), 8)) {
                    this.sudoku.getTxt84().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt84().getText()), 4)) {
                    this.sudoku.getTxt84().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt84().getText()), 8, 4)) {
                    this.sudoku.getTxt84().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt84().getText()), 8, 4)) {
                    this.sudoku.getTxt84().setForeground(Color.black);
                    this.sudoku.getTxt84().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt84().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt84().setEditable(false);
                    this.generador.getMatriz()[8][4]=Integer.parseInt(this.sudoku.getTxt84().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt84().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt85())) {
            if (generador.comprobarValor(this.sudoku.getTxt85().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt85().getText()), 8)) {
                    this.sudoku.getTxt85().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt85().getText()), 5)) {
                    this.sudoku.getTxt85().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt85().getText()), 8, 5)) {
                    this.sudoku.getTxt85().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt85().getText()), 8, 5)) {
                    this.sudoku.getTxt85().setForeground(Color.black);
                    this.sudoku.getTxt85().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt85().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt85().setEditable(false);
                    this.generador.getMatriz()[8][5]=Integer.parseInt(this.sudoku.getTxt85().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt85().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt86())) {
            if (generador.comprobarValor(this.sudoku.getTxt86().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt86().getText()), 8)) {
                    this.sudoku.getTxt86().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt86().getText()), 6)) {
                    this.sudoku.getTxt86().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt86().getText()), 8, 6)) {
                    this.sudoku.getTxt86().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt86().getText()), 8, 6)) {
                    this.sudoku.getTxt86().setForeground(Color.black);
                    this.sudoku.getTxt86().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt86().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt86().setEditable(false);
                    this.generador.getMatriz()[8][6]=Integer.parseInt(this.sudoku.getTxt86().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt86().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt87())) {
            if (generador.comprobarValor(this.sudoku.getTxt87().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt87().getText()), 8)) {
                    this.sudoku.getTxt87().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt87().getText()), 7)) {
                    this.sudoku.getTxt87().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt87().getText()), 8, 7)) {
                    this.sudoku.getTxt87().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt87().getText()), 8, 7)) {
                    this.sudoku.getTxt87().setForeground(Color.black);
                    this.sudoku.getTxt87().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt87().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt87().setEditable(false);
                    this.generador.getMatriz()[8][7]=Integer.parseInt(this.sudoku.getTxt87().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt87().setText("");
            }
        }else if (e.getSource().equals(this.sudoku.getTxt88())) {
            if (generador.comprobarValor(this.sudoku.getTxt88().getText())) {
                if (generador.existeFila(Integer.parseInt(this.sudoku.getTxt88().getText()), 8)) {
                    this.sudoku.getTxt88().setForeground(new Color(255, 0, 0));
                } else if (generador.existeColumna(Integer.parseInt(this.sudoku.getTxt88().getText()), 8)) {
                    this.sudoku.getTxt88().setForeground(new Color(255, 0, 0));
                } else if (generador.existeCaja(Integer.parseInt(this.sudoku.getTxt88().getText()), 8, 8)) {
                    this.sudoku.getTxt88().setForeground(new Color(255, 0, 0));
                } else if (generador.noCoincideValor(Integer.parseInt(this.sudoku.getTxt88().getText()), 8, 8)) {
                    this.sudoku.getTxt88().setForeground(Color.black);
                    this.sudoku.getTxt88().setForeground(new Color(0, 0, 255));
                }else{
                    this.sudoku.getLbMensaje().setText("");
                    this.sudoku.getTxt88().setForeground(new Color(0, 102, 102));
                    this.sudoku.getTxt88().setEditable(false);
                    this.generador.getMatriz()[8][8]=Integer.parseInt(this.sudoku.getTxt88().getText());
                    if(juegoTerminado()){
                        JOptionPane.showMessageDialog(null, "FELICITACIONES\nCOMPLETÓ EL SUDOKU");
                    }
                }
            } else {
                this.sudoku.getTxt88().setText("");
            }
        }

    }

    public void generarTablero(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != 0) {
                    switch (i) {
                        case 0:
                            switch (j) {
                                case 0:
                                    sudoku.getTxt00().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt00().setEditable(false);
                                    break;
                                case 1:
                                    sudoku.getTxt01().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt01().setEditable(false);
                                    break;
                                case 2:
                                    sudoku.getTxt02().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt02().setEditable(false);
                                    break;
                                case 3:
                                    sudoku.getTxt03().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt03().setEditable(false);
                                    break;
                                case 4:
                                    sudoku.getTxt04().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt04().setEditable(false);
                                    break;
                                case 5:
                                    sudoku.getTxt05().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt05().setEditable(false);
                                    break;
                                case 6:
                                    sudoku.getTxt06().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt06().setEditable(false);
                                    break;
                                case 7:
                                    sudoku.getTxt07().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt07().setEditable(false);
                                    break;
                                case 8:
                                    sudoku.getTxt08().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt08().setEditable(false);
                                    break;
                                default:
                                    break;
                            }   break;
                        case 1:
                            switch (j) {
                                case 0:
                                    sudoku.getTxt10().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt10().setEditable(false);
                                    break;
                                case 1:
                                    sudoku.getTxt11().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt11().setEditable(false);
                                    break;
                                case 2:
                                    sudoku.getTxt12().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt12().setEditable(false);
                                    break;
                                case 3:
                                    sudoku.getTxt13().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt13().setEditable(false);
                                    break;
                                case 4:
                                    sudoku.getTxt14().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt14().setEditable(false);
                                    break;
                                case 5:
                                    sudoku.getTxt15().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt15().setEditable(false);
                                    break;
                                case 6:
                                    sudoku.getTxt16().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt16().setEditable(false);
                                    break;
                                case 7:
                                    sudoku.getTxt17().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt17().setEditable(false);
                                    break;
                                case 8:
                                    sudoku.getTxt18().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt18().setEditable(false);
                                    break;
                                default:
                                    break;
                            }   break;
                        case 2:
                            switch (j) {
                                case 0:
                                    sudoku.getTxt20().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt20().setEditable(false);
                                    break;
                                case 1:
                                    sudoku.getTxt21().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt21().setEditable(false);
                                    break;
                                case 2:
                                    sudoku.getTxt22().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt22().setEditable(false);
                                    break;
                                case 3:
                                    sudoku.getTxt23().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt23().setEditable(false);
                                    break;
                                case 4:
                                    sudoku.getTxt24().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt24().setEditable(false);
                                    break;
                                case 5:
                                    sudoku.getTxt25().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt25().setEditable(false);
                                    break;
                                case 6:
                                    sudoku.getTxt26().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt26().setEditable(false);
                                    break;
                                case 7:
                                    sudoku.getTxt27().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt27().setEditable(false);
                                    break;
                                case 8:
                                    sudoku.getTxt28().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt28().setEditable(false);
                                    break;
                                default:
                                    break;
                            }   break;
                        case 3:
                            switch (j) {
                                case 0:
                                    sudoku.getTxt30().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt30().setEditable(false);
                                    break;
                                case 1:
                                    sudoku.getTxt31().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt31().setEditable(false);
                                    break;
                                case 2:
                                    sudoku.getTxt32().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt32().setEditable(false);
                                    break;
                                case 3:
                                    sudoku.getTxt33().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt33().setEditable(false);
                                    break;
                                case 4:
                                    sudoku.getTxt34().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt34().setEditable(false);
                                    break;
                                case 5:
                                    sudoku.getTxt35().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt35().setEditable(false);
                                    break;
                                case 6:
                                    sudoku.getTxt36().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt36().setEditable(false);
                                    break;
                                case 7:
                                    sudoku.getTxt37().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt37().setEditable(false);
                                    break;
                                case 8:
                                    sudoku.getTxt38().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt38().setEditable(false);
                                    break;
                                default:
                                    break;
                            }   break;
                        case 4:
                            switch (j) {
                                case 0:
                                    sudoku.getTxt40().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt40().setEditable(false);
                                    break;
                                case 1:
                                    sudoku.getTxt41().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt41().setEditable(false);
                                    break;
                                case 2:
                                    sudoku.getTxt42().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt42().setEditable(false);
                                    break;
                                case 3:
                                    sudoku.getTxt43().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt43().setEditable(false);
                                    break;
                                case 4:
                                    sudoku.getTxt44().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt44().setEditable(false);
                                    break;
                                case 5:
                                    sudoku.getTxt45().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt45().setEditable(false);
                                    break;
                                case 6:
                                    sudoku.getTxt46().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt46().setEditable(false);
                                    break;
                                case 7:
                                    sudoku.getTxt47().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt47().setEditable(false);
                                    break;
                                case 8:
                                    sudoku.getTxt48().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt48().setEditable(false);
                                    break;
                                default:
                                    break;
                            }   break;
                        case 5:
                            switch (j) {
                                case 0:
                                    sudoku.getTxt50().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt50().setEditable(false);
                                    break;
                                case 1:
                                    sudoku.getTxt51().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt51().setEditable(false);
                                    break;
                                case 2:
                                    sudoku.getTxt52().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt52().setEditable(false);
                                    break;
                                case 3:
                                    sudoku.getTxt53().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt53().setEditable(false);
                                    break;
                                case 4:
                                    sudoku.getTxt54().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt54().setEditable(false);
                                    break;
                                case 5:
                                    sudoku.getTxt55().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt55().setEditable(false);
                                    break;
                                case 6:
                                    sudoku.getTxt56().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt56().setEditable(false);
                                    break;
                                case 7:
                                    sudoku.getTxt57().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt57().setEditable(false);
                                    break;
                                case 8:
                                    sudoku.getTxt58().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt58().setEditable(false);
                                    break;
                                default:
                                    break;
                            }   break;
                        case 6:
                            switch (j) {
                                case 0:
                                    sudoku.getTxt60().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt60().setEditable(false);
                                    break;
                                case 1:
                                    sudoku.getTxt61().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt61().setEditable(false);
                                    break;
                                case 2:
                                    sudoku.getTxt62().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt62().setEditable(false);
                                    break;
                                case 3:
                                    sudoku.getTxt63().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt63().setEditable(false);
                                    break;
                                case 4:
                                    sudoku.getTxt64().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt64().setEditable(false);
                                    break;
                                case 5:
                                    sudoku.getTxt65().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt65().setEditable(false);
                                    break;
                                case 6:
                                    sudoku.getTxt66().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt66().setEditable(false);
                                    break;
                                case 7:
                                    sudoku.getTxt67().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt67().setEditable(false);
                                    break;
                                case 8:
                                    sudoku.getTxt68().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt68().setEditable(false);
                                    break;
                                default:
                                    break;
                            }   break;
                        case 7:
                            switch (j) {
                                case 0:
                                    sudoku.getTxt70().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt70().setEditable(false);
                                    break;
                                case 1:
                                    sudoku.getTxt71().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt71().setEditable(false);
                                    break;
                                case 2:
                                    sudoku.getTxt72().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt72().setEditable(false);
                                    break;
                                case 3:
                                    sudoku.getTxt73().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt73().setEditable(false);
                                    break;
                                case 4:
                                    sudoku.getTxt74().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt74().setEditable(false);
                                    break;
                                case 5:
                                    sudoku.getTxt75().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt75().setEditable(false);
                                    break;
                                case 6:
                                    sudoku.getTxt76().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt76().setEditable(false);
                                    break;
                                case 7:
                                    sudoku.getTxt77().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt77().setEditable(false);
                                    break;
                                case 8:
                                    sudoku.getTxt78().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt78().setEditable(false);
                                    break;
                                default:
                                    break;
                            }   break;
                        case 8:
                            switch (j) {
                                case 0:
                                    sudoku.getTxt80().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt80().setEditable(false);
                                    break;
                                case 1:
                                    sudoku.getTxt81().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt81().setEditable(false);
                                    break;
                                case 2:
                                    sudoku.getTxt82().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt82().setEditable(false);
                                    break;
                                case 3:
                                    sudoku.getTxt83().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt83().setEditable(false);
                                    break;
                                case 4:
                                    sudoku.getTxt84().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt84().setEditable(false);
                                    break;
                                case 5:
                                    sudoku.getTxt85().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt85().setEditable(false);
                                    break;
                                case 6:
                                    sudoku.getTxt86().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt86().setEditable(false);
                                    break;
                                case 7:
                                    sudoku.getTxt87().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt87().setEditable(false);
                                    break;
                                case 8:
                                    sudoku.getTxt88().setText(String.valueOf(matriz[i][j]));
                                    sudoku.getTxt88().setEditable(false);
                                    break;
                                default:
                                    break;
                            }   break;
                        default:
                            break;
                    }
                }
            }
        }
    }
    
    public boolean juegoTerminado(){
        boolean terminado=false;
        for (int i = 0; i < this.generador.getMatriz().length; i++) {
            for (int j = 0; j < this.generador.getMatriz()[0].length; j++) {
                if(this.generador.getMatriz()[i][j]!=0){
                    terminado=true;
                }else{
                    terminado=false;
                    break;
                }
            }
            if(terminado==false){
                break;
            }
        }
        return terminado;
    }
}
