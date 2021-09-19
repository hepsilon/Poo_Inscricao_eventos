/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.classes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author hipol
 */
public class Pessoas implements Serializable{
    
    private String perfil;
    private String password;
    private String nome;
    private String tipo;
    //public ArrayList<Locais> locais;
    private int local = 5;
    public void Pessoa(){
    
    }
    
    public void Pessoa(String perfil){
        this.perfil = perfil;
    }
    
    //Setter
    public void setPerfil(String p){
        perfil = p;
    }
    
    public void setNome(String n){
        nome = n;
    }
    public void setPassword(String p){
        password = p;
    }
    public void decrementInscr(){
        local -=1;
    }
    public void setType(String s){
        tipo =s;
    }
    //Getters
    public String getPerfil(){
        return perfil;
    }
    public String getNome(){
        return nome;
    }
    public String getPassword(){
        return password;
    }
    public String getType(){
        return tipo;
    }
    
    public int getInscr(){
        return local;
    }
    
    
}