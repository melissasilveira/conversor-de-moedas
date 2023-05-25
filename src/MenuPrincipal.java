import javax.swing.*;

public class MenuPrincipal {

//        caixa de diálogo inicial para seleção do tipo de conversor
        public static void tipoConversor() {
            String[] opcoesConversao = {"Conversor de Moeda"};

            String entrada = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Opções",
                    JOptionPane.QUESTION_MESSAGE, null, opcoesConversao, opcoesConversao[0]);
                System.out.println("Escolha: " + entrada);
        }
//        caixa de diálogo para entrada do valor a ser convertido
        public static double valorASerConvertido() {
            String valorInput;
            double valorAConverter;

            valorInput = JOptionPane.showInputDialog("Digite o valor a ser convertido");
            try {
                valorAConverter = Double.parseDouble(valorInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Digite somente números");
                throw new NumberFormatException();
            }
            System.out.println(valorAConverter);
            return valorAConverter;
        }

//        caixa de diálogo com opções de moedas
        public static double opcoesDeMoedas(double valorAConverter) {
            String[] opcoesMoedas = {"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras Esterlinas", "De Reais a Pesos Argentinos", "De Reais a Pesos Chilenos",
                    "De Dólares a Reais", "De Euros a Reais", "De Libras Esterlinas a Reais", "De Pesos Argentinos a Reais", "De Pesos Chilenos a Reais"};
            boolean conversaoInversa = false;
            double valor = 0;
            String moedas = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Opções",
                    JOptionPane.QUESTION_MESSAGE, null, opcoesMoedas, opcoesMoedas[0]);
            System.out.println("Escolha: " + moedas);
            switch (moedas) {
                case ("De Reais a Dólares"):
                   valor = Moeda.conversao(valorAConverter, Moeda.dolar, conversaoInversa);
                   break;
                case ("De Reais a Euros"):
                    valor = Moeda.conversao(valorAConverter, Moeda.euro, conversaoInversa);
                    break;
                case ("De Reais a Libras Esterlinas"):
                    valor = Moeda.conversao(valorAConverter, Moeda.librasEsterlinas, conversaoInversa);
                    break;
                case ("De Reais a Pesos Argentinos"):
                    valor = Moeda.conversao(valorAConverter, Moeda.pesoArgentino, conversaoInversa);
                    break;
                case ("De Reais a Pesos Chilenos"):
                    valor = Moeda.conversao(valorAConverter, Moeda.pesoChileno, conversaoInversa);
                    break;
                case ("De Dólares a Reais"):
                    conversaoInversa = true;
                    valor = Moeda.conversao(valorAConverter, Moeda.dolar, conversaoInversa);
                    break;
                case ("De Euros a Reais"):
                    conversaoInversa = true;
                    valor = Moeda.conversao(valorAConverter, Moeda.euro, conversaoInversa);
                    break;
                case ("De Libras Esterlinas a Reais"):
                    conversaoInversa = true;
                    valor = Moeda.conversao(valorAConverter, Moeda.librasEsterlinas, conversaoInversa);
                    break;
                case ("De Pesos Argentinos a Reais"):
                    conversaoInversa = true;
                    valor = Moeda.conversao(valorAConverter, Moeda.pesoArgentino, conversaoInversa);
                    break;
                case ("De Pesos Chilenos a Reais"):
                    conversaoInversa = true;
                    valor = Moeda.conversao(valorAConverter, Moeda.pesoChileno, conversaoInversa);
                    break;
            } return valor;
        }

//        caixa de diálogo para mostrar o valor convertido
        public static void valorConvertido(double valor) {
            String mensagem = "O valor da conversão é de " + valor;

            JOptionPane.showMessageDialog(null, mensagem);
        }

//        caixa de diálogo deseja continuar
        public static void desejaContinuar() {
            int retorno = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (retorno == 0) {
                menu();
            } else if (retorno == 1) {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
            } else {
                JOptionPane.showMessageDialog(null, "Programa concluído");
            }
        }

        public static void menu() {
            tipoConversor();
            double valorAConverter = valorASerConvertido();
            double valor = opcoesDeMoedas(valorAConverter);
            valorConvertido(valor);
            desejaContinuar();

        }

    public static void main(String[] args) {
            menu();

    }

}