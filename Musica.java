package Spootify;

import java.util.List;
import java.util.ArrayList;

public class Musica extends Conteudo{
    private List<String> nome_compositores = new ArrayList<String>();
    private List<String> nome_interpretes =  new ArrayList<String>();
    private String genero;

    public Musica(String titulo, int duracao,String genero,List<String> nome_compositores, List<String> nome_interpretes){
        super();
        settitulo(titulo);
        setduracao(duracao);
        this.genero = genero;
        this.nome_compositores = nome_compositores;
        this.nome_interpretes = nome_interpretes;
    }

    public String titulo(){
        return super.titulo();
    }

    public int duracao(){
        return super.duracao();
    }

    public String genero(){
        return genero;
    }

    public List<String> get_lista_compositores(){
        return nome_compositores;
    }

    public List<String> get_lista_interprete(){
        return nome_interpretes;
    }


}
