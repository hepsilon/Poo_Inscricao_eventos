/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static projeto.LoginChecker.LoginChecker;
import projeto.classes.BigClass;

/**
 *
 * @author hipol
 */
public class LoginScreen extends JFrame{
    
    private JLabel item1;
    private JLabel item2;
    
    private JTextField username;
    private JPasswordField password;
    private JButton enterbutton;
    
    public LoginScreen(){
        super("Login Screen");
        setLayout(new FlowLayout());
        
        item1 = new JLabel("Username:");
        add(item1);
        
        username = new JTextField("",10);
        add(username);
       
        item2 = new JLabel("Password:");
        add(item2);
        
        password = new JPasswordField("",10);
        add(password);
        
        enterbutton = new JButton("Enter");
        add(enterbutton);
        
        
        Handler enter = new Handler();
        enterbutton.addActionListener(enter);
        
        
    }
    
    private class Handler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            char[] temppass = password.getPassword();
            String pass = new String(temppass);
            String user = username.getText();

   
            
            //Ficheiro fich = new Ficheiro();
            //fich.open("username.txt");
            int ret = LoginChecker(user,pass); //fich.search(user,pass);
            if (ret == 1){
                BigClass.Instance().user =user;
                JOptionPane.showMessageDialog(null,String.format("User found"));
                setVisible(false);
                Menu menu = new Menu();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setSize(350,250);
                menu.setVisible(true);
            }
            else if (ret == 0){
                BigClass.Instance().user =user;
                JOptionPane.showMessageDialog(null,String.format("New user created"));
                setVisible(false);
                Register menu = new Register(user,pass);
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setSize(350,250);
                menu.setVisible(true);
            }
            else if (ret==-1){
                JOptionPane.showMessageDialog(null,String.format("wrong password"));
            }
            
        }           
    }
   
    
}
