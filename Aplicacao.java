package Spootify;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quer fazer uma playlist? \n1- Sim \n2- Não");
        int pergunta0 = scan.nextInt();
        if (pergunta0 == 1){
        System.out.println("\nQual o nome de sua playlist? ");
        scan.nextLine();
        String nome_playlist = scan.nextLine();
        Playlist playlist = new Playlist(nome_playlist);
        int pergunta = 0;
        while(pergunta != -1){
            System.out.println("\nO que você quer adicionar na playlist? \n1- Música \n2- Podcast \n3- Audiolivro \nOu digite -1 para sair");
            pergunta = scan.nextInt();

        if (pergunta == 1){
            System.out.println("\nCRIANDO MÚSICA...\n");
            scan.nextLine();
            System.out.println("Escreva o título: ");
            String titulo_musica = scan.nextLine();
            System.out.println("Escreva a duração: ");
            int duracao_musica = scan.nextInt();
            System.out.println("Escreva o gênero: ");
            scan.nextLine();
            String genero_musica = scan.nextLine();

            List<String> nome_compositores = new ArrayList<String>();
            System.out.println("Quantos compositores tem essa música? ");
            int compositores = scan.nextInt();
            System.out.println("Adicione o nome dos compositores: ");
            int i = 0;
            while(i <= compositores){
                String nome = scan.nextLine();
                nome_compositores.add(nome);
                i++;
            }

            List<String> nome_interpretes = new ArrayList<String>();
            System.out.println("Quantos interpretes tem essa música? ");
            int interpretes = scan.nextInt();
            System.out.println("Adicione o nome dos interpretes: ");
            int j = 0;
            while(j <= interpretes){
                String nome = scan.nextLine();
                nome_interpretes.add(nome);
                j++;
            }

            Musica musica = new Musica(titulo_musica,duracao_musica,genero_musica,nome_compositores,nome_interpretes);
            playlist.add_musica(musica);
        }

        if (pergunta == 2){
            System.out.println("\nCRIANDO PODCAST...\n");
            scan.nextLine();
            System.out.println("Escreva o título: ");
            String titulo_podcast = scan.nextLine();
            System.out.println("Escreva a duração: ");
            int duracao_podcast = scan.nextInt();
            System.out.println("Escreva o nome do apresentador: ");
            scan.nextLine();
            String nome_apresentador = scan.nextLine();
            System.out.println("Escreva o tema: ");
            String tema = scan.nextLine();
            System.out.println("Escreva uma resenha: ");
            String resenha = scan.nextLine();
            Podcast podcast = new Podcast(titulo_podcast, duracao_podcast, nome_apresentador, tema, resenha);
            playlist.add_podcast(podcast);
        }
        
        if (pergunta == 3){
        System.out.println("\nCRIANDO AUDIOLIVRO...\n");
        scan.nextLine();
        System.out.println("Escreva o título: ");
        String titulo_audiolivro = scan.nextLine();
        System.out.println("Escreva a duração: ");
        int duracao_audiolivro = scan.nextInt();
        System.out.println("Escreva o titulo da obra: ");
        scan.nextLine();
        String titulo_obra = scan.nextLine();
        System.out.println("Quantos autores tem a obra?: ");
        int qnts_autores = scan.nextInt();
        List<String> nomes_autores = new ArrayList<String>();
        System.out.println("Adicione o nome dos autores: ");
        int f = 0;
        while(f <= qnts_autores){
                String nome = scan.nextLine();
                nomes_autores.add(nome);
                f++;
        }
        System.out.println("Escreva o nome da editora: ");
        String editora = scan.nextLine();
        System.out.println("Escreva o nome do narrador: ");
        String narrador = scan.nextLine();
        System.out.println("Escreva o resumo da obra: ");
        String resumo = scan.nextLine();

        Audiolivro audiolivro = new Audiolivro(titulo_audiolivro, duracao_audiolivro, titulo_obra, nomes_autores, editora, narrador, resumo);
        playlist.add_audiolivro(audiolivro);
        }
    }
    
    System.out.println("\nPLAYLIST CRIADA... ");
    System.out.println("Nome da playlist: " + nome_playlist);
    System.out.println("\nDuração da sua playlist: ");

    int segundos = playlist.duracao();
    int horas = segundos/3600;
    segundos %= 3600;
    int minutos = segundos/60;
    segundos %= 60;
    System.out.println(horas + " hora(s)  " + minutos + " minuto(s)  " + segundos + " segundo(s)");
    


    int pergunta2 = 0;
    while(pergunta2 != -1){
        System.out.println("\nVocê quer visualizar alguma coisa de sua playlist? \n1- Música \n2- Podcast \n3- Audiolivro \nOu digite -1 pra Sair");
        pergunta2 = scan.nextInt();
        if (pergunta2 == 1){
            System.out.println("\nRetornando as músicas: ");
            for(int s = 0; s < playlist.get_musicas_playlist().size(); s++){
                Musica musicas = playlist.get_musicas_playlist().get(s);
                System.out.println(musicas.titulo());
            }
        }

        if (pergunta2 == 2){
            System.out.println("\nRetornando os podcasts: ");
            for(int s = 0; s < playlist.get_podcast_playlist().size(); s++){
                Podcast podcast = playlist.get_podcast_playlist().get(s);
                System.out.println(podcast.titulo());
            }
        }

        if (pergunta2 == 3){
            System.out.println("\nRetornando os audiolivros: ");
            for(int s = 0; s < playlist.get_audiolivro_playlist().size(); s++){
                Audiolivro audiolivros = playlist.get_audiolivro_playlist().get(s);
                System.out.println(audiolivros.titulo());
            }
        }
    }
}
    System.out.println("\nFECHANDO APLICAÇÃO...");
    scan.close();
}
}
