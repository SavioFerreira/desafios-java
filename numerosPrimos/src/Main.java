import java.util.Scanner;

public class Main {

    /// TODO Um número primo é aquele maior que 1 e divisível apenas por 1 e por ele mesmo.

    public static boolean numeroEhPrimo(int value) {
        if(value <= 1) {
            return false;
        } else if(value == 2) {
            return true;
        }else return value % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para verificar se é primo: ");
        System.out.println(numeroEhPrimo(sc.nextInt()));
        sc.close();
    }
}