import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cargo;
        int tempo;
        double salarioAtual, salarioNovo, diferenca;

        System.out.print("Cargo --> ");
        cargo = sc.next();
        System.out.println("Tempo de empresa(anos) --> ");
        tempo = sc.nextInt();
        System.out.println("Salário atual --> R$");
        salarioAtual = sc.nextDouble();

        if(cargo.equalsIgnoreCase("gerente")){
            if(tempo >= 5){
                salarioNovo = salarioAtual *1.10;
            }
            else if (tempo >= 3){
                salarioNovo = salarioAtual *1.09;
            }
            else{
                salarioNovo = salarioAtual *1.08;
            }
        }
    }
}
