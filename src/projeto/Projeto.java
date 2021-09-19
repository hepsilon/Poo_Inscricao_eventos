/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

import java.util.Scanner;
import projeto.classes.BigClass;

/**
 *
 * @author hipol
 */
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        File f = new File("Big");

        if(f.exists()){
            ObjectFile.Load("Big");
        }
        else{ 
            f.createNewFile();
            BigClass.Instance().BigClass();
            Ficheiro fich1 = new Ficheiro();
            Ficheiro fich2 = new Ficheiro();
            Ficheiro fich3 = new Ficheiro();
            Ficheiro fich4 = new Ficheiro();
            fich1.open("bar.txt");
            fich2.open("desporto.txt");
            fich3.open("expo.txt");
            fich4.open("jardim.txt");
            fich1.searchB();
            fich2.searchD();
            fich3.searchA();
            fich4.searchJ();
            ObjectFile.Save("Big");
        }
        LoginScreen login= new LoginScreen();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setSize(250,130);
        login.setVisible(true);

        return;
    }
    
}

