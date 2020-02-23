/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Random;

/**
 *
 * @author tatiduran
 */
public class GeneradorSudoku {

    
    private int matrizMadre[][]={{1,2,3,4,5,6,7,8,9},
                                 {4,5,6,7,8,9,1,2,3},
                                 {7,8,9,1,2,3,4,5,6},
                                 {2,3,4,5,6,7,8,9,1},
                                 {5,6,7,8,9,1,2,3,4},
                                 {8,9,1,2,3,4,5,6,7},
                                 {3,4,5,6,7,8,9,1,2},
                                 {6,7,8,9,1,2,3,4,5},
                                 {9,1,2,3,4,5,6,7,8}};
    
    private int matriz[][]=new int [9][9];
    
    public GeneradorSudoku(int n){
        contruirSudoku(0);
        contruirSudoku(1);
        dificultad(n);
    }
    
    public void mostrarMatrizMadre(){
        for (int i = 0; i < matrizMadre.length; i++) {
            for (int j = 0; j < matrizMadre[i].length; j++) {
                System.out.print(matrizMadre[i][j] +" ");
            }System.out.println("");
        }
    }
    public void mostrarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] +" ");
            }System.out.println("");
        }
    }
    
    public void contruirSudoku(int k){
        int n1, n2;
        int desde=0, hasta=2;
        Random n=new Random();
        for (int i = 0; i < 3; i++) {
            n1=n.nextInt(hasta-desde+1)+desde;
            do{
                n2=n.nextInt(hasta-desde+1)+desde;
            }while(n1==n2);
            desde+=3;
            hasta+=3;
            if(k==0){
                intercambiarFilas(n1, n2);
            }else if(k==1){
                intercambiarColumnas(n1, n2);
            }
        }
    }
    
    public void intercambiarFilas(int n1, int n2){
        int numero;
        for (int i = 0; i < 9; i++) {
            numero=this.matrizMadre[n1][i];
            this.matrizMadre[n1][i]=this.matrizMadre[n2][i];
            this.matrizMadre[n2][i]=numero;
        }
    }
    
    public void intercambiarColumnas(int n1, int n2){
        int numero;
        for (int i = 0; i < 9; i++) {
            numero=this.matrizMadre[i][n1];
            this.matrizMadre[i][n1]=this.matrizMadre[i][n2];
            this.matrizMadre[i][n2]=numero;
        }
    }
    
    public void dificultad(int cantidad){
        this.matriz=this.matrizMadre;
        Random n=new Random();
        for (int i = 0; i < cantidad; i++) {
            int a=n.nextInt(9);
            int b=n.nextInt(9);
            if(matriz[a][b]!=0){
                matriz[a][b]=0;
            }else{
                i--;
            }
        }
    }
    
    
}
