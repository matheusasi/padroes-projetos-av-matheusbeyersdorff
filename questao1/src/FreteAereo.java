import java.util.List;

public class FreteAereo implements Frete {

    public String getModalidade() {
        return "Aereo";
    }

    public double calcularValor(double valorCarga) {
        return valorCarga * 0.06;
    }

    public List<String> getDocumentos() {
        return List.of("AWB (Air Waybill)");
    }
}
