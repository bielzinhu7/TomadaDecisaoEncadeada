import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#");

        double num1, num2, num3;

        System.out.print("Informe o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.print("Informe o segundo número: ");
        num2 = sc.nextDouble();

        System.out.print("Informe o terceiro número: ");
        num3 = sc.nextDouble();

        if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("Foram informados números iguais ");
        } else {

            if (num1 < num2 && num1 < num3) {
                System.out.println("O menor número é o: " + decimal.format(num1));
            } else if (num2 < num1 && num2 < num3) {
                System.out.println("O menor número é o: " + decimal.format(num2));
            } else
                System.out.println("O menor número é o: " + decimal.format(num3));
            }
        }
    }

