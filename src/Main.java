public class Main {
    public static void main(String[] args) {
        Encomenda notebook = new Encomenda("Notebook Dell", 2.5, 35.0);
        Encomenda cadeira = new Encomenda("Cadeira gamer", 18.0, 80.0);
        Encomenda geladeira = new Encomenda("Geladeira", 60.0, 150.0);
        Encomenda microondas = new Encomenda("Micro-ondas", 12.0, 60.0);

        Caminhao caminhao = new Caminhao("OKT-4821", 80.0);

        caminhao.carregar(notebook);
        caminhao.carregar(cadeira);
        caminhao.carregar(geladeira);
        caminhao.carregar(microondas);

        System.out.println(caminhao);
        System.out.printf("Frete total: %.1f%n", caminhao.calcularFreteTotal());

        caminhao.descarregar("Cadeira gamer");
        caminhao.descarregar("Fogão");
        System.out.println(cadeira);

        caminhao.carregar(geladeira);
        System.out.println(caminhao);
        System.out.printf("Frete total: %.1f%n", caminhao.calcularFreteTotal());
    }
}
