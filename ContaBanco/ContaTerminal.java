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

        // impressão das informações:
        System.out.println(usuarios.print());
     
        scanner.close();

    }
    
}

  
