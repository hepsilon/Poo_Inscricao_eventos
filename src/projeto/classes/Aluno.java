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
public class Aluno extends Pessoas implements Serializable{
    
    private String curso;
    
    public void Aluno(){
    
    }
    
    //Setter
    public void setCurso(String c){
        curso = c;
    }
    
    //Getters
    public String getCurso(){
        return curso;
    }
    
}