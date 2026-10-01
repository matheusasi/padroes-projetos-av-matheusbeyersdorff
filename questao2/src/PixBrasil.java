public class PixBrasil implements Pagamento {

    public String descrever(double valor) {
        return String.format("Pagamento via Pix de R$ %.2f", valor);
    }
}
