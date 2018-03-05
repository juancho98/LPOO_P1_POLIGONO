/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;

import java.util.Scanner;

/**
 *
 * @author jdani
 */
public class Poligono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        // TODO code application logic here
        
        Figura f = new Figura();
        System.out.println("NUMERO DE LADOS: ");
        Integer lados = datos.nextInt();
        f.setLado(lados);
        System.out.println("RADIO DE LA FIGURA: ");
        Integer radio = datos.nextInt();
        f.setRadio(radio);
        System.out.println("ANGULO DE INCIO: ");
        double angulo = datos.nextDouble();
        f.setAngulo(angulo);
        
        for(int i=0;i<lados;i++){
            System.out.print("punto " +(i+1)+ ":" );
            f.posicion();
        }
    }
    
}
