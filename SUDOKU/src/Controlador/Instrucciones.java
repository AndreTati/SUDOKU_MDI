/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.JFInicio;
import Vista.JFInstrucciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tatiduran
 */
public class Instrucciones implements ActionListener{
    private JFInstrucciones instrucciones;
    private JFInicio inicio=new JFInicio();
    
    public Instrucciones(JFInstrucciones i){
        this.instrucciones=i;
        instrucciones.setVisible(true);
        this.instrucciones.getBtnVolver().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.instrucciones.getBtnVolver())){
            inicio.setVisible(true);
            Inicio ini=new Inicio(inicio);
            this.instrucciones.dispose();
        }
    }
}
