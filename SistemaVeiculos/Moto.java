public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, String placa) {
        super(marca, modelo, placa);
        this.cilindradas = 150;
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 15);
    }

    @Override
    public void exibirStatus() {
        System.out.println("Moto: " + getMarca() + " " + getModelo() +
                " - Cilindradas: " + cilindradas);
    }

    @Override
    public double calcularConsumo() {
        return 30.0;
    }

    public void ligar(String modo) {
        System.out.println("Moto ligada no modo " + modo);
    }
}