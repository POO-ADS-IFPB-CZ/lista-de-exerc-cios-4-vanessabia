package Questao4;

/**
 *
 * @author vanessa
 */
class CartaoCredito extends Pagamento {
    @Override
    public void processar(double valor) {
        double taxa = valor * 0.02;
        System.out.println("Cartão de Crédito - Total com taxa: R$ " + (valor + taxa));
    }
}
