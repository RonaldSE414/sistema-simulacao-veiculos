public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, String placa) {
        super(marca, modelo, placa);
        this.portas = 4;
    }

    public Carro(String marca, String modelo, String placa, int velocidade) {
        super(marca, modelo, placa);
        setVelocidade(velocidade);
        this.portas = 4;
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 10);
    }

    @Override
    public void exibirStatus() {
        System.out.println("Carro: " + getMarca() + " " + getModelo() +
                " - Portas: " + portas);
    }

    @Override
    public double calcularConsumo() {
        return 12.0;
    }

    public void ligar(String modo) {
        System.out.println("Carro ligado no modo " + modo);
    }

    @Override
    public String toString() {
        return "Carro: " + getMarca() + " " + getModelo() +
                " - Velocidade: " + getVelocidade() + " km/h";
    }
}