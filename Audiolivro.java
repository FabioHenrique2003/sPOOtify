package Spootify;

import java.util.List;
import java.util.ArrayList;

public class Audiolivro extends Conteudo{
    private List<String> nomes_autores = new ArrayList<String>();
    private String nome_editora;
    private String nome_narrador;
    private String resumo;

    public Audiolivro(String titulo, int duracao,String titulo_obra, List<String> nomes_autores, String nome_editora, String nome_narrador, String resumo){
        super();
        settitulo(titulo);
        setduracao(duracao);
        this.nomes_autores = nomes_autores;
        this.nome_editora = nome_editora;
        this.nome_narrador = nome_narrador;
        this.resumo = resumo;
    }

    public String titulo(){
        return super.titulo();
    }

    public int duracao(){
        return super.duracao();
    }

    public String nome_editora(){
        return nome_editora;
    }

    public String nome_narrador(){
        return nome_narrador;
    }

    public String resumo(){
        return resumo;
    }

    public List<String> get_lista_autores(){
        return nomes_autores;
    }
}
