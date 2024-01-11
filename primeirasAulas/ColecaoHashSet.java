package primeirasAulas;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Iterator;

public class ColecaoHashSet {
    public static void main(String[] args) {
        long seed = 100;
        Random randomNumber = new Random(seed);
        Set<Integer> numeros = new HashSet<>();
        
        while(numeros.size() < 10) {
            Integer numeroAleatorio = randomNumber.nextInt(100);
            numeros.add(numeroAleatorio);
        }

        Iterator<Integer> iterator = numeros.iterator();
        while(iterator.hasNext()) {
            int numero = iterator.next();
            if(numero % 2 == 0){
                iterator.remove();
            }
        }

        System.out.println("HashSet após a remoção dos pares: " + numeros);
    }
}
