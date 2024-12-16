import java.util.Scanner;

public class Main {

    public static void fizzBuzz(int value) {

        final boolean fizz = value % 3 == 0;
        final boolean buzz = value % 5 == 0;

        if (fizz && buzz) {
            System.out.println("\"FizzBuzz\"");
        } else if(fizz) {
            System.out.println("\"Fizz\"");
        } else if(buzz) {
            System.out.println("\"Buzz\"");
        } else {
            System.out.printf("\"%d\"", value);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um número ");
        int value = sc.nextInt();

        fizzBuzz(value);
        sc.close();
    }
}