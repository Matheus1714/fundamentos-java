package primeirasAulas;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Matheus");
        nomes.add("Socorro");
        nomes.add("Lucas");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Jeferson");
        nomes.add("Robson");
        
        System.out.println(nomes.get(0));

        for(String nome:nomes) {
            System.out.println("O nome é " + nome);
        }

        nomes.forEach(nome -> System.out.println(nome));
    }
}
