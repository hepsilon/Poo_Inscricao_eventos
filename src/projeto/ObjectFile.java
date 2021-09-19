/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto.classes.BigClass;

/**
 *
 * @author hipol
 */
public class ObjectFile {
    
    public ObjectFile(){}
    
    public static void Save(String nomeFicheiro) throws IOException{
        
        File fich = new File(nomeFicheiro);
        FileOutputStream os = null;
        ObjectOutputStream fichObjeto = null;
        try {
            os = new FileOutputStream(fich);
            fichObjeto = new ObjectOutputStream(os);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        fichObjeto.writeObject(BigClass.Instance());
        
    }
    
    public static void Load(String nomeFicheiro) throws FileNotFoundException, IOException{
        
        File fich = new File(nomeFicheiro);
        FileInputStream is = null;
        ObjectInputStream fichObjeto = null;
        is = new FileInputStream(fich);
        fichObjeto = new ObjectInputStream(is);
        BigClass inst = null;
        try {
            inst = (BigClass) fichObjeto.readObject();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        if (inst == null){
            return;
        }
        BigClass.setInstance(inst);
    }
    
}
