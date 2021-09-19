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
public class Bar extends Locais implements Serializable{
    
    private int consumo;
    private int lotacao;
    public ArrayList<Pessoas> guest;
    
    public void Bar(){
        this.guest = new ArrayList();
    }
    
    //Setter
    public void setConsumo(int c){
        consumo = c;
    }
    
    public void setLotacao(int l){
        lotacao = l;
    }
    //Getters
    public int getConsumo(){
        return consumo;
    }
    public int getLotacao(){
        return lotacao;
    }
   
}