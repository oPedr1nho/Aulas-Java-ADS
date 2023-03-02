package ads;

import java.util.Scanner;

public class Exercicio4Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu salário");
        double salario = sc.nextDouble();
        System.out.println("Qual seu plano de trabalho?");
        System.out.println("A = 10% de Aumento");
        System.out.println("B = 15% de Aumento");
        System.out.println("C = 20% de Aumento");

        char letra = sc.next().charAt(0);

        switch (letra) {
            case 'A':
                double a = (salario * 0.10) + salario;
                System.out.printf("O salário será de: %.2f\n", a);
                break;
            case 'B':
                double b = (salario * 0.15) + salario;
                System.out.printf("O salário será de: &.2f\n", b);
                break;
            case 'C':
                double c = (salario * 0.20) + salario;
                System.out.printf("O salário será de: %.2f\n", c);
                break;
            default:
                System.out.println("Não existe essa opção!");
                break;
        }
    }
}
