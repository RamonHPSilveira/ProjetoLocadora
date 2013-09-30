
package projetolocadora;


public class Cliente extends Pessoa{
   private double saldoDisponivel;

    @Override
    public String toString() {
        return "Cliente{" + "saldoDisponivel=" + saldoDisponivel + '}';
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public Cliente() {
    }
   
    
}
