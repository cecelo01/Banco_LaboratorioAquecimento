package br.com.aquecimentoBanco;

public class Conta {
    
    private int conta;
    private int numeroConta;
    protected float saldo;

    public void Conta(float saldo) {
        this.saldo = 0;
    }
    
    public void Depositar(float saldo){
        this.saldo += saldo;
    }
    
    public boolean Sacar(float valor){
        return false;
    }
    
    public void PrintStatus(){

    }
    
    
    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
    
}
