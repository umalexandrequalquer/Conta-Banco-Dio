import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        ContaDebit alexconta = new ContaDebit();

        Scanner scan = new Scanner(System.in);
        System.out.println("Bem-Vindo");

        System.out.println("Digite Seu número da Conta.");
        alexconta.setNumero(scan.nextInt());
        
        System.out.println("Digite agora sua agência.");
        alexconta.setAgencia(scan.next());

        System.out.println("Digite Seu nome");
        alexconta.setNameCliente(scan.next());
        scan.close();
        alexconta.setSaldo(100.0);
        System.out.println("Toda conta começa com " + alexconta.getSaldo() + " reais de saldo, você pode adicionar mais.\n");
        

        System.out.println("Olá "+ alexconta.getNameCliente()+ ", obrigado por criar uma conta em nosso banco, sua agência é "+alexconta.getAgencia()+", conta "+
        alexconta.getNumero() + " e seu saldo de "+ alexconta.getSaldo()+ " já está disponível para saque."
        );    
    }
}


