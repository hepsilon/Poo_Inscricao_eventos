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
public class Professor extends Pessoas implements Serializable{
    
    private String tipo;
    
    public void Prof(){
    
    }
    
    //Setter
    public void setTipo(String t){
        tipo = t;
    }
    
    //Getters
    public String getTipo(){
        return tipo;
    }
    
    
}