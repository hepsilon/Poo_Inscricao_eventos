/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.classes;

import java.io.Serializable;
import projeto.classes.Locais;

/**
 *
 * @author hipol
 */
public class Jardim extends Locais implements Serializable{
    private int area;
    
    public void Jardim(){
    
    }
    //Setter
    public void setArea(int a){
        area =a;
    }
    
    //Getters
    public int getArea(){
        return area;
    }
 
}