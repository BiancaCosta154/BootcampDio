package ContaBanco;
import java.util.Scanner;


public class  ContaTerminal {

    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
Usuarios usuarios = new Usuarios();

// Inputs e prints:

        System.out.println("Olá, Digite o seu nome:");
        usuarios.setName(scanner.nextLine());
       
    
        System.out.println("Digite a sua agência:");
        usuarios.setAgencia(scanner.nextLine());

        System.out.println("Digite o número da sua conta:");
        usuarios.setConta(scanner.nextInt());

        System.out.println("Digite o seu saldo:");
        usuarios.setSaldo(scanner.nextFloat());

        System.out.println("Seja bem-vindo(a), " + usuarios.getName() +"!"+ 
        ",obrigado por criar uma conta em nosso banco, sua agência é " + usuarios.getAgencia() +
        ", conta " + usuarios.getConta() + " e seu saldo " + usuarios.getSaldo() + " já está disponível para saque. ");
        
     
        scanner.close();

    }
    
}

  