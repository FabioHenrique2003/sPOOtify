package Spootify;

public class Podcast extends Conteudo{
    private String nome_apresentador;
    private String tema;
    private String resenha;

    public Podcast(String titulo, int duracao,String nome_apresentador, String tema, String resenha){
        super();
        settitulo(titulo);
        setduracao(duracao);
        this.nome_apresentador = nome_apresentador;
        this.tema = tema;
        this.resenha = resenha;
    }

    public String titulo(){
        return super.titulo();
    }

    public int duracao(){
        return super.duracao();
    }

    public String nome_apresentador(){
        return nome_apresentador;
    }

    public String tema(){
        return tema;
    }

    public String resenha(){
        return resenha;
    }

    
}
