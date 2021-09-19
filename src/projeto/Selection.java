/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import javax.swing.*;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import projeto.classes.*;

/**
 *
 * @author hipol
 */
public class Selection extends JFrame{
    private JComboBox combo1;
    private JComboBox combo2;
    private JComboBox combo3;
    private JComboBox combo4;
    private JComboBox combo5;
    private JButton button;
    
    
    
    public Selection(){
        super("Selection");
        setLayout(new FlowLayout());
        //insertList(); 
        
        
        String[] place= new String[BigClass.Instance().bar.size() +BigClass.Instance().expo.size()+BigClass.Instance().jardim.size()+BigClass.Instance().desporto.size()];
        Bar newbar = new Bar();
        int a=0;
        for(int i=0;i<BigClass.Instance().bar.size();i++){
            newbar =  BigClass.Instance().bar.get(i);
            place[a]= newbar.getTipo() + " " +String.valueOf(newbar.getnLista());
            a++;       
 
        }
        
        Expo newexpo = new Expo();
        for(int i=0;i<BigClass.Instance().expo.size();i++){
            newexpo =  BigClass.Instance().expo.get(i);
            place[a]= newexpo.getTipo() + " " +String.valueOf(newexpo.getnLista());
            a++;
        }
        
        Jardim newjardim = new Jardim();
        for(int i=0;i<BigClass.Instance().jardim.size();i++){
            newjardim =  BigClass.Instance().jardim.get(i);
            place[a]= newjardim.getTipo() + " " +String.valueOf(newjardim.getnLista());
            a++;
        }
        
        Desporto newdesporto = new Desporto();
        for(int i=0;i<BigClass.Instance().desporto.size();i++){
            newdesporto =  BigClass.Instance().desporto.get(i);
            place[a]= newdesporto.getTipo() +" " +String.valueOf(newdesporto.getnLista());
            a++;
        }
        
        
        
        
        combo1 = new JComboBox(place);
        add(combo1);


        button = new JButton("OK");
        add(button);

        Handler enter = new Handler();
        button.addActionListener(enter);

    }
         
    private class Handler implements ActionListener{
    
        public void actionPerformed(ActionEvent event){
            
            if (event.getSource() == button){
                String item = combo1.getSelectedItem().toString();
                String items[] =item.split(" ");
                int number = Integer.parseInt(items[1]);
                if("Bar:".equals(items[0])){
                    Bar newbar =BigClass.Instance().bar.get(number);
                    if(newbar.getinscritos()<newbar.getLotacao())
                    newbar.addinscritos();
                    BigClass.Instance().bar.set(number, newbar);
                    
                }
                else if("Expo:".equals(items[0])){
                    Expo newexpo =BigClass.Instance().expo.get(number);
                    if(BigClass.Instance().tipo == "Aluno"){
                        newexpo.addAlunos();
                    }
                    newexpo.addinscritos();
                    BigClass.Instance().expo.set(number, newexpo);
                }
                else if("Desporto:".equals(items[0])){
                    Desporto newdesporto =BigClass.Instance().desporto.get(number);
                    newdesporto.addinscritos();
                    BigClass.Instance().desporto.set(number, newdesporto);
                }
                else if("Jardim:".equals(items[0])){
                    Jardim newjardim =BigClass.Instance().jardim.get(number);
                    newjardim.addinscritos();
                    BigClass.Instance().jardim.set(number, newjardim);
                }
                BigClass.Instance().inscreverUser();
                setVisible(false);
                Menu menu = new Menu();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setSize(350,250);
                menu.setVisible(true);
            }
            
        }
    }
   
}
