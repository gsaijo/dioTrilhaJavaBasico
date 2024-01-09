import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TO DO:
        // conhecer e importar a classe Scanner
        // exibir as mensagens para o nosso usuário
        // obter pela classe Scanner os valores digitados no terminal
        // exibir a mensagem final

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.print("Por favor, digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Por favor, digite o numero da conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Por favor, digite o numero de agencia: ");
            String agencia = scanner.nextLine();

            System.out.print("Por favor, digite o saldo: ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está dsponível para saque!");
        }
    }
}
