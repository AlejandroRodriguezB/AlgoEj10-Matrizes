/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizes;

/**
 *
 * @author alumno
 */
public class Matrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matrix a = new Matrix(4);
        Matrix b = new Matrix(4);
        System.out.println("Matriz a:");
        a.toString();
        System.out.println("Matriz b:");
        b.toString();
        Matrix c = a.sumaMatrizes(b);
        c.toString();
    }
    
}
