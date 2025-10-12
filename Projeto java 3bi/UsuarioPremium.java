public class UsuarioPremium extends Usuario {
    private String acessoPagamento;
    private boolean cancelarModoPremium;

    public UsuarioPremium(String email, String nome, String senha, String acessoPagamento, boolean cancelarModoPremium) {
        super(email, nome, senha);
        this.acessoPagamento = acessoPagamento;
        this.cancelarModoPremium = cancelarModoPremium;
    }

    public void cancelarPremium() {
        this.cancelarModoPremium = true; // mudar para true quando cancelar
        System.out.println(nome + " cancelou o modo premium. Método de pagamento: " + acessoPagamento);
    }

    @Override
    public void tocar() {
        if (!cancelarModoPremium) {
            System.out.println(nome + " ouvindo música à vontade (Premium)");
        } else {
            System.out.println(nome + " - Assinatura premium cancelada");
        }
    }
    
    // Getters para usar os campos
    public String getAcessoPagamento() {
        return acessoPagamento;
    }
    
    public boolean isCancelarModoPremium() {
        return cancelarModoPremium;
    }
}