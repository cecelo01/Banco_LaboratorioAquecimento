package br.com.aquecimentoBanco;
public class Conta {
    
    private int numeroAgencia;
    private int numeroConta;
    protected float saldo;
    

    public void Conta() {
        this.saldo = 0;
    }
    
    /*************************************************************************/
    
    public void depositar(float saldo){
        this.saldo += saldo;
    }
    
    public boolean sacar(float valor){
        if (valor > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public String toString(){
        return "\nAgência: "+numeroAgencia+"\nConta: "+numeroConta+"\nSaldo: "+saldo;
    }
    
    public void printStatus(){
    }
    
    /*************************************************************************/
    
    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    /*************************************************************************/  
}
