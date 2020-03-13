package br.com.aquecimentoBanco;

import java.util.Scanner;

public class TestandoBanco {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        ContaCorrente corrente = new ContaCorrente();
        
        corrente.ContaCorrente();
        
        System.out.println("Digite o valor a sacar: ");
        corrente.Sacar(entrada.nextFloat());
        
        corrente.PrintStatus();
        
        
    }
}
