package entidades;

public abstract  class Funcionario {

    private String nome;
    private String matricula;
    private Double salario;

    public Funcionario(String matricula, String nome, Double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularbonus();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Funcionario [matricula=" + matricula + ", nome=" + nome + ", salario=" + salario + "]";
    }
}
