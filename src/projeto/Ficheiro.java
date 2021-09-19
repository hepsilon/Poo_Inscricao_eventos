/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author hipol
 */
import java.io.*;
import java.util.*;
import projeto.classes.*;


public class Ficheiro {
    
    private Scanner f;
    private String u;
    private String p;
    
    public void Read(){
    
    }
    public void open(String s){
        try{
            f = new Scanner(new File(s));
        }
        catch(FileNotFoundException e){
            System.out.println("Nao foi possivel abrir o ficheiro");
            
        }
    }
    public int search(String user, String pass){
        while(f.hasNext()){
            if(user.equals(f.next())){
                
                if(f.next().equals(pass)){
                    return 1;
                }
                else{
                    return -1;
                }
            }
            f.next();
        
        }
        try {
            FileWriter file = new FileWriter("username.txt" ,true);
            PrintWriter print_line = new PrintWriter(file);
            print_line.printf("\n%s %s",user,pass);
            print_line.close();
            return 0;
        } catch (IOException ex) {
            System.out.println("Nao foi possivel escrever no ficheiro");
        }
        return -1;
    }
    public void searchB(){
        int l[] =new int[10],c[]=new int[10],gpsy[]=new int[10],gpsx[]=new int[10],i=0;
        String lot;
        String cost;
        String gpsyS;
        String gpsxS;
        
        while(f.hasNext()){
               lot = f.next();
               cost = f.next();
               gpsxS = f.next();
               gpsyS = f.next();
               l[i] = Integer.parseInt(lot);
               c[i] = Integer.parseInt(cost);
               gpsx[i] = Integer.parseInt(gpsxS);
               gpsy[i] = Integer.parseInt(gpsyS);
               Bar bar = new Bar();
               bar.setConsumo(c[i]);
               bar.setLotacao(l[i]);
               bar.setGpsx(gpsx[i],gpsy[i]);
               bar.setupInscritos();
               bar.setnLista(i);
               bar.setTipo("Bar:");
               bar.Bar();
               BigClass.Instance().addBar(bar);
               i++;
            }
        }
    
    public void searchD(){
        int gpsy[]=new int[10],gpsx[]=new int[10],i=0;
        String d[] = new String[10];
        String gpsxS;
        String gpsyS;
        
        while(f.hasNext()){
               d[i] = f.next();
               gpsxS = f.next();
               gpsyS = f.next();
               gpsx[i] = Integer.parseInt(gpsxS);
               gpsy[i] = Integer.parseInt(gpsyS);
               Desporto desporto = new Desporto();
               desporto.setDesporto(d[i]);
               desporto.setGpsx(gpsx[i],gpsy[i]);
               desporto.setupInscritos();
               desporto.setnLista(i);
               desporto.setTipo("Desporto:");
               BigClass.Instance().addDesporto(desporto);
               i++;
            }
        }
    public void searchA(){
        int c[] =new int[10],gpsy[]=new int[10],gpsx[]=new int[10],i=0;
        int cost;
        String arte[] = new String[10];
        String gpsyS;
        String gpsxS;
        
        while(f.hasNext()){
               arte[i] = f.next();
               cost = Integer.parseInt(f.next());
               gpsxS = f.next();
               gpsyS = f.next();
               gpsx[i] = Integer.parseInt(gpsxS);
               gpsy[i] = Integer.parseInt(gpsyS);
               Expo expo = new Expo();
               expo.setArte(arte[i]);
               expo.setCost(cost);
               expo.setGpsx(gpsx[i],gpsy[i]);
               expo.setupInscritos();
               expo.setnLista(i);
               expo.setTipo("Exposição:");
               BigClass.Instance().addExpo(expo);
               i++;
               
            }
        }
    public void searchJ(){
        int j[] =new int[10],gpsy[]=new int[10],gpsx[]=new int[10],i=0;
        String area;
        String gpsyS;
        String gpsxS;
        
        while(f.hasNext()){
               area = f.next();
               gpsxS = f.next();
               gpsyS = f.next();
               j[i] = Integer.parseInt(area);
               gpsx[i] = Integer.parseInt(gpsxS);
               gpsy[i] = Integer.parseInt(gpsyS);
               Jardim jardim = new Jardim();
               jardim.setArea(j[i]);
               jardim.setGpsx(gpsx[i],gpsy[i]);
               jardim.setupInscritos();
               jardim.setnLista(i);
               jardim.setTipo("Jardim:");
               BigClass.Instance().addJardim(jardim);
               i++;
          
        }
    
    }
}