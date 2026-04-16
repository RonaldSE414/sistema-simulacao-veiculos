public class Garagem {
    private Veiculo[] veiculos;
    private int count;

    public Garagem(int tamanho) {
        veiculos = new Veiculo[tamanho];
        count = 0;
    }

    public void estacionar(Carro c) {
        if (count >= veiculos.length) {
            System.out.println("Garagem cheia!");
            return;
        }
        veiculos[count++] = c;
    }

    public void estacionar(Moto m) {
        if (count >= veiculos.length) {
            System.out.println("Garagem cheia!");
            return;
        }
        veiculos[count++] = m;
    }
}