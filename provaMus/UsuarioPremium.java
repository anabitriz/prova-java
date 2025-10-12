public class UsuarioPremium extends Usuario {
    private String acessoPagamento;
    private boolean cancelarModoPremium;

public UsuarioPremium(String email, String nome, String senha, String acessoPagamento, boolean cancelarModoPremium) {
        super(email, nome, senha);
        this.acessoPagamento = acessoPagamento;
        this.cancelarModoPremium = cancelarModoPremium;
}



public void cancelarPremium() {
    this.cancelarModoPremium = false;
System.out.println(nome + " cancelou o modo premium ");
}

@Override
public void tocar() {
    System.out.println(nome + "ouvindo música à vontade");
}}