package dev.dornelaschris.contas;

public class ContaInvestimento extends Conta {
    private double taxa;
    private int prazo;

    public ContaInvestimento(){
        super();
    }

    public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {
        super(numero, saldo);
        this.taxa = taxa;
        this.prazo = prazo;
    }

    public boolean sacar(double valor) {
        if(getSaldo() >= valor) {
            double novoSaldo = getSaldo() - (valor * this.taxa);
            setSaldo(novoSaldo);
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if(valor >= 0) {
            double novoSaldo =getSaldo() + (valor * taxa);
            setSaldo(novoSaldo);
            return true;
        } else {
            return false;
        }
    }

    public void aplicarrendimento(double taxa){
        double novoSaldo = getSaldo() + (1 * taxa);
        setSaldo(novoSaldo);
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
}
