import java.util.Locale;
import java.util.Scanner;

/**
 * Programa que simula a criação de uma conta bançária.
 * 
 * @author Eduardo Magela Rodrigues
 * @version 1.0
 * @since 2024-08-01
 */
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int conta;
        String agencia;
        String nome;
        float saldo;

        System.out.println("Criador de Conta Bancária");

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Número da Conta: ");
        conta = entrada.nextInt();

        System.out.println("Número da Agência: ");
        agencia = entrada.next();

        System.out.println("Nome do Titular: ");
        nome = entrada.next();

        System.out.println("Saldo Inicial: ");
        saldo = entrada.nextFloat();

        entrada.close();

        System.out.println("Olá " + nome + "!"); 
        System.out.println("Obrigado por criar uma conta em nosso banco.");
        System.out.println("A sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
