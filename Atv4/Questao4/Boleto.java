package Questao4;

/**
 *
 * @author vanessa
 */
class Boleto extends Pagamento {
    @Override
    public void processar(double valor) {
        double desconto = valor * 0.05;
        System.out.println("Boleto - Total com desconto: R$ " + (valor - desconto));
    }
}