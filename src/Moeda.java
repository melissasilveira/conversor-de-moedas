//- Converter de Reais a Dólar 5.16
// - Converter de Reais a Euro 5.60
// - Converter de Reais a Libras Esterlinas 6.37
// - Converter de Reais a Peso argentino 0.025
// - Converter de Reais a Peso Chileno 0.0065
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

    public String getNome() {
        return this.nome;
    }

    public double getTaxaDeConversao() {
        return this.taxaDeConversao;
    }

    public double conversao (double valor, Moeda moeda, boolean conversaoInversa) {
        if (conversaoInversa) {
            return valor / moeda.taxaDeConversao;
        }
        return valor * moeda.taxaDeConversao;
    }

}
