package entidades;

public class SeniorGlobalMenagerOffHighWealthAndPortifolio extends Funcionario {

    public SeniorGlobalMenagerOffHighWealthAndPortifolio(String matricula, String nome, Double salario) {
        super(matricula, nome, salario);
    }

    public double calcularbonus() {
        return getSalario() * 1.5;
    }

}
