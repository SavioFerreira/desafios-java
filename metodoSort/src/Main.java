import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int menorValor(int ...values) {
        int contador= values[0];
        for (int j : values) {
            if (j < contador) {
                contador = j;
            }
        }
        return contador;
    }

    static int []excluiMenorValor(int ...values) {
        int []novosValores = new int[values.length -1];

        int menor = menorValor(values);

        for (int i = 0; i < novosValores.length; i++) {
            if(values[i] != menor) {
                novosValores[i] = values[i];
            }
        }
        return novosValores;
    }

    public static int[] parseStringToInt(String... values) {
        int []v = new int[values.length];
        for (int a = 0; a < values.length; a++) {
            v[a] = Integer.parseInt(values[a]);
        }
        return v;
    }

    public static int[] orderValores(int ...values) {
        int menor = menorValor(values);

        for (int i = 0; i < values.length; i++) {
            values[i] = menor;
        }
        return values;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com valores aleatorios para realizar a ordenacao: ");
        String entrada = sc.nextLine();
        String[] valores = entrada.split(" ");
        System.out.println(Arrays.toString(orderValores(parseStringToInt(valores))));
        sc.close();
    }
}