public class SpeiMexico implements Pagamento {

    public String descrever(double valor) {
        return String.format("Pagamento via SPEI de %.2f", valor);
    }
}
