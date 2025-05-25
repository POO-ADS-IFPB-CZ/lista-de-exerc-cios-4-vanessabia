package Questao4;

import java.util.Scanner;
/**
 *
 * @author vanessa
 */
public class Main{
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
            new CartaoCredito(),
            new Boleto(),
            new Pix()
        };
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("------------SISTEMA DE PAGAMENTO------------");
        System.out.print("Valor: ");
        double valor = scan.nextDouble();
        
        for (Pagamento p : pagamentos) {
            p.processar(valor);
        }
   }
}