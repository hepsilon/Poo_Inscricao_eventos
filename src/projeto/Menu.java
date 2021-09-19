/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static projeto.Receita.*;
import projeto.classes.BigClass;







public class Menu extends JFrame{
  private JLabel title;
  private JButton button1;
  private JButton button2;
  private JButton button3;
  private JButton button4;
  private JButton button5;
  private JButton button6;
  
  public Menu()
  {
    super("Insert title");
    setLayout(new FlowLayout());
    
    title = new JLabel("                   Menu                      ");
    add(title);
    
    button1 = new JButton("Apresentação dos locais a visitar");
    button2 = new JButton("Seleção de locais a visitar");
    button3 = new JButton("Seriação dos locais a visitar");
    button4 = new JButton("Visualisação da guest list");
    button5 = new JButton("Contabilização das receitas dos locais visitados");
    button6 = new JButton("Guardar mudanças");
    
    add(button1);
    add(button2);
    add(button3);
    add(button4);
    add(button5);
    add(button6);
    
    
    Handler enter = new Handler();
    button1.addActionListener(enter);
    button2.addActionListener(enter);
    button3.addActionListener(enter);
    button4.addActionListener(enter);
    button5.addActionListener(enter);
    button6.addActionListener(enter);

    
    
  }
    private class Handler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            if (event.getSource() == button1){
                Presentation menu = new Presentation();
                menu.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                menu.setSize(350,800);
                menu.setVisible(true);
            }
            else if (event.getSource() == button2){
                if(BigClass.Instance().LeftInscrUser()>0){
                setVisible(false);
                Selection menu = new Selection();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setSize(350,250);
                menu.setVisible(true);  
                }
                else{
                     JOptionPane.showMessageDialog(null,String.format("Este utilizador já esta inscrito em 5 atividades"));
                }
            }
            else if (event.getSource() == button3){
                //setVisible(false);
                Sorting menu = new Sorting();
                menu.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                menu.setSize(350,800);
                menu.setVisible(true);
            }
            else if (event.getSource() == button4){
                if(BigClass.Instance().LeftInscrUser()>0){
                    Guest menu = new Guest();
                    menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    menu.setSize(350,800);
                    menu.setVisible(true);
                }
                else{
                     JOptionPane.showMessageDialog(null,String.format("Este utilizador já esta inscrito em 5 atividades"));
                }
            }
            else if (event.getSource() == button5){

                String receita = String.valueOf(Receita());
                JOptionPane.showMessageDialog(null,String.format("O valor minimo esperado para o convivio é:"+receita));
            }
            else if (event.getSource() == button6){
                try {
                    ObjectFile.Save("big");
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }

                JOptionPane.showMessageDialog(null,String.format("Changes Saved"));
            }
                
            
    
  }
        
}
}
