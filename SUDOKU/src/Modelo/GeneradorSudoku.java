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
    
    //PARA PRUEBAS
    /*public void mostrarMatrizMadre(){
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
    }*/
    
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
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                this.matriz[i][j]=this.matrizMadre[i][j];
            }
        }
        Random n=new Random();
        for (int i = 0; i < cantidad; i++) {
            int a=n.nextInt(9);
            int b=n.nextInt(9);
            if(this.matriz[a][b]!=0){
                this.matriz[a][b]=0;
            }else{
                i--;
            }
        }
    }
    
    public boolean comprobarValor(String valor1){
        if (String.valueOf(valor1).equalsIgnoreCase("") || (valor1.codePointAt(0)<49 || valor1.codePointAt(0)>57)) {
            return false;
        } else {
            int valor = Integer.valueOf(valor1);
            if (valor >= 0 && valor < 10) {
                return true;
            } else {
                return false;
            }
        }
    }
    
    public boolean existeFila(int numero, int fila){
        boolean existe=false;
        for(int i=0; i<this.matriz.length; i++){
            if(matriz[fila][i]==numero){
                existe=true;
                break;
            }
        }
        return existe;
    }
    
    public boolean existeColumna(int numero, int columna){
        boolean existe=false;
        for(int i=0; i<this.matriz.length; i++){
            if(matriz[i][columna]==numero){
                existe=true;
                break;
            }
        }
        return existe;
    }
    
    public boolean existeCaja(int numero, int fila, int columna){
        boolean existe=false;
        int minFila=0, maxFila=0, minColumna=0, maxColumna=0;
        if(fila>=0 && fila<=2){
            minFila=0;
            maxFila=2;
        }else if(fila>=3 && fila<=5){
            minFila=3;
            maxFila=5;
        }else if(fila>=6 && fila<=8){
            minFila=6;
            maxFila=8;
        }
        if(columna>=0 && columna <=2){
            minColumna=0;
            maxColumna=2;
        }else if(columna>=3 && columna <=5){
            minColumna=3;
            maxColumna=5;
        }else if(columna>=6 && columna<=8){
            minColumna=6;
            maxColumna=8;
        }
        for(int i=minFila; i<=maxFila; i++){
            for(int j=minColumna; j<=maxColumna; j++){
                if(matriz[i][j]==numero){
                    existe=true;
                    break;
                }
            }
        }
        return existe;
    }
    
    public boolean noCoincideValor(int numero, int fila, int columna){
        boolean coincide=false;
        if(this.matrizMadre[fila][columna]!=numero){
            coincide=true;
        }
        return coincide;
    }

    public int[][] getMatrizMadre() {
        return matrizMadre;
    }

    public void setMatrizMadre(int[][] matrizMadre) {
        this.matrizMadre = matrizMadre;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    
    
}
