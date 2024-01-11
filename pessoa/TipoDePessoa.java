package pessoa;

public class TipoDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Luiz", 25, "123.123.123-12");
        Aluno aluno = new Aluno("Fernado", 26, "234.234.234-23", "123123");
        Professor professor = new Professor("Jeferson", 30, "456.456.456-45", 1200.00);

        verificarTipoDePessoa(pessoa);
        verificarTipoDePessoa(aluno);
        verificarTipoDePessoa(professor);
    }

    private static void verificarTipoDePessoa(Pessoa pessoa) {
        if(pessoa instanceof Aluno) {
            Aluno aluno = (Aluno) pessoa;
            aluno.imprimirDadosDaPessoa();
        } else if(pessoa instanceof Professor){
            Professor professor = (Professor) pessoa;
            professor.imprimirDadosDaPessoa();
        } else{
            pessoa.imprimirDadosDaPessoa();
        }
    }
}
