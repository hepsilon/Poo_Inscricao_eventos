/* * To change this license header, choose License Headers in Project Properties.
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
public class Register extends JFrame{
    
    private JLabel item1;
    private JLabel item2;
    private JComboBox combo1;
    private JComboBox combo2;
    private JComboBox combo3;
    private JComboBox combo4;
    private JComboBox combo5;
    private JButton button;
    
    private JLabel user;
    private JLabel pass;

    
    
    
    public Register(String username,String password){
        super("Register");
        setLayout(new FlowLayout());
        
        String str1[]={"Aluno","Professor","Funcionario"};
        String str2[]={"Desportivo","Cultural","Boémio","Poupadinho"};
        String str3[]={"Auxiliar", "Associado","Catedrático" };
        String str4[]={"Tempo parcial","Tempo integral" };
        String str5[]={"Lei","Ldm"};
        item1 = new JLabel("Trabalho");
        add(item1);
        combo1 = new JComboBox(str1);
        add(combo1);
        item2 = new JLabel("Perfil");
        add(item2);
        combo2 = new JComboBox(str2);
        add(combo2);
        button = new JButton("Enter");
        add(button);
        combo3 = new JComboBox(str3);
        combo4 = new JComboBox(str4);
        combo5 = new JComboBox(str5);
        add(combo5);
        pack();
        
        
        user = new JLabel(username);
        pass = new JLabel(password);
        
        Handler enter = new Handler();
        combo1.addActionListener(enter);
        button.addActionListener(enter);
    }
    
    private class Handler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(event.getSource()==combo1){
                String str = combo1.getSelectedItem().toString();
                if(str == "Aluno"){
                    add(combo5);
                    remove(combo3);
                    remove(combo4);
                    pack();
                }
                if(str == "Professor"){
                    add(combo3);
                    remove(combo4);
                    remove(combo5);
                    pack();
                }
                if(str == "Funcionario"){
                    add(combo4);
                    remove(combo3);
                    remove(combo5);
                    pack();
                }
            }
            else if(event.getSource()==button){
                String str = combo1.getSelectedItem().toString();
                if(str == "Aluno"){
                    Aluno aluno= new Aluno();
                    aluno.setCurso(combo5.getSelectedItem().toString());
                    aluno.setNome(user.getText());
                    aluno.setPassword(pass.getText());
                    aluno.setPerfil(combo2.getSelectedItem().toString());
                    aluno.setType(str);
                    BigClass.Instance().addAluno(aluno);
                    BigClass.Instance().tipo="Aluno";
                    
                }
                else if(str == "Professor"){
                    Professor prof= new Professor();
                    prof.setTipo(combo3.getSelectedItem().toString());
                    prof.setNome(user.getText());
                    prof.setPassword(pass.getText());
                    prof.setPerfil(combo2.getSelectedItem().toString());
                    prof.setType(str);
                    BigClass.Instance().addProfessor(prof);
                    BigClass.Instance().tipo="Professor";
                }
                else if(str == "Funcionario"){
                    Funcionario func= new Funcionario();
                    func.setTempo(combo4.getSelectedItem().toString());
                    func.setNome(user.getText());
                    func.setPassword(pass.getText());
                    func.setPerfil(combo2.getSelectedItem().toString());
                    func.setType(str);
                    BigClass.Instance().addFuncionario(func);
                    BigClass.Instance().tipo="Funcionario";
                }
                JOptionPane.showMessageDialog(null,String.format("New user created"));
                setVisible(false);
                Menu menu = new Menu();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setSize(350,250);
                menu.setVisible(true);
            }
        }
    } 
}
    
