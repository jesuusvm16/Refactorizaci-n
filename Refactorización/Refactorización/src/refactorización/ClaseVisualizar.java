/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorización;

/**
 *
 * @author jesus
 */
public class ClaseVisualizar {
    
    protected int valor;
    //metodo que modifica el contenido de la posicion posicion de un array con el valor pasado

    public void Visualizar(int[] v) {
        //Mostramos los elementos del array
        int Longitud = 0;
        int i;
        System.out.print("v={");
        for (i = 0; i < Longitud; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
    }
    
}
