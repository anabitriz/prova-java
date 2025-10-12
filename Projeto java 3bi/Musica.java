public class Musica {
    private String nome;
    private Artista artista;

    public Musica(String nome, Artista artista) {
        this.nome = nome;
        this.artista = artista;
    }

    // MÉTODO GETNOME QUE ESTAVA FALTANDO
    public String getNome() {
        return nome;
    }

    public Artista getArtista() {
        return artista;
    }
}