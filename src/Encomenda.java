public class Encomenda {
    private final String descricao;
    private final double peso;
    private final double frete;

    public Encomenda(String descricao, double peso, double frete) {
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("A descrição não pode ser vazia.");
        }
        if (!Double.isFinite(peso) || peso <= 0) {
            throw new IllegalArgumentException("O peso deve ser positivo e finito.");
        }
        if (!Double.isFinite(frete) || frete < 0) {
            throw new IllegalArgumentException("O frete deve ser não negativo e finito.");
        }
        this.descricao = descricao;
        this.peso = peso;
        this.frete = frete;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPeso() {
        return peso;
    }

    public double getFrete() {
        return frete;
    }

    @Override
    public String toString() {
        return String.format("%s | %.1fkg | frete %.1f", descricao, peso, frete);
    }
}
