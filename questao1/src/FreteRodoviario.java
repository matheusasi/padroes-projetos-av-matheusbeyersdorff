import java.util.List;

public class FreteRodoviario implements Frete {

    public String getModalidade() {
        return "Rodoviario";
    }

    public double calcularValor(double valorCarga) {
        return valorCarga * 0.02;
    }

    public List<String> getDocumentos() {
        return List.of("CT-e", "MDF-e");
    }
}
