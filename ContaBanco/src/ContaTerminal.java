import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o núnero da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite seu nome: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, agora digite seu saldo: ");
        float saldo = scanner.nextFloat();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", a conta é " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque!");
        
    }
}
