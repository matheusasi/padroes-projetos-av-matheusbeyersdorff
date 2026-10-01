public class Main {
    public static void main(String[] args) {
        ContratacaoFrete rodoviaria = new ContratacaoRodoviaria();
        ContratacaoFrete aerea = new ContratacaoAerea();
        ContratacaoFrete maritima = new ContratacaoMaritima();

        rodoviaria.contratar("Maria Silva", 10000);
        aerea.contratar("Joao Souza", 5000);
        maritima.contratar("Empresa Atlantico", 80000);
    }
}
