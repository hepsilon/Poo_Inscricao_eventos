/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.*;
import projeto.classes.*;

/**
 *
 * @author hipol
 */
public class Sorting extends JFrame {
    
    public static ArrayList<Locais> locais;
    private JLabel texto;
    String text = "";
    
    
    public Sorting(){
        super("Insert title");
        setLayout(new FlowLayout());
        
        locais= new ArrayList<>();
        
        Bar newbar;
        for(int i=0;i<BigClass.Instance().bar.size();i++){
            newbar =  BigClass.Instance().bar.get(i);
            locais.add(newbar);
        }
        
        Expo newexpo;
        for(int i=0;i<BigClass.Instance().expo.size();i++){
            newexpo =  BigClass.Instance().expo.get(i);
            locais.add(newexpo);
        }
        
        Jardim newjardim;
        for(int i=0;i<BigClass.Instance().jardim.size();i++){
            newjardim =  BigClass.Instance().jardim.get(i);
            locais.add(newjardim);
        }
        
        Desporto newdesporto;
        for(int i=0;i<BigClass.Instance().desporto.size();i++){
           newdesporto =  BigClass.Instance().desporto.get(i);
            locais.add(newdesporto);
        }
        
        
        
        sort();
        text +="<html>";
        for(int i =0;i<locais.size();i++){
            int number = locais.size()-1 - i;
            text+= locais.get(number).getTipo();
            text +=  " ";
            text += locais.get(number).getnLista();
            text += "<br>";
        }
        text += "</html>";
        JLabel texto = new JLabel(text);
        add(texto);
        
    }
    
    
    
    
    public static void sort() {
        int n = locais.size();
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (locais.get(i).getinscritos() > locais.get(k).getinscritos())  {
                    troca(i, k);
                }
            }
        }
    }
  
    private static void troca(int i, int j) {
  
        ArrayList<Locais> locais1 = new ArrayList<>();
        locais1.add(locais.get(j));
        locais.set(j,locais.get(i));
        locais.set(i,locais1.get(0));
        locais1.clear();
    }
  
    }
    