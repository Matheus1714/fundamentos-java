package pessoa;

public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, Integer idade, String cpf, String matricula){
        super(nome, idade, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void imprimirDadosDaPessoa() {
        super.imprimirDadosDaPessoa();
        System.out.println("Salário: " + this.matricula);
    }
}
