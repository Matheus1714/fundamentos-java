package pessoa;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String cpf;

    public Pessoa(String nome, Integer idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void imprimirDadosDaPessoa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
    }
}
