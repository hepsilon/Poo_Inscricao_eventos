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
public class Funcionario extends Pessoas implements Serializable{
    
    private String tempo;
    
    public void Tempo(){
    
    }
    
    //Setter
    public void setTempo(String t){
        tempo = t;
    }
    
    //Getters
    public String getTempo(){
        return tempo;
    }
    
}