public class Caminhao extends Veiculo {

    public Caminhao(String marca, String modelo, String placa) {
        super(marca, modelo, placa);
    }

    @Override
    public double calcularConsumo() {
        return 5.0;
    }

    public void interagir(Caminhao c) {
        System.out.println("Interação entre caminhões");
    }
}