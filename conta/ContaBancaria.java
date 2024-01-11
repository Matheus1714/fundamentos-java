package conta;

public class ContaBancaria {
    
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if(valor > 0) {
            this.saldo = this.saldo + valor;
            System.out.println("Depósito de " + valor + ". Salto atual R$ " + this.saldo);
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }
    public void sacar(double valor) {
        if(valor > 0 && valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque de " + valor + ". Salto atual R$ " + this.saldo);
        } else {
            System.out.println("Valor inválido ou saldo insuficiente");
        }
    }
}
