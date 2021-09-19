/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import projeto.classes.BigClass;

/**
 *
 * @author hipol
 */
public class LoginChecker {
    public static int LoginChecker(String user,String pass){
        for(int i =0;i<BigClass.Instance().aluno.size();i++){
            if (user.equals(BigClass.Instance().aluno.get(i).getNome())){
                if(pass.equals(BigClass.Instance().aluno.get(i).getPassword())){
                    BigClass.Instance().tipo="Aluno";
                    return 1;
                }
                else {
                    return -1; 
                }   
            }
        }
        for(int i =0;i<BigClass.Instance().funcionario.size();i++){
            if (user.equals(BigClass.Instance().funcionario.get(i).getNome())){
                if(pass.equals(BigClass.Instance().funcionario.get(i).getPassword())){
                    BigClass.Instance().tipo="Funcionario";
                    return 1;
                }
                else {
                    return -1; 
                }   
            }
        }
        for(int i =0;i<BigClass.Instance().professor.size();i++){
            if (user.equals(BigClass.Instance().professor.get(i).getNome())){
                if(pass.equals(BigClass.Instance().professor.get(i).getPassword())){
                    BigClass.Instance().tipo="Professor";
                    return 1;
                }
                else {
                    return -1; 
                }   
            }
        }
        return 0;
    }
}
