/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;
import java.math.*;
/**
 *
 * @author jdani
 */
public class Figura {
    private Integer lados;
    private double angulo;
    private double rad;
    private Integer radio;
    
    public Figura(){
        lados = 3;
        angulo = 0;
        radio = 10;
        rad = 0;
    }
    
    public void setLado(Integer lado){
        this.lados= lado;
    }
    
    public void setAngulo(double ang){
        this.angulo= ang;
    }
    
    public void setRadio(Integer rad){
        this.radio=rad;
    }
    
    public void angulo(){
        double anguloap = 360/lados;
        angulo = angulo + anguloap;
    }
    
    public void rad(){
        this.rad = (angulo*(Math.PI/180));
    }
    
    public void posicion(){
        angulo();
        rad();
        System.out.println("angulo: "+angulo);
        double posx = Math.round(Math.cos(rad)*radio);
        double posy = Math.round(Math.sin(rad)*radio);
        System.out.println("( "+posx+" , "+posy+" )");
    }
    
}
