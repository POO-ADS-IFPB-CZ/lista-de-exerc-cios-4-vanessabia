package Questao5;

/**
 *
 * @author vanessa
 */
public class Main {
    public static void main(String[] args) {
        Personagem[] personagens = {
            new Guerreiro(),
            new Mago(),
            new Arqueiro()
        };

        System.out.println("Turno de combate:");
        for (Personagem p : personagens) {
            p.atacar();
        }
    }
}