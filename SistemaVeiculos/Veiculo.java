public class Veiculo {
    private String marca;
    private String modelo;
    private int velocidade;
    private String placa;
    private double combustivel;

    public Veiculo(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidade = 0;
        this.combustivel = 0;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getVelocidade() { return velocidade; }
    public String getPlaca() { return placa; }
    public double getCombustivel() { return combustivel; }

    public void setVelocidade(int velocidade) { this.velocidade = velocidade; }
    public void setCombustivel(double combustivel) { this.combustivel = combustivel; }

    public void acelerar() {
        if (combustivel <= 0) {
            System.out.println("Sem combustível!");
            return;
        }
        velocidade += 10;
        combustivel -= 1;
    }

    public void acelerar(int incremento) {
        velocidade += incremento;
    }

    public void frear() {
        velocidade -= 10;
    }

    public void frear(int decremento) {
        velocidade -= decremento;
    }

    public void ligar() {
        System.out.println("Veículo ligado");
    }

    public void abastecer(double litros) {
        combustivel += litros;
    }

    public void abastecer(double litros, String tipo) {
        System.out.println("Abastecendo com " + tipo);
        combustivel += litros;
    }

    public void interagir(Veiculo outro) {
        System.out.println("Interagindo com outro veículo");
    }

    public double calcularConsumo() {
        return 0;
    }

    public void exibirStatus() {
        System.out.println("Veículo: " + marca + " " + modelo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Veiculo)) return false;
        Veiculo v = (Veiculo) obj;
        return placa.equals(v.placa);
    }

    @Override
    public int hashCode() {
        return placa.hashCode();
    }
}