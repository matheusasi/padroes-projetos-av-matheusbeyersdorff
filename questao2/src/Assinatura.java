public class Assinatura {

    private final String cliente;
    private final double valor;
    private final ComprovanteFiscal comprovante;
    private final Pagamento pagamento;
    private final TermoPrivacidade termo;

    public Assinatura(String cliente, double valor, FabricaPais fabrica) {
        this.cliente = cliente;
        this.valor = valor;
        this.comprovante = fabrica.criarComprovante();
        this.pagamento = fabrica.criarPagamento();
        this.termo = fabrica.criarTermo();
    }

    public void ativar() {
        System.out.println("----- Assinatura ativada para " + cliente + " -----");
        System.out.println("Comprovante fiscal: " + comprovante.descrever(valor));
        System.out.println("Pagamento: " + pagamento.descrever(valor));
        System.out.println("Privacidade: " + termo.descrever());
        System.out.println();
    }
}
