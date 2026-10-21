import java.util.ArrayList;
import java.util.List;

public class Caminhao {
    private final String placa;
    private final double capacidade;
    private final List<Encomenda> encomendas;

    public Caminhao(String placa, double capacidade) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("A placa não pode ser vazia.");
        }
        if (!Double.isFinite(capacidade) || capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser positiva e finita.");
        }
        this.placa = placa;
        this.capacidade = capacidade;
        this.encomendas = new ArrayList<>();
    }

    private double getPesoCarregado() {
        double pesoTotal = 0;
        for (Encomenda encomenda : encomendas) {
            pesoTotal += encomenda.getPeso();
        }
        return pesoTotal;
    }

    public void carregar(Encomenda carga) {
        if (carga == null) {
            throw new IllegalArgumentException("A encomenda não pode ser nula.");
        }
        if (encomendas.contains(carga)) {
            System.out.printf("Encomenda %s já está no caminhão %s%n", carga.getDescricao(), placa);
            return;
        }
        if (getPesoCarregado() + carga.getPeso() <= capacidade) {
            encomendas.add(carga);
            System.out.printf("Encomenda %s carregada no caminhão %s%n", carga.getDescricao(), placa);
        } else {
            System.out.printf("Capacidade excedida: %s não cabe no caminhão %s%n", carga.getDescricao(), placa);
        }
    }

    public void descarregar(String descricao) {
        for (int i = 0; i < encomendas.size(); i++) {
            Encomenda encomenda = encomendas.get(i);
            if (encomenda.getDescricao().equals(descricao)) {
                encomendas.remove(i);
                System.out.printf("Encomenda %s descarregada do caminhão %s%n", descricao, placa);
                return;
            }
        }
        System.out.printf("%s não está no caminhão %s%n", descricao, placa);
    }

    public double calcularFreteTotal() {
        double somaFrete = 0;
        for (Encomenda encomenda : encomendas) {
            somaFrete += encomenda.getFrete();
        }
        return somaFrete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Caminhão %s (capacidade: %.1fkg)%n", placa, capacidade));
        for (Encomenda encomenda : encomendas) {
            sb.append("- ").append(encomenda.getDescricao()).append(System.lineSeparator());
        }
        sb.append(String.format("Peso carregado: %.1fkg", getPesoCarregado()));
        return sb.toString();
    }
}
