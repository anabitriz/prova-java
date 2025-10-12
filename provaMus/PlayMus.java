public class PlayMus {
    //classes associativas
    private Musica musica; 
    private Playlist playlist;
    private int ordemM;

public PlayMusica( Musica musica, Playlist playlist, int ordemM){
    this.playlist = playlist;
    this.musica = musica;
    this.ordemM = ordemM;
}

public Playlist getPlaylist(){
    return playlist;
}

public Musica getMusica() {
    return musica;
}

public int getOrdemM() {
    return ordemM;
}

public void toString(){
  return "Música: "+musica.getNome()+"Playlist: " + playlist.getNome()+ "Ordem: " + ordemM;
}}
