package br.com.aquecimentoBanco;
public class ContaPoupanca extends Conta{
    
    private int aniversario;
    private float rendUltMes;
    private float taxaUltRend;
    private float taxaAnualAcumu;
    
    
    public void ContaPoupanca(int aniversario){
        this.aniversario = aniversario;
        this.rendUltMes = 0;
        this.taxaUltRend = 0;
        this.taxaAnualAcumu = 0;
    }
    
    /*************************************************************************/
    
    Conta  contaPoupanca = new Conta();
    
    @Override
    public boolean sacar(float valor){
      
        if (valor <= contaPoupanca.getSaldo())  {  
            contaPoupanca.setSaldo(contaPoupanca.getSaldo() - valor);
            return true;
        } 
        else {
            return false;
        }
    }
    
    public void rendimento(float taxaMes, int mesAtual){
        /*????*/
    }
    
    public String toString(){
        return "\nConta Poupança\nAgência: "+contaPoupanca.getNumeroAgencia()+
                "\nConta: "+contaPoupanca.getNumeroConta()+"\nSaldo: "
                +contaPoupanca.getSaldo()
                +"\n\nRendimento do último mês: "+getRendUltMes()
                +"\nTaxa do último rendimento: "+getTaxaUltRend()
                +"\nTaxa anual acumulada: "+getTaxaAnualAcumu();
    }
    
    /*************************************************************************/

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }

    public float getRendUltMes() {
        return rendUltMes;
    }

    public void setRendUltMes(float rendUltMes) {
        this.rendUltMes = rendUltMes;
    }

    public float getTaxaUltRend() {
        return taxaUltRend;
    }

    public void setTaxaUltRend(float taxaUltRend) {
        this.taxaUltRend = taxaUltRend;
    }

    public float getTaxaAnualAcumu() {
        return taxaAnualAcumu;
    }

    public void setTaxaAnualAcumu(float taxaAnualAcumu) {
        this.taxaAnualAcumu = taxaAnualAcumu;
    }
    
    /*************************************************************************/ 
}
