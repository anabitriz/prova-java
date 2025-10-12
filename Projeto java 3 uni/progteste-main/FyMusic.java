public class FyMusic{
    public static void main(String[] args){


UsuarioComum comum = new UsuarioComum("silva@gmail.com", "Eduarda", "1234", false);
UsuarioPremium premium = new UsuarioPremium("joao@gmail.com", "João Joarez", "5678", "Cartão", false);

// caso de polimorfismo: mesmo metodo mas com comportamento diferentes
premium.tocar(); // vai tocar mus sem anuncio
comum.tocar(); // vai tocar com anuncio

//agregacao
Artista a1 = new Artista("Daniel Caesar", "R&B");
Artista a2 = new Artista("Charlie Brown", "Rock");

Musica m1 = new Musica("Best Part", a1);
Musica m2 = new Musica("Céu Azul", a2);

// Composição play e mus
Playlist playlist = new Playlist("Favoritas");
playlist.addMusica(m1);
playlist.addMusica(m2);
playlist.listarMusicas();
}
}