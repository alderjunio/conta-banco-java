import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String NomeCliente = "Alder Junio";
        double Saldo = 237.48;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);      

        System.out.println("Por favor, digite o número da Agência!");
        String Agencia = scanner.next();

        System.out.println("Usuário");
        int Numero = scanner.nextInt();
    
        System.out.println("Ola " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");  
    }
}
