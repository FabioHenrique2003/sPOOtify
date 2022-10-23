package Spootify;

import java.util.List;
import java.util.ArrayList;

public class Playlist extends Conteudo{
    List<Conteudo> playlist = new ArrayList<Conteudo>();
    public Playlist(String titulo){
        super();
        settitulo(titulo);
    }

    public void add_musica(Musica musica){
        playlist.add(musica);
    }
    public void add_podcast(Podcast podcast){
        playlist.add(podcast);
    }
    public void add_audiolivro(Audiolivro audiolivro){
        playlist.add(audiolivro);
    }

    public int duracao(){
        int duracao_total=0;
        for(int i = 0; i< playlist.size();i++){
            Conteudo aux = playlist.get(i);
            duracao_total = duracao_total+aux.duracao();
        }
        return duracao_total;
    }

    public List<Musica> get_musicas_playlist(){
        List<Musica> lista_musicas = new ArrayList<Musica>();
        for (int i = 0; i < playlist.size(); i++){
            if(playlist.get(i) instanceof Musica){
                lista_musicas.add((Musica)playlist.get(i));
            }
        }
        return lista_musicas;
    }

    public List<Podcast> get_podcast_playlist(){
        List<Podcast> lista_podcast = new ArrayList<Podcast>();
        for (int i = 0; i < playlist.size(); i++){
            if(playlist.get(i) instanceof Podcast){
                lista_podcast.add((Podcast)playlist.get(i));
            }
        }
        return lista_podcast;
    }

    public List<Audiolivro> get_audiolivro_playlist(){
        List<Audiolivro> lista_audiolivro = new ArrayList<Audiolivro>();
        for (int i = 0; i < playlist.size(); i++){
            if(playlist.get(i) instanceof Audiolivro){
                lista_audiolivro.add((Audiolivro)playlist.get(i));
            }
        }
        return lista_audiolivro;
    }
}
