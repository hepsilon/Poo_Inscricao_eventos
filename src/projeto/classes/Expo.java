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
public class Expo extends Locais implements Serializable{
    
    private String arte;
    private int cost;
    private int alunos= 0;
    
    public void Expo(){
    
    }
    
    //Setter
    public void setArte(String a){
        arte = a;
    }
    
    public void setCost(int c){
        cost = c;
    }
    public void addAlunos(){
        alunos+=1;
    }
    
    //Getters
    public String getArte(){
        return arte;
    }
    public int getCost(){
        return cost;
    }
    
    public int getAlunos(){
        return alunos;
    }
    
}