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
        generarTablero(this.generador.getMatriz());
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

    public void generarTablero(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != 0) {
                    if (i == 0) {
                        if (j == 0) {
                            sudoku.getTxt00().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt00().setEditable(false);
                        } else if (j == 1) {
                            sudoku.getTxt01().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt01().setEditable(false);
                        } else if (j == 2) {
                            sudoku.getTxt02().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt02().setEditable(false);
                        } else if (j == 3) {
                            sudoku.getTxt03().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt03().setEditable(false);
                        } else if (j == 4) {
                            sudoku.getTxt04().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt04().setEditable(false);
                        } else if (j == 5) {
                            sudoku.getTxt05().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt05().setEditable(false);
                        } else if (j == 6) {
                            sudoku.getTxt06().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt06().setEditable(false);
                        } else if (j == 7) {
                            sudoku.getTxt07().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt07().setEditable(false);
                        } else if (j == 8) {
                            sudoku.getTxt08().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt08().setEditable(false);
                        }
                    } else if (i == 1) {
                        if (j == 0) {
                            sudoku.getTxt10().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt10().setEditable(false);
                        } else if (j == 1) {
                            sudoku.getTxt11().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt11().setEditable(false);
                        } else if (j == 2) {
                            sudoku.getTxt12().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt12().setEditable(false);
                        } else if (j == 3) {
                            sudoku.getTxt13().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt13().setEditable(false);
                        } else if (j == 4) {
                            sudoku.getTxt14().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt14().setEditable(false);
                        } else if (j == 5) {
                            sudoku.getTxt15().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt15().setEditable(false);
                        } else if (j == 6) {
                            sudoku.getTxt16().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt16().setEditable(false);
                        } else if (j == 7) {
                            sudoku.getTxt17().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt17().setEditable(false);
                        } else if (j == 8) {
                            sudoku.getTxt18().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt18().setEditable(false);
                        }
                    } else if (i == 2) {
                        if (j == 0) {
                            sudoku.getTxt20().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt20().setEditable(false);
                        } else if (j == 1) {
                            sudoku.getTxt21().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt21().setEditable(false);
                        } else if (j == 2) {
                            sudoku.getTxt22().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt22().setEditable(false);
                        } else if (j == 3) {
                            sudoku.getTxt23().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt23().setEditable(false);
                        } else if (j == 4) {
                            sudoku.getTxt24().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt24().setEditable(false);
                        } else if (j == 5) {
                            sudoku.getTxt25().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt25().setEditable(false);
                        } else if (j == 6) {
                            sudoku.getTxt26().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt26().setEditable(false);
                        } else if (j == 7) {
                            sudoku.getTxt27().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt27().setEditable(false);
                        } else if (j == 8) {
                            sudoku.getTxt28().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt28().setEditable(false);
                        }
                    } else if (i == 3) {
                        if (j == 0) {
                            sudoku.getTxt30().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt30().setEditable(false);
                        } else if (j == 1) {
                            sudoku.getTxt31().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt31().setEditable(false);
                        } else if (j == 2) {
                            sudoku.getTxt32().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt32().setEditable(false);
                        } else if (j == 3) {
                            sudoku.getTxt33().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt33().setEditable(false);
                        } else if (j == 4) {
                            sudoku.getTxt34().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt34().setEditable(false);
                        } else if (j == 5) {
                            sudoku.getTxt35().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt35().setEditable(false);
                        } else if (j == 6) {
                            sudoku.getTxt36().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt36().setEditable(false);
                        } else if (j == 7) {
                            sudoku.getTxt37().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt37().setEditable(false);
                        } else if (j == 8) {
                            sudoku.getTxt38().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt38().setEditable(false);
                        }
                    } else if (i == 4) {
                        if (j == 0) {
                            sudoku.getTxt40().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt40().setEditable(false);
                        } else if (j == 1) {
                            sudoku.getTxt41().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt41().setEditable(false);
                        } else if (j == 2) {
                            sudoku.getTxt42().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt42().setEditable(false);
                        } else if (j == 3) {
                            sudoku.getTxt43().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt43().setEditable(false);
                        } else if (j == 4) {
                            sudoku.getTxt44().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt44().setEditable(false);
                        } else if (j == 5) {
                            sudoku.getTxt45().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt45().setEditable(false);
                        } else if (j == 6) {
                            sudoku.getTxt46().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt46().setEditable(false);
                        } else if (j == 7) {
                            sudoku.getTxt47().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt47().setEditable(false);
                        } else if (j == 8) {
                            sudoku.getTxt48().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt48().setEditable(false);
                        }
                    } else if (i == 5) {
                        if (j == 0) {
                            sudoku.getTxt50().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt50().setEditable(false);
                        } else if (j == 1) {
                            sudoku.getTxt51().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt51().setEditable(false);
                        } else if (j == 2) {
                            sudoku.getTxt52().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt52().setEditable(false);
                        } else if (j == 3) {
                            sudoku.getTxt53().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt53().setEditable(false);
                        } else if (j == 4) {
                            sudoku.getTxt54().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt54().setEditable(false);
                        } else if (j == 5) {
                            sudoku.getTxt55().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt55().setEditable(false);
                        } else if (j == 6) {
                            sudoku.getTxt56().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt56().setEditable(false);
                        } else if (j == 7) {
                            sudoku.getTxt57().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt57().setEditable(false);
                        } else if (j == 8) {
                            sudoku.getTxt58().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt58().setEditable(false);
                        }
                    } else if (i == 6) {
                        if (j == 0) {
                            sudoku.getTxt60().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt60().setEditable(false);
                        } else if (j == 1) {
                            sudoku.getTxt61().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt61().setEditable(false);
                        } else if (j == 2) {
                            sudoku.getTxt62().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt62().setEditable(false);
                        } else if (j == 3) {
                            sudoku.getTxt63().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt63().setEditable(false);
                        } else if (j == 4) {
                            sudoku.getTxt64().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt64().setEditable(false);
                        } else if (j == 5) {
                            sudoku.getTxt65().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt65().setEditable(false);
                        } else if (j == 6) {
                            sudoku.getTxt66().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt66().setEditable(false);
                        } else if (j == 7) {
                            sudoku.getTxt67().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt67().setEditable(false);
                        } else if (j == 8) {
                            sudoku.getTxt68().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt68().setEditable(false);
                        }
                    } else if (i == 7) {
                        if (j == 0) {
                            sudoku.getTxt70().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt70().setEditable(false);
                        } else if (j == 1) {
                            sudoku.getTxt71().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt71().setEditable(false);
                        } else if (j == 2) {
                            sudoku.getTxt72().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt72().setEditable(false);
                        } else if (j == 3) {
                            sudoku.getTxt73().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt73().setEditable(false);
                        } else if (j == 4) {
                            sudoku.getTxt74().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt74().setEditable(false);
                        } else if (j == 5) {
                            sudoku.getTxt75().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt75().setEditable(false);
                        } else if (j == 6) {
                            sudoku.getTxt76().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt76().setEditable(false);
                        } else if (j == 7) {
                            sudoku.getTxt77().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt77().setEditable(false);
                        } else if (j == 8) {
                            sudoku.getTxt78().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt78().setEditable(false);
                        }
                    } else if (i == 8) {
                        if (j == 0) {
                            sudoku.getTxt80().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt80().setEditable(false);
                        } else if (j == 1) {
                            sudoku.getTxt81().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt81().setEditable(false);
                        } else if (j == 2) {
                            sudoku.getTxt82().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt82().setEditable(false);
                        } else if (j == 3) {
                            sudoku.getTxt83().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt83().setEditable(false);
                        } else if (j == 4) {
                            sudoku.getTxt84().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt84().setEditable(false);
                        } else if (j == 5) {
                            sudoku.getTxt85().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt85().setEditable(false);
                        } else if (j == 6) {
                            sudoku.getTxt86().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt86().setEditable(false);
                        } else if (j == 7) {
                            sudoku.getTxt87().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt87().setEditable(false);
                        } else if (j == 8) {
                            sudoku.getTxt88().setText(String.valueOf(matriz[i][j]));
                            sudoku.getTxt88().setEditable(false);
                        }
                    }
                }
            }
        }
    }
    
    
}
