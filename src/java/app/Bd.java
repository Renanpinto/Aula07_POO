package app;

import java.util.ArrayList;

public class Bd {
    private static ArrayList<Contato> contatos;
    public static ArrayList<Contato> getContatos(){
        if(contatos == null){
            contatos = new ArrayList<>();
        }
        return contatos;
    }
}
