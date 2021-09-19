/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.classes;

import java.io.Serializable;

/**
 *
 * @author hipol
 */
public class Locais implements Serializable{
    private double gpsx;
    private double gpsy;
    private int inscritos;
    private int nLista;
    private String tipo;
    public void Locais(){
    
    }
    
    //Setter
    public void setGpsx(double x,double y){
        gpsx =x;
        gpsy = y;
    }
    
    //Getters
    public double getGpsx(){
        return gpsx;
    }
    public double getGpsy(){
        return gpsy;
    }
    public void setupInscritos(){
        inscritos = 0;
    }
    public void addinscritos(){
        inscritos+=1;
    }
    public void removeinscritos(){
        inscritos-=1;
    }
    public void setnLista(int a){
        nLista= a;
    }
    public int getnLista(){
        return nLista;
    }
    public int getinscritos(){
        return inscritos;
    }
    public void setTipo(String s){
        tipo=s;
    }        
    public String getTipo(){
        return tipo;
    }
}