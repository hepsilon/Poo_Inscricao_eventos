/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.awt.FlowLayout;
import javax.swing.*;
import projeto.classes.*;

/**
 *
 * @author hipol
 */
public class Presentation extends JFrame {
    private JLabel texto;
    private String text = "";
    
    public Presentation(){  
        super("Presentetion");
        setLayout(new FlowLayout());
        
        text +="<html>";
        ApresentationB();
        ApresentationE();
        ApresentationJ();
        ApresentationD();
        text += "</html>";
        texto = new JLabel(text);
        add(texto);
        pack();
    }   

    
    
    public void ApresentationB(){  
        Bar newbar;
        
        for(int i=0;i<BigClass.Instance().bar.size()  ;i++){
            newbar = BigClass.Instance().bar.get(i);
            text += "Bar " + String.valueOf(newbar.getnLista()+1);
            text += " ";
            text += String.valueOf(newbar.getConsumo());
            text += " ";
            text += String.valueOf(newbar.getLotacao());
            text += " ";
            text += String.valueOf(newbar.getinscritos());
            //gpsx = newbar.getGpsx();
            //gpsy = newbar.getGpsy();
            text +="<br>";     
        }
    }
    public void ApresentationE(){  
        Expo newexpo;
        for(int i=0;i<BigClass.Instance().expo.size();i++){
            newexpo = BigClass.Instance().expo.get(i);
            text += "Exposição " + String.valueOf(newexpo.getnLista()+1);
            text += " ";
            text += String.valueOf(newexpo.getCost());
            text += " ";
            text += String.valueOf(newexpo.getArte());
            text += " ";
            text += String.valueOf(newexpo.getinscritos());
            //gpsx = newexpo.getGpsx();
            //gpsy = newexpo.getGpsy();
            text +="<br>";    
    }
    
    
    }
    public void ApresentationJ(){  

        Jardim newjardim;
        for(int i=0;i<BigClass.Instance().jardim.size();i++){
            newjardim =  BigClass.Instance().jardim.get(i);
            text += "Jardim " + String.valueOf(newjardim.getnLista()+1);
            text += " ";
            text += newjardim.getArea();
            text += " ";
            text += newjardim.getinscritos();
            //gpsx = newjardim.getGpsx();
            //gpsy = newjardim.getGpsy();
            text +="<br>";    
        }  
    }
    
    public void ApresentationD(){  
        Desporto newdesporto;
        for(int i=0;i<BigClass.Instance().desporto.size();i++){
            newdesporto =  BigClass.Instance().desporto.get(i);
            text += "Desporto " + String.valueOf(newdesporto.getnLista()+1);
            text += " ";
            text += newdesporto.getDesporto();
            text += " ";
            text += newdesporto.getinscritos();
            //gpsx = newdesporto.getGpsx();
            //gpsy = newdesporto.getGpsy();
            text +="<br>";    
        }  
    }
}