/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizes;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class Matrix {
    private int tamaño;
    private int [][] matriz;
    
    public Matrix(int tamaño) {
        this.tamaño = tamaño;
        matriz =new int[tamaño][tamaño];
        fillMatRandom();
    }
    
    public Matrix sumaMatrizes(Matrix B) {
        Matrix A = this;
        Matrix C = new Matrix(A.tamaño);
        for (int i = 0; i < A.tamaño; i++)
            for (int j = 0; j < A.tamaño; j++)
                C.matriz[i][j] = A.matriz[i][j] + B.matriz[i][j];
        return C;
    }
    
    public Matrix restaMatrizes(Matrix B) {
        Matrix A = this;
        Matrix C = new Matrix(A.tamaño);
        for (int i = 0; i < A.tamaño; i++)
            for (int j = 0; j < A.tamaño; j++)
                C.matriz[i][j] = A.matriz[i][j] - B.matriz[i][j];
        return C;
    }
    
    public void fillMatRandom(){
        Random rn = new Random();
        for (int i = 0; i < tamaño; ++i) 
             {
                for (int j = 0; j < tamaño; ++j) 
                {
                    matriz[i][j]= rn.nextInt(10);
                }
                 System.out.println(" ");
             }
    }
    
    @Override
    public String toString() {
        for (int i = 0; i < tamaño; ++i) 
             {
                for (int j = 0; j < tamaño; ++j) 
                {
                    System.out.print(matriz[i][j]+ " ");
                }
                 System.out.println(" ");
             }
        return null;
    }

    
}
