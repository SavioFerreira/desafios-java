import java.util.Scanner;

public class ResolucaoComStrings {

    public static String somarDigitosPositivos(String value) {

        StringBuilder result = new StringBuilder();
        int sum = 0;

        if((Integer.parseInt(value)) < 0) {
           throw new RuntimeException("O número deve ser positivo");
        } else if (value.length() == 1) {
            return String.format("%s + 0 = %s", value, value);
        } else {
            for (int i = 0; i < value.length(); i++) {
                result.append(value.charAt(i)).append(" + ");
                sum += Character.getNumericValue(value.charAt(i));
            }
        }

        result.delete(result.length() -3, result.length());
        return result.append(" = ").append(sum).toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para a soma de seus valores: ");
        System.out.println(somarDigitosPositivos(sc.nextLine()));
        sc.close();
    }

}