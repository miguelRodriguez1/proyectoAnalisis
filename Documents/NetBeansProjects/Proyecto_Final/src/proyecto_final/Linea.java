/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;
import java.awt.Graphics;
/**
 *
 * @author Miguel Rodriguez
 */
public class Linea {
    private int x1,y1,x2,y2;
    private int peso;
    public Linea(int x1,int y1,int x2,int y2,int peso){
        this.x1 = x1 ; 
        this.x2 = x2;
        this.y1 = y1 ; 
        this.y2 = y2;
        this.peso = peso;
    }
    /**
     * 
     * @param g 
     */
    public void pintar(Graphics g){
        g.drawLine(x1,y1,x2,y2);
       int xMenor = menor(x1,x2);
       int yMenor = menor(y1,y2);          
       int xMayor = mayor(x1,x2);
       int yMayor = mayor(y1,y2);
       int distanciaVertical = yMayor - yMenor;
       int distanciaHorizontal = xMayor - xMenor; 
       g.drawString(Integer.toString(peso) + "", distanciaHorizontal / 2 + xMenor, distanciaVertical / 2 + yMenor);
    }
    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
 private int mayor(int n1, int n2){
    return n1 > n2 ? n1 : n2;
 }
  private int menor(int n1, int n2){
      return n1 < n2 ? n1 : n2;
  }
}
