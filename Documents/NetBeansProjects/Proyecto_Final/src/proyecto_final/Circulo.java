/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Miguel Rodriguez
 */
public class Circulo {
  private int x ,y;
    String nombre;
    public static final int d = 40;
    boolean sumar = false;
    public Color color;
    public Circulo(int x , int y,String n){
        this.color = Color.gray;
        this.x = x ; 
        this.y = y ;
        this.nombre = n;
    }
    
    /**
     * 
     * @param g 
     */
    public void pintar(Graphics g){
        g.setColor(color);
        g.fillOval(x- d/2,y -d/2,d,d);
        g.setColor(Color.BLACK); 
        g.drawString(nombre,x ,y);
    }
   public int getX() {
       return x ;
   }
   public int getY() {
       return y;
   }
   public void set_Color(Color c ) {
       this.color = c;
   }  
}
