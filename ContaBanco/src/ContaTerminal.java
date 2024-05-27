import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal  {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o número da sua conta");
            int numero= scanner.nextInt();
            System.out.println("Digite o número da sua agência");
            String agencia= scanner.next();
            System.out.println("Digite seu nome");
            String nome =scanner.next();
            System.out.println("Quanto deseja depositar?");
            double saldo= scanner.nextDouble();
            System.out.println("Olá "+nome +", obrigado por criar uma conta em nosso banco , sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " +saldo + ", já está disponível para saque." );
        }
    }
}
