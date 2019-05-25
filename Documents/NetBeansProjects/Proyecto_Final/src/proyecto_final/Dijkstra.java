/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;
/**
 *
 * @author Miguel Rodriguez
 */
class Dijkstra {
    int[][] Matriz;//matriz cuadrada con un maximo de 12 nodos
    int[] distancia;//vector para almacenar las distancias
    public Dijkstra(int[][] m) {
        this.Matriz = m;
        this.distancia = new int[m.length];
    }
    //n cantidad de nodos
    
    /**
     * 
     * @param n cantidad de nodos 
     * @param origen nodo elegdo como el inicial
     */
    public void calc(int n, int origen) {//logica para resolver el algoritmo
        int flag[] = new int[n + 1];
        int i, minpos = 1, k, c, minimo;//estas al declararse valen 0 por default

        //llenamos al vector distancia la primera fila de la  matriz
        for (i = 0; i <= n; i++) {//tomar la primera fila de la matriz y almacenarla en el vector distancia
            flag[i] = 0;
            this.distancia[i] = this.Matriz[origen][i]; //costode [1] [1]=0
        }
        c = 2;
        while (c <= n) {
            minimo = 999;
            for (k = 0; k <= n; k++) {
                if (this.distancia[k] < minimo && flag[k] != 1) {//si el vector distancia en la posicion k es menor a minimo y el vector flag es diferente de 1
                    minimo = this.distancia[i];
                    minpos = k;
                }
                
            }
            flag[minpos] = 1;
            c++;
            for (k = 0; k <= n; k++) {
                if (this.distancia[minpos] + this.Matriz[minpos][k] < this.distancia[k] && flag[k] != 1) {
                    this.distancia[k] = this.distancia[minpos] + this.Matriz[minpos][k];
                }
            }
        }
    }
}