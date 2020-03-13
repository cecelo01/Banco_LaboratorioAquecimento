package br.com.aquecimentoBanco;
public class ContaEspecial extends Conta{
    
    private float limiteCheque;
    private float saldoCheque;

        
    public void ContaEspecial(){
        this.limiteCheque = 100;
    }
    
    public void ContaEspecial(float limiteCheque){
        System.out.println("Inforome o limite desejado para sua conta: ");
        this.limiteCheque = limiteCheque;
        this.saldoCheque = limiteCheque;
    }
     
    /*************************************************************************/
    
    Conta  contaEspecial = new Conta();
    
    @Override
    public boolean sacar(float valor){
      
        if (valor <= contaEspecial.getSaldo()){
            contaEspecial.setSaldo(contaEspecial.getSaldo() - valor);
            return true;
        }
        else if (valor <= (contaEspecial.getSaldo()+getSaldoCheque()))  {  
            setSaldoCheque(getSaldoCheque()-(valor-contaEspecial.getSaldo()));
            contaEspecial.setSaldo(0);
            return true;
        }
        else {
            return false;
        }
    }
    
    public String toString(){
        return "\nConta Especial\nAgência: "+contaEspecial.getNumeroAgencia()+
                "\nConta: "+contaEspecial.getNumeroConta()+"\nSaldo: "
                +contaEspecial.getSaldo()+"\nLimite de Cheque Especial: "
                +getLimiteCheque()+"\nSaldo Disponível de Cheque Espcial "
                +getSaldoCheque();
    }
    
    /*************************************************************************/
    
    public float getLimiteCheque() {
        return limiteCheque;
    }

    public void setLimiteCheque(float limiteCheque) {
        this.limiteCheque = limiteCheque;
    }
    
    public float getSaldoCheque() {
        return saldoCheque;
    }

    public void setSaldoCheque(float saldoCheque) {
        this.saldoCheque = saldoCheque;
    }
    
    /*************************************************************************/
}
