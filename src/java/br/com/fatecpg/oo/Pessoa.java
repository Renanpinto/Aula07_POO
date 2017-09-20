/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.oo;

import java.util.Date;

/**
 *
 * @author a
 */
public class Pessoa {
    String nome;
    String cpf;
    double altura;
    double peso;
    Date nascimento;
    Pessoa pai;
    Pessoa mae;
    Pessoa avoMaterno;
    Pessoa avoPaterno;
    
    Pessoa avoPaterno(){
        return pai.pai;
    }
    
    Pessoa avóPaterno(){
        return mae.pai;
    }
               
    
}
