//Usuário é Abstrato:
//Porque serve apenas como modelo genérico para os tipos de usuários.
//Ela tem os atributos e comportamentos comuns (nome, email, senha) e define um método abstrato (tocar()) que muda conforme o tipo de usuário


public abstract class Usuario {
    protected String email;
    protected String nome;
    protected String senha;
    
public Usuario(String email, String nome, String senha){
    this.email = email;
    this.nome = nome;
    this.senha = senha;
}
    

public String getEmail() {
    return email;
}
    
public void setEmail(String email) {
    this.email = email;
}
    
public String getNome() {
    return nome;
}
    
public void setNome(String nome) {
    this.nome = nome;
}
    
public String getSenha() {
    return senha;
}
    
public void setSenha(String senha) {
    this.senha = senha;
}

// polimorfismo de sobrescrita de metodo abstrato
public abstract void tocar();
    
@Override
public String toString() {
    return "Usuário: " + nome + " (" + email + ")";
}
}