public class NfseBrasil implements ComprovanteFiscal {

    public String descrever(double valor) {
        double iss = valor * 0.05;
        return String.format("NFS-e com ISS de 5%% (R$ %.2f)", iss);
    }
}
