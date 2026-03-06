
import entidades.Desenvolvedor;
import entidades.Funcionario;
import entidades.SeniorGlobalMenagerOffHighWealthAndPortifolio;

public class App {

    public static void main(String[] args) throws Exception {

        Desenvolvedor d1 = new Desenvolvedor("123", "João", 5000.0);
        System.out.println(d1);
        System.out.println("Bonus: " + d1.calcularbonus());

        SeniorGlobalMenagerOffHighWealthAndPortifolio s1 = new SeniorGlobalMenagerOffHighWealthAndPortifolio(
                "456",
                "Fred Alburquerque",
                5000000.0
        );
        System.out.println(s1);
        System.out.println("Bonus: " + s1.calcularbonus());

        moggar(s1, d1);
    }

    static void moggar(Funcionario f1, Funcionario f2) {
        if (f1.getSalario() > f2.getSalario()){
            System.out.printf("%s moggou o betinha %s\n",f1.getNome(),f2.getNome());
        }else{
            System.out.printf("%s moggou o betinha %s\n",f2.getNome(),f1.getNome());
        }
        if (f2 instanceof Desenvolvedor){
            Desenvolvedor d2 = (Desenvolvedor) f2;
            d2.criarCodigo();
        }
    }
}
