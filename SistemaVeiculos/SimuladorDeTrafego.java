public class SimuladorDeTrafego {
    private Veiculo[] pista;
    private int count;

    public SimuladorDeTrafego(int tamanho) {
        pista = new Veiculo[tamanho];
        count = 0;
    }

    public void adicionarVeiculo(Veiculo v) {
        if (count >= pista.length) {
            System.out.println("Pista cheia!");
            return;
        }
        pista[count++] = v;
    }

    public void simular() {
        for (int i = 0; i < count; i++) {
            pista[i].acelerar();
            pista[i].exibirStatus();
        }
    }
}