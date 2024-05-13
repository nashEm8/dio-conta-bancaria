import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        int numAgencia = scanner.nextInt();

        System.out.println("Por favor, digite a agência: ");
        String codeAgencia = scanner.next();

        System.out.println("Por favor, digite seu nome completo: ");
        String nomeClienteBanco = scanner.next();

        System.out.println("Por favor, digite seu saldo: ");
        double saldoCliente = scanner.nextDouble();

    }
}
