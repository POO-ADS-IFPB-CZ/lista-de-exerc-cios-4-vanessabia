package Questao4;

/**
 *
 * @author vanessa
 */
class Pix extends Pagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Pix - Total sem taxas: R$ " + valor);
    }
}