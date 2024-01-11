package pessoa;

public class Professor extends Pessoa{
    private double salario;

    public Professor(String nome, Integer idade, String cpf, double salario){
        super(nome, idade, cpf);
        this.salario = salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void imprimirDadosDaPessoa() {
        super.imprimirDadosDaPessoa();
        System.out.println("Salário: " + this.salario);
    }
}
