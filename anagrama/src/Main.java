import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static boolean ehAnagrama(String palavra1, String palavra2) {

        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        ArrayList<String> palavraUmListada = new ArrayList<>(palavra1.length());
        ArrayList<String> palavraDoisListada = new ArrayList<>(palavra1.length());

        for (int i = 0; i < palavra1.length(); i++) {
            palavraUmListada.add(String.valueOf(palavra1.charAt(i)));
            palavraDoisListada.add(String.valueOf(palavra2.charAt(i)));
        }

        palavraUmListada.sort(Comparator.naturalOrder());
        palavraDoisListada.sort(Comparator.naturalOrder());

        return palavraUmListada.equals(palavraDoisListada);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite duas palavras para verificar se são anagramas: ");
        String palavra1 = sc.next();
        String palavra2 = sc.next();

        if (ehAnagrama(palavra1, palavra2)) {
            System.out.printf("As palavras %s e %s são anagramas", palavra1, palavra2);
        } else {
            System.out.printf("As palavras %s e %s não são anagramas", palavra1, palavra2);
        }
        sc.close();
    }
}