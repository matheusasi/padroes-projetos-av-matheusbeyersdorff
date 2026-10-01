public class CfdiMexico implements ComprovanteFiscal {

    public String descrever(double valor) {
        double iva = valor * 0.16;
        return String.format("CFDI com IVA de 16%% (%.2f)", iva);
    }
}
