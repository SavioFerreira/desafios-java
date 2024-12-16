import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final ArrayList<Character> vogais = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static int calculaVogais(String palavra) {

        int quantidadeVogais = 0;
        if (palavra == null || palavra.isEmpty()) {
            return 0;
        }

        palavra = palavra.toLowerCase();
        for (int i = 0; i < palavra.length(); i++) {
            if (vogais.contains(palavra.charAt(i))){
                quantidadeVogais++;
            }
        }

        return quantidadeVogais;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra para calcular a quantidade de vogais: ");
        String palavra = sc.nextLine().trim();
        System.out.println("A palavra " + palavra + " possui " + calculaVogais(palavra) + " vogais");
        sc.close();
    }
}