package br.com.aquecimentoBanco;
import java.util.Scanner;
public class TestandoBanco2 {
    
    public static void main(String[] args) {
        
        /*
        Scanner entrada = new Scanner(System.in);
        
        ContaCorrente corrente = new ContaCorrente();
        
        corrente.ContaCorrente();
        
        System.out.println("Digite o valor a sacar: ");
        corrente.Sacar(entrada.nextFloat());
        
        corrente.PrintStatus();
        */

        System.out.println("Bem vindo ao Banco SI.\n\nQual operação deseja efetuar?\n");
        System.out.println("1 - Cadastrar Nova Conta\n2 - Consultar Conta\n3 - "
                + "Depositar na Conta\n4 - Sacada da Conta\n5 - Listar Contas "
                + "e Saldos\n");
        System.out.print("Digite um número conforme o menu: ");
        
        
        Scanner entrada = new Scanner(System.in);
        int entradaMenu = entrada.nextInt();
        System.out.println("------------------------------------\n");
        

        Conta[] bancoContas = new Conta[100];
        int cont = 0; /*Contador - Próxima posição disponível no banco*/  

        
        if (entradaMenu == 1){
            System.out.println("Que tipo de conta deseja criar?\n");
            System.out.println("1 - Conta Corrente\n2 - Conta Especial\n3 - Conta Poupança\n");
            System.out.print("Digite um número conforme o menu: ");
            
            int entradaCriar = entrada.nextInt();
            System.out.println("------------------------------------\n");
            
            if (entradaCriar == 2){
                bancoContas[cont] = new ContaEspecial();
                cont++;
                System.out.println(bancoContas[0].toString());
                System.out.println(bancoContas[1]);
            }
            else {
                System.out.println("...");
            }
        }
        else {
        System.out.println("Número inválido, tente novamente.");
        }
        
        
           

    }
    
}
