/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import projeto.classes.*;

/**
 *
 * @author hipol
 */
public class Guest extends JFrame {
    private JLabel text;
    private JComboBox combo1;
    private JButton button;
    private String texto = "<html>";
    public Guest(){
        super("GuestList");
        setLayout(new FlowLayout());
        
        String[] place= new String[BigClass.Instance().bar.size()];
        for(int i=0;i<BigClass.Instance().bar.size();i++){
            Bar newbar =  BigClass.Instance().bar.get(i);
            place[i]= newbar.getTipo() + " " +String.valueOf(newbar.getnLista());
        }
        combo1 =new JComboBox(place);
        add(combo1);
        
        button = new JButton("enter");
        add(button);
        
        
        Handler enter = new Handler();
        combo1.addActionListener(enter);
        button.addActionListener(enter);
    }
    
    private class Handler implements ActionListener{
    
        public void actionPerformed(ActionEvent event){
            if(event.getSource()==combo1){
                String str  = combo1.getSelectedItem().toString();
                String strs[] = str.split(" ");
                Bar newbar = BigClass.Instance().bar.get(Integer.parseInt(strs[1]));
                for(int i = 0; i<newbar.guest.size();i++){
                    texto+= newbar.guest.get(i).getType()+ ": " ;
                    texto+= newbar.guest.get(i).getNome()+" ";
                    texto+= newbar.guest.get(i).getPerfil()+" ";
                    if(newbar.guest.get(i).getType()=="Aluno"){
                        for(int j = 0;j<BigClass.Instance().aluno.size();j++){
                            if (BigClass.Instance().aluno.get(j).getNome()== newbar.guest.get(i).getNome()){
                       
                                texto+= BigClass.Instance().aluno.get(j).getCurso();
                            }
                        }
                    }
                    texto+= "<br>";
                }
                texto+="</html>";
                text = new JLabel(texto);
                add(text);
                JOptionPane.showMessageDialog(null,String.format(texto));
            }
            else if(event.getSource()==button){
                String str  = combo1.getSelectedItem().toString();
                String strs[] = str.split(" ");
                Bar newbar = BigClass.Instance().bar.get(Integer.parseInt(strs[1]));
                int guestsize =(int) 0.4*newbar.getLotacao();
                if(newbar.guest.size()<guestsize){
                
                    BigClass.Instance().inscreverUser();
                    for(int j = 0;j<BigClass.Instance().aluno.size();j++){
                        if (BigClass.Instance().aluno.get(j).getNome()== BigClass.Instance().user){
                            newbar.guest.add(BigClass.Instance().aluno.get(j));
                            BigClass.Instance().bar.set(Integer.parseInt(strs[1]),newbar);

                        }
                    }
                    for(int j = 0;j<BigClass.Instance().professor.size();j++){
                        if (BigClass.Instance().professor.get(j).getNome()== BigClass.Instance().user){
                            newbar.guest.add(BigClass.Instance().professor.get(j));
                            BigClass.Instance().bar.set(Integer.parseInt(strs[1]),newbar);

                        }
                    }
                    for(int j = 0;j<BigClass.Instance().funcionario.size();j++){
                        if (BigClass.Instance().funcionario.get(j).getNome()== BigClass.Instance().user){
                            newbar.guest.add(BigClass.Instance().funcionario.get(j));
                            BigClass.Instance().bar.set(Integer.parseInt(strs[1]),newbar);
                        }
                    }
                    setVisible(false);
                    Menu menu = new Menu();
                    menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    menu.setSize(350,250);
                    menu.setVisible(true);
                }
                else{
                     for(int j = 0;j<BigClass.Instance().aluno.size();j++){
                        if (BigClass.Instance().aluno.get(j).getNome()== BigClass.Instance().user && BigClass.Instance().aluno.get(j).getPerfil()=="Boémio"){
                            for(int i = 0;i<newbar.guest.size();i++){
                                if(newbar.guest.get(i).getPerfil() != "Boémio"){
                                    newbar.guest.set(i,BigClass.Instance().aluno.get(j));
                                    BigClass.Instance().bar.set(Integer.parseInt(strs[1]),newbar);
                                    BigClass.Instance().inscreverUser();
                                }
                            }
                        }
                    }
                    for(int j = 0;j<BigClass.Instance().professor.size();j++){
                        if (BigClass.Instance().professor.get(j).getNome()== BigClass.Instance().user && BigClass.Instance().funcionario.get(j).getPerfil()=="Boémio"){
                            for(int i = 0;i<newbar.guest.size();i++){
                                if(newbar.guest.get(i).getPerfil() != "Boémio"){
                                    newbar.guest.set(i,BigClass.Instance().professor.get(j));
                                    BigClass.Instance().bar.set(Integer.parseInt(strs[1]),newbar);
                                    BigClass.Instance().inscreverUser();
                                }
                            }
                        }
                    }
                    for(int j = 0;j<BigClass.Instance().funcionario.size();j++){
                        if (BigClass.Instance().professor.get(j).getNome()== BigClass.Instance().user && BigClass.Instance().funcionario.get(j).getPerfil()=="Boémio"){
                            for(int i = 0;i<newbar.guest.size();i++){
                                if(newbar.guest.get(i).getPerfil() != "Boémio"){
                                    newbar.guest.set(i,BigClass.Instance().professor.get(j));
                                    BigClass.Instance().bar.set(Integer.parseInt(strs[1]),newbar);
                                    BigClass.Instance().inscreverUser();
                                }
                            }
                        }
                    }
                    setVisible(false);
                    Menu menu = new Menu();
                    menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    menu.setSize(350,250);
                    menu.setVisible(true);
                }
            }
        }
    }
}
