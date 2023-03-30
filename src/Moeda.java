public class Moeda {
// moeda base: reais
    private String nome;
    private double taxaDeConversao;

    public Moeda(double taxaDeConversao, String nome) {
        if (nome == null) {
            throw new NullPointerException("Nome da moeda não pode ser nulo");
        }
        this.taxaDeConversao = taxaDeConversao;
        this.nome = nome;
    }

    public double getTaxaDeConversao() {
        return this.taxaDeConversao;
    }

    public static double conversao(double valor, Moeda moeda, boolean conversaoInversa) {
        if (conversaoInversa) {
            return valor / moeda.taxaDeConversao;
        }
        return valor * moeda.taxaDeConversao;
    }

    static Moeda dolar = new Moeda(5.16, "dolar");
    static Moeda euro = new Moeda(5.60, "euro");
    static Moeda librasEsterlinas = new Moeda(6.37, "librasEsterlinas");
    static Moeda pesoArgentino = new Moeda(0.025, "pesoArgentino");
    static Moeda pesoChileno = new Moeda(0.0065, "pesoChileno");

}
