public class FyMusic{
    public static void main(String[] args){

UsuarioComum comum = new UsuarioComum("silva@gmail.com", "Eduarda", "1234", false);
UsuarioPremium premium = new UsuarioPremium("joao@gmail.com", "João Joarez", "5678", "Cartão", false);

UsuarioComum comum = new UsuarioComum("mari@gmail.com", "Mariana", "2233", true);
UsuarioPremium premium = new UsuarioPremium("armando@email.com", "Armando", "7766", "pix", true);

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
playlist.adicionarMusica(m1);
playlist.adicionarMusica(m2);
playlist.listarMusicas();

}}