public class FabricaBrasil implements FabricaPais {

    public ComprovanteFiscal criarComprovante() {
        return new NfseBrasil();
    }

    public Pagamento criarPagamento() {
        return new PixBrasil();
    }

    public TermoPrivacidade criarTermo() {
        return new TermoLgpd();
    }
}
