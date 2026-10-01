import java.util.List;

public class FreteMaritimo implements Frete {

    public String getModalidade() {
        return "Maritimo";
    }

    public double calcularValor(double valorCarga) {
        return valorCarga * 0.01;
    }

    public List<String> getDocumentos() {
        return List.of("BL (Bill of Lading)", "Fatura comercial");
    }
}
