package conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("1234", "Luiz", 100);

        contaBancaria.depositar(50);
        contaBancaria.sacar(20);
    }
}
