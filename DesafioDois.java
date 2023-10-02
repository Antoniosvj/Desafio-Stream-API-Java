import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;


public class DesafioDois {
    /*Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console. */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    
        Consumer<Integer> numerosPares = numero -> {
            if (numero %2 ==0){
                System.out.println(numero); 
            }
        };
                 
        int resultado = numeros.stream()
            .filter(n -> n% 2 ==0)
            .reduce(0,Integer::sum);

        System.out.println(resultado);
    }
    private static int extracted(Integer n1, Integer n2){
        return n1+n2;
    }
}
