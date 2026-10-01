public class Main {
    public static void main(String[] args) {
        Assinatura brasil = new Assinatura("Ana Pereira", 300.0, new FabricaBrasil());
        Assinatura mexico = new Assinatura("Carlos Ramirez", 300.0, new FabricaMexico());

        brasil.ativar();
        mexico.ativar();
    }
}
