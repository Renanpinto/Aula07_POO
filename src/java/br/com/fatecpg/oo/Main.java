
package br.com.fatecpg.oo;


public class Main {
    public static void main(String[] args) {
        
        Data hoje = new Data();
        hoje.setDia(20);
        hoje.setMes(9);
        hoje.setAno(2017);
        
        Data niver = new Data();
        niver.setDia(19);
        niver.setMes(9);
        niver.setAno(1992);
        
        Horario horaAtual = new Horario();
        horaAtual.setHora(20);
        horaAtual.setMinuto(32);
        horaAtual.setSegundo(00);
        
        Horario horaIntervalo = new Horario();
        horaIntervalo.setHora(20);
        horaIntervalo.setMinuto(40);
        horaIntervalo.setSegundo(00);
        
        
        /*Testes com pessoa
        Pessoa eu = new Pessoa();
        eu.nome="Renan";
        Pessoa meuPai = new Pessoa();
        meuPai.nome="Nelson";
        eu.pai = meuPai;
        eu.pai.nome = "Fulano";
        Pessoa meuAvo = new Pessoa();
        meuAvo.nome="Ramiro";
        eu.pai.pai = meuAvo;
 
        
        System.out.println(eu.nome);
        System.out.println(meuPai.nome);
        System.out.println(meuAvo.nome);
        System.out.println(eu.avoPaterno().nome);*/
        
        
        
        
    }
}
