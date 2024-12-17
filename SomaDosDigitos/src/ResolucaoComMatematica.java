import java.util.Scanner;

public class ResolucaoComMatematica {

    public static int somarDigitosPositivos(int value) {
        StringBuilder result = new StringBuilder();
        int sum = 0;

        if(value < 0) {
           throw new RuntimeException("O número deve ser positivo");
        }

        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para a soma de seus valores: ");
        System.out.println(somarDigitosPositivos(sc.nextInt()));
        sc.close();
    }

}