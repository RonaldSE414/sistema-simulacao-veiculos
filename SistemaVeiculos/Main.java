public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro("Toyota", "Corolla", "ABC123");
        Moto m1 = new Moto("Honda", "CG", "XYZ999");
        Caminhao cam1 = new Caminhao("Volvo", "FH", "TRK777");

        SimuladorDeTrafego sim = new SimuladorDeTrafego(5);

        sim.adicionarVeiculo(c1);
        sim.adicionarVeiculo(m1);
        sim.adicionarVeiculo(cam1);

        c1.abastecer(10);
        m1.abastecer(5);

        sim.simular();
    }
}