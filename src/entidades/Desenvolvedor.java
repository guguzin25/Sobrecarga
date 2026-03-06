package entidades;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String matricula, String nome, Double salario) {
        super(matricula, nome, salario);
    }

        public void criarCodigo(){
            System.out.println("escrevendo codigo...");
        }

    @Override
    public double calcularbonus() {
        return getSalario() * 0.1;
    }
    

    
}
