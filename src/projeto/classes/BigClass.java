/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.classes;

import java.io.Serializable;
import java.util.ArrayList;
import projeto.classes.Pessoas;

/**
 *
 * @author hipol
 */

public class BigClass  implements Serializable{
    
    public ArrayList<Pessoas> pessoas;
    public ArrayList<Locais> locais;
    public ArrayList<Aluno> aluno;
    public ArrayList<Bar> bar;
    public ArrayList<Desporto> desporto;
    public ArrayList<Expo> expo;
    public ArrayList<Funcionario> funcionario;
    public ArrayList<Jardim> jardim;
    public ArrayList<Professor> professor;
    public String user;
    public String tipo;
    private static BigClass instance = null;
    
    
    
    
    
    public void BigClass(){
        this.pessoas = new ArrayList<>();
        this.locais = new ArrayList<>();
        this.aluno = new ArrayList<>();
        this.bar = new ArrayList<>();
        this.desporto = new ArrayList<>();
        this.expo = new ArrayList<>();
        this.funcionario = new ArrayList<>();
        this.jardim = new ArrayList<>();
        this.professor = new ArrayList<>();
    }
    
    public static BigClass Instance(){
        if (instance == null){
            instance = new BigClass();
        }
        return instance;
    }
    
    public static void setInstance(BigClass inst){
        instance = inst;
    }
    
    public static void addPessoa(Pessoas p){
       Instance().pessoas.add(p);
       
    }
    public static void addLocais(Locais l){
       Instance().locais.add(l);
       
    }
    public void addAluno(Aluno a){
       Instance().aluno.add(a);
       
    }
    public void addDesporto(Desporto d){
       Instance().desporto.add(d);
       
    }
    public void addExpo(Expo e){
       Instance().expo.add(e);
       
    }
    public void addFuncionario(Funcionario f){
       Instance().funcionario.add(f);
       
    }
    public void addJardim(Jardim j){
       Instance().jardim.add(j);
       
    }
    public void addProfessor(Professor t){
       Instance().professor.add(t);
       
    }
    public void addBar(Bar b){
       Instance().bar.add(b);
       
    }
    public void inscreverUser(){
         for(int i =0;i<BigClass.Instance().aluno.size();i++){
            if (user.equals(BigClass.Instance().aluno.get(i).getNome())){
                Aluno newaluno= BigClass.Instance().aluno.get(i);
                newaluno.decrementInscr();
                BigClass.Instance().aluno.set(i,newaluno);
                return;
            }
        }
        for(int i =0;i<BigClass.Instance().funcionario.size();i++){
            if (user.equals(BigClass.Instance().funcionario.get(i).getNome())){
                Funcionario funcio= BigClass.Instance().funcionario.get(i);
                funcio.decrementInscr();
                BigClass.Instance().funcionario.set(i,funcio);
                return;
            }
        }
        for(int i =0;i<BigClass.Instance().professor.size();i++){
            if (user.equals(BigClass.Instance().professor.get(i).getNome())){
                Professor prof= BigClass.Instance().professor.get(i);
                prof.decrementInscr();
                BigClass.Instance().professor.set(i,prof);
                return;
                  
            }
        }
    }
        public int LeftInscrUser(){
         for(int i =0;i<BigClass.Instance().aluno.size();i++){
            if (user.equals(BigClass.Instance().aluno.get(i).getNome())){
                return BigClass.Instance().aluno.get(i).getInscr();
            }
        }
        for(int i =0;i<BigClass.Instance().funcionario.size();i++){
            if (user.equals(BigClass.Instance().funcionario.get(i).getNome())){
                return BigClass.Instance().funcionario.get(i).getInscr();
            }
        }
        for(int i =0;i<BigClass.Instance().professor.size();i++){
            if (user.equals(BigClass.Instance().professor.get(i).getNome())){
                return BigClass.Instance().professor.get(i).getInscr();
                  
            }
        }
        return 0;
    }    
}
