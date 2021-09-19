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
public class Desporto extends Locais implements Serializable{
    
    private String desporto;
    
    public void Desportiva(){
    
    }
    
    //Setter
    public void setDesporto(String d){
        desporto = d;
    }
    
    //Getters
    public String getDesporto(){
        return desporto;
    }
    
}