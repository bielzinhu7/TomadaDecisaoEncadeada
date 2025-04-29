import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, aux;


        System.out.print("Informe o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Informe o segundo número: ");
        num2 = sc.nextInt();

        System.out.print("Informe o terceiro número: ");
        num3 = sc.nextInt();


        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        if (num1 > num3) {
            aux = num1;
            num1 = num3;
            num3 = aux;
        }

        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }


        System.out.println("Os números em ordem crescente são: " + num1 + ", " + num2 + ", " + num3);
    }
}
