import java.util.Scanner;

public class Main {

    public static int[] parseStringToInt(String... values) {
        int[] v = new int[values.length];
        for (int a = 0; a < values.length; a++) {
            v[a] = Integer.parseInt(values[a]);
        }
        return v;
    }

    public static String showArray(int... values) {
        StringBuilder arrayFinal = new StringBuilder(values.length);
        for (int value : values) {
            arrayFinal.append(value);
            arrayFinal.append(" ");
        }
        return arrayFinal.toString();
    }


    static int[] selectionSort(int[] values) {
        int n = values.length;

        for (int i = 0; i < n - 1; i++) {
            int menorValor = i;

            for (int j = i + 1; j < n; j++) {
                if (values[j] < values[menorValor]) {
                    menorValor = j;
                }
            }

            int temp = values[i];
            values[i] = values[menorValor];
            values[menorValor] = temp;
        }
        return values;
    }

    public static int[] bubbleSort(int[] values) {
        int n = values.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (values[j] > values[j + 1]) {

                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        return values;
    }

    public static int[] insertionSort(int[] values) {
        int n = values.length;
        for (int i = 1; i < n; ++i) {
            int chave = values[i];
            int j = i - 1;

            while (j >= 0 && values[j] > chave) {
                values[j + 1] = values[j];
                j = j - 1;
            }
            values[j + 1] = chave;
        }
        return values;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com valores aleatorios para realizar a ordenacao: ");
        String entrada = sc.nextLine();
        String[] valores = entrada.split(" ");
        System.out.println(showArray(selectionSort(parseStringToInt(valores))));
        sc.close();
    }
}