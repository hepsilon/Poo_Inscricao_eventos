/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import javax.swing.JFrame;
import projeto.classes.*;

/**
 *
 * @author hipol
 */
public class Receita {
    public static int Receita(){
        int receita = receitaB() + receitaE();
        return receita;
    }
    public static int receitaB(){  
        int i,vCusto,vInscritos,vInscritosA,receita=0;
        Bar newbar = new Bar();
        for(i=0;i<BigClass.Instance().bar.size();i++){
            newbar = BigClass.Instance().bar.get(i);
            vCusto = newbar.getConsumo();
            vInscritos = newbar.getinscritos();
            receita+= (vInscritos)*vCusto;
    }
        return receita;
    }
    public static int receitaE(){  
        int i,vCusto,vInscritos,vInscritosA,receita=0;
        Expo newexpo = new Expo();
        for(i=0;i<BigClass.Instance().expo.size();i++){
            newexpo =  BigClass.Instance().expo.get(i);
            vCusto = newexpo.getCost();
            vInscritos = newexpo.getinscritos();
            vInscritosA= newexpo.getAlunos();
            receita+= (vInscritos - vInscritosA * vCusto) +(vInscritosA * (vCusto *0.9));
    }
        return receita;
    }
 
}