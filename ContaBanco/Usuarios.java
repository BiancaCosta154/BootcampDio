package ContaBanco;

public class Usuarios {
    //Encapsulamento
protected String name;
protected String agencia;
protected int conta;
protected float saldo;


// Get e Set
// para o name:
public void setName(String name){this.name = name;}
public String getName(){return name;}

// para a agencia:
public void setAgencia(String agencia){this.agencia = agencia;}
public String getAgencia(){return agencia;}

// para a conta:
public void setConta(int conta){this.conta =conta;}
public int getConta(){return conta;}

// para o saldo:
public void setSaldo(float saldo){this.saldo=saldo;}
public float getSaldo(){return saldo;}

 // Método para mostrar os valores:
public String print(){
    return "Seja bem-vindo(a)," + name + "! Obrigado por criar uma conta em nosso banco, sua agência é " +
    agencia + ", conta " + conta + " e seu saldo " + "já está disponível para saque!";

}
