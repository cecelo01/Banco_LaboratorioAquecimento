package testandobanco2;
import java.util.Scanner;
import java.util.Random;

public class ContaCorrente extends Conta{
    
    
    
    Scanner entrada = new Scanner(System.in);
    
    // instanciando conta
    Conta  contaCorrent = new Conta();

    public void ContaCorrente(){
        // Gera numeros aleatorios
        Random numero = new Random();
        
        // criando conta do tipo 1
        contaCorrent.setNumeroAgencia(1);
        
        // gerando numero aleatorio
        contaCorrent.setNumeroConta(1 + numero.nextInt(9999));
        
        System.out.println("Conta Corrente criada com sucesso!");
        System.out.println("Informe o valor do deposito: ");
        contaCorrent.depositar(entrada.nextFloat());
        
    }
    
    @Override
    public boolean sacar(float valor){
      
        if (valor <= contaCorrent.getSaldo())  {  
            contaCorrent.setSaldo(contaCorrent.getSaldo() - valor);
            return true;
        }
        else {
            return false;
        }
    
    }
    
    public String toString(){
        return "\nConta Conrrente\nAgência: "+contaCorrent.getNumeroAgencia()+"\nConta: "+contaCorrent.getNumeroConta()+"\nSaldo: "+contaCorrent.getSaldo();
    }
    
    @Override
    public void printStatus(){
        System.out.println("---------- EXTRATO ----------");
        System.out.println("Número da conta: " +contaCorrent.getNumeroConta());
        System.out.println("Saldo: " + contaCorrent.getSaldo());
    }
    

    
}
