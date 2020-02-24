/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.GeneradorSudoku;
import Vista.JFInicio;

/**
 *
 * @author tatiduran
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFInicio inicio=new JFInicio();
        Inicio iniCtrl=new Inicio(inicio);
    }
    
}
