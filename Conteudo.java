package Spootify;

abstract class Conteudo {
    private String titulo;
    private int duracao;

    public String titulo(){
        return titulo;
    }

    public int duracao(){
        return duracao;
    }

    public void settitulo(String titulo){
        this.titulo = titulo;
    }

    public void setduracao(int duracao){
        this.duracao = duracao;
    }
}
