public class UsuarioComum extends Usuario {
    private boolean assinarPremium;

public UsuarioComum(String email, String nome, String senha, boolean assinarPremium) {
    super(email, nome, senha);
     this.assinarPremium = assinarPremium;
}

@Override
public void tocar() {
    System.out.println(nome + " Música com anúncio - - - assine já o modo premium"+ assinarPremium);
}
}
