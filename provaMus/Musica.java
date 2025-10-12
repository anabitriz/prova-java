public class Musica {
    private String nomeMus;
    private Artista artista;
//Artista com A vem da classe Artista, 
// artista com a é uma variavel. AQUI ESTÁ A ASSOCIAÇÃO ENTRE MUSICA E ART.

public Musica(String nome, Artista artista) {
    this.nomeMus = nome;
    this.artista = artista;
}
    

    
public Artista getArtista() {
    return artista;
}
    
@Override
public String toString() {
     return "Música: " + nomeMus + artista.getNome();
}
}