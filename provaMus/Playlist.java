import java.util.ArrayList;
import java.util.List;

public class Playlist{
    private String nome;
    private List<Musica> listaMus;
    
public Playlist(String nome){
    this.nome = nome;
    this.listaMus = new ArrayList<>();}
    
public String getNome(){
        return nome;
}

public List<Musica> getMusicas(){
    return listaMus;
}
//composicao 
public void addMusica(Musica mus){
    listaMus.add(mus);
System.out.println("Música adicionada à playlist: " + mus.getNome());
}

public void removerMusica(Musica mus){
    listaMus.remove(mus);
 System.out.println("Música removida da playlist: " + mus.getNome());
}

public void listarMusicas() {
System.out.println(" Playlist: " + nome);
for(Musica mus:listaMus){
    System.out.println(m.getNome() +  m.getArtista().getNome());
}}}

