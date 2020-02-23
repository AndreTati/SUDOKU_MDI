/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.JFInicio;
import Vista.JFJuego;
import Vista.JFJuegoResuelto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tatiduran
 */
public class JuegoResuelto implements ActionListener{
    
    private JFJuegoResuelto resuelto;
    private JFInicio inicio=new JFInicio();
    
    public JuegoResuelto(int matriz[][], JFJuegoResuelto r){
        this.resuelto=r;
        resuelto.setVisible(true);
        this.resuelto.getBtnJuegoNuevo().addActionListener(this);
        mostrarResuelto(matriz);
    }
    public void mostrarResuelto(int matriz[][]){
        resuelto.getTxt00().setText(String.valueOf(matriz[0][0]));
        resuelto.getTxt00().setEditable(false);
        resuelto.getTxt01().setText(String.valueOf(matriz[0][1]));
        resuelto.getTxt01().setEditable(false);
        resuelto.getTxt02().setText(String.valueOf(matriz[0][2]));
        resuelto.getTxt02().setEditable(false);
        resuelto.getTxt03().setText(String.valueOf(matriz[0][3]));
        resuelto.getTxt03().setEditable(false);
        resuelto.getTxt04().setText(String.valueOf(matriz[0][4]));
        resuelto.getTxt04().setEditable(false);
        resuelto.getTxt05().setText(String.valueOf(matriz[0][5]));
        resuelto.getTxt05().setEditable(false);
        resuelto.getTxt06().setText(String.valueOf(matriz[0][6]));
        resuelto.getTxt06().setEditable(false);
        resuelto.getTxt07().setText(String.valueOf(matriz[0][7]));
        resuelto.getTxt07().setEditable(false);
        resuelto.getTxt08().setText(String.valueOf(matriz[0][8]));
        resuelto.getTxt08().setEditable(false);
        
        resuelto.getTxt10().setText(String.valueOf(matriz[1][0]));
        resuelto.getTxt10().setEditable(false);
        resuelto.getTxt11().setText(String.valueOf(matriz[1][1]));
        resuelto.getTxt11().setEditable(false);
        resuelto.getTxt12().setText(String.valueOf(matriz[1][2]));
        resuelto.getTxt12().setEditable(false);
        resuelto.getTxt13().setText(String.valueOf(matriz[1][3]));
        resuelto.getTxt13().setEditable(false);
        resuelto.getTxt14().setText(String.valueOf(matriz[1][4]));
        resuelto.getTxt14().setEditable(false);
        resuelto.getTxt15().setText(String.valueOf(matriz[1][5]));
        resuelto.getTxt15().setEditable(false);
        resuelto.getTxt16().setText(String.valueOf(matriz[1][6]));
        resuelto.getTxt16().setEditable(false);
        resuelto.getTxt17().setText(String.valueOf(matriz[1][7]));
        resuelto.getTxt17().setEditable(false);
        resuelto.getTxt18().setText(String.valueOf(matriz[1][8]));
        resuelto.getTxt18().setEditable(false);
        
        resuelto.getTxt20().setText(String.valueOf(matriz[2][0]));
        resuelto.getTxt20().setEditable(false);
        resuelto.getTxt21().setText(String.valueOf(matriz[2][1]));
        resuelto.getTxt21().setEditable(false);
        resuelto.getTxt22().setText(String.valueOf(matriz[2][2]));
        resuelto.getTxt22().setEditable(false);
        resuelto.getTxt23().setText(String.valueOf(matriz[2][3]));
        resuelto.getTxt23().setEditable(false);
        resuelto.getTxt24().setText(String.valueOf(matriz[2][4]));
        resuelto.getTxt24().setEditable(false);
        resuelto.getTxt25().setText(String.valueOf(matriz[2][5]));
        resuelto.getTxt25().setEditable(false);
        resuelto.getTxt26().setText(String.valueOf(matriz[2][6]));
        resuelto.getTxt26().setEditable(false);
        resuelto.getTxt27().setText(String.valueOf(matriz[2][7]));
        resuelto.getTxt27().setEditable(false);
        resuelto.getTxt28().setText(String.valueOf(matriz[2][8]));
        resuelto.getTxt28().setEditable(false);
        
        resuelto.getTxt30().setText(String.valueOf(matriz[3][0]));
        resuelto.getTxt30().setEditable(false);
        resuelto.getTxt31().setText(String.valueOf(matriz[3][1]));
        resuelto.getTxt31().setEditable(false);
        resuelto.getTxt32().setText(String.valueOf(matriz[3][2]));
        resuelto.getTxt32().setEditable(false);
        resuelto.getTxt33().setText(String.valueOf(matriz[3][3]));
        resuelto.getTxt33().setEditable(false);
        resuelto.getTxt34().setText(String.valueOf(matriz[3][4]));
        resuelto.getTxt34().setEditable(false);
        resuelto.getTxt35().setText(String.valueOf(matriz[3][5]));
        resuelto.getTxt35().setEditable(false);
        resuelto.getTxt36().setText(String.valueOf(matriz[3][6]));
        resuelto.getTxt36().setEditable(false);
        resuelto.getTxt37().setText(String.valueOf(matriz[3][7]));
        resuelto.getTxt37().setEditable(false);
        resuelto.getTxt38().setText(String.valueOf(matriz[3][8]));
        resuelto.getTxt38().setEditable(false);
        
        resuelto.getTxt40().setText(String.valueOf(matriz[4][0]));
        resuelto.getTxt40().setEditable(false);
        resuelto.getTxt41().setText(String.valueOf(matriz[4][1]));
        resuelto.getTxt41().setEditable(false);
        resuelto.getTxt42().setText(String.valueOf(matriz[4][2]));
        resuelto.getTxt42().setEditable(false);
        resuelto.getTxt43().setText(String.valueOf(matriz[4][3]));
        resuelto.getTxt43().setEditable(false);
        resuelto.getTxt44().setText(String.valueOf(matriz[4][4]));
        resuelto.getTxt44().setEditable(false);
        resuelto.getTxt45().setText(String.valueOf(matriz[4][5]));
        resuelto.getTxt45().setEditable(false);
        resuelto.getTxt46().setText(String.valueOf(matriz[4][6]));
        resuelto.getTxt46().setEditable(false);
        resuelto.getTxt47().setText(String.valueOf(matriz[4][7]));
        resuelto.getTxt47().setEditable(false);
        resuelto.getTxt48().setText(String.valueOf(matriz[4][8]));
        resuelto.getTxt48().setEditable(false);
        
        resuelto.getTxt50().setText(String.valueOf(matriz[5][0]));
        resuelto.getTxt50().setEditable(false);
        resuelto.getTxt51().setText(String.valueOf(matriz[5][1]));
        resuelto.getTxt51().setEditable(false);
        resuelto.getTxt52().setText(String.valueOf(matriz[5][2]));
        resuelto.getTxt52().setEditable(false);
        resuelto.getTxt53().setText(String.valueOf(matriz[5][3]));
        resuelto.getTxt53().setEditable(false);
        resuelto.getTxt54().setText(String.valueOf(matriz[5][4]));
        resuelto.getTxt54().setEditable(false);
        resuelto.getTxt55().setText(String.valueOf(matriz[5][5]));
        resuelto.getTxt55().setEditable(false);
        resuelto.getTxt56().setText(String.valueOf(matriz[5][6]));
        resuelto.getTxt56().setEditable(false);
        resuelto.getTxt57().setText(String.valueOf(matriz[5][7]));
        resuelto.getTxt57().setEditable(false);
        resuelto.getTxt58().setText(String.valueOf(matriz[5][8]));
        resuelto.getTxt58().setEditable(false);
        
        resuelto.getTxt60().setText(String.valueOf(matriz[6][0]));
        resuelto.getTxt60().setEditable(false);
        resuelto.getTxt61().setText(String.valueOf(matriz[6][1]));
        resuelto.getTxt61().setEditable(false);
        resuelto.getTxt62().setText(String.valueOf(matriz[6][2]));
        resuelto.getTxt62().setEditable(false);
        resuelto.getTxt63().setText(String.valueOf(matriz[6][3]));
        resuelto.getTxt63().setEditable(false);
        resuelto.getTxt64().setText(String.valueOf(matriz[6][4]));
        resuelto.getTxt64().setEditable(false);
        resuelto.getTxt65().setText(String.valueOf(matriz[6][5]));
        resuelto.getTxt65().setEditable(false);
        resuelto.getTxt66().setText(String.valueOf(matriz[6][6]));
        resuelto.getTxt66().setEditable(false);
        resuelto.getTxt67().setText(String.valueOf(matriz[6][7]));
        resuelto.getTxt67().setEditable(false);
        resuelto.getTxt68().setText(String.valueOf(matriz[6][8]));
        resuelto.getTxt68().setEditable(false);
        
        resuelto.getTxt70().setText(String.valueOf(matriz[7][0]));
        resuelto.getTxt70().setEditable(false);
        resuelto.getTxt71().setText(String.valueOf(matriz[7][1]));
        resuelto.getTxt71().setEditable(false);
        resuelto.getTxt72().setText(String.valueOf(matriz[7][2]));
        resuelto.getTxt72().setEditable(false);
        resuelto.getTxt73().setText(String.valueOf(matriz[7][3]));
        resuelto.getTxt73().setEditable(false);
        resuelto.getTxt74().setText(String.valueOf(matriz[7][4]));
        resuelto.getTxt74().setEditable(false);
        resuelto.getTxt75().setText(String.valueOf(matriz[7][5]));
        resuelto.getTxt75().setEditable(false);
        resuelto.getTxt76().setText(String.valueOf(matriz[7][6]));
        resuelto.getTxt76().setEditable(false);
        resuelto.getTxt77().setText(String.valueOf(matriz[7][7]));
        resuelto.getTxt77().setEditable(false);
        resuelto.getTxt78().setText(String.valueOf(matriz[7][8]));
        resuelto.getTxt78().setEditable(false);
        
        resuelto.getTxt80().setText(String.valueOf(matriz[8][0]));
        resuelto.getTxt80().setEditable(false);
        resuelto.getTxt81().setText(String.valueOf(matriz[8][1]));
        resuelto.getTxt81().setEditable(false);
        resuelto.getTxt82().setText(String.valueOf(matriz[8][2]));
        resuelto.getTxt82().setEditable(false);
        resuelto.getTxt83().setText(String.valueOf(matriz[8][3]));
        resuelto.getTxt83().setEditable(false);
        resuelto.getTxt84().setText(String.valueOf(matriz[8][4]));
        resuelto.getTxt84().setEditable(false);
        resuelto.getTxt85().setText(String.valueOf(matriz[8][5]));
        resuelto.getTxt85().setEditable(false);
        resuelto.getTxt86().setText(String.valueOf(matriz[8][6]));
        resuelto.getTxt86().setEditable(false);
        resuelto.getTxt87().setText(String.valueOf(matriz[8][7]));
        resuelto.getTxt87().setEditable(false);
        resuelto.getTxt88().setText(String.valueOf(matriz[8][8]));
        resuelto.getTxt88().setEditable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.resuelto.getBtnJuegoNuevo())){
            inicio.setVisible(true);
            Inicio ini=new Inicio(inicio);
            this.resuelto.dispose();
        }
    
    }
}
