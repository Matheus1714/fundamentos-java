package primeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class ColecaoHashMap {
    
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();

        notas.put("Matheus", 10);
        notas.put("Carlos", 9);
        notas.put("Lucas", 7);
        notas.put("João", 8);
        notas.put("Vinicius", 1);
        notas.put("Debora", 5);
        notas.put("Luiz", null);

        for(Map.Entry<String, Integer> entry: notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);
        }
    }
}
