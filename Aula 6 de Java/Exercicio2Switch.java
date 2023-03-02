package ads;

import java.util.Scanner;

public class Exercicio2Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X, Y;
        System.out.println("Digite um número");
        X = sc.nextDouble();
        System.out.println("Digite outro número");
        Y = sc.nextDouble();
        System.out.println("M = Média entre os números digitados");
        System.out.println("S = Diferença do maior pro menor");
        System.out.println("P = Produto entre dois números digitados");
        System.out.println("D = Divisão do primeiro pelo Segundo");
        char letra = sc.next().charAt(0);

        switch (letra) {
            case 'M':
                double media = (X * Y) / 2;
                System.out.printf("A média é: %.2f\n", media);
                break;
            case 'S':
                if (X > Y) {
                    double dif = X - Y;
                    System.out.println("A diferença é:" + dif);
                } else {
                    double dif2 = Y - X;
                    System.out.println("A diferença é:" + dif2);
                }
                break;
            case 'P':
                double prod = X * Y;
                System.out.printf("O produto é %.2f\n", prod);
                break;
            case 'D':
                double div = X / Y;
                System.out.printf("A divisão é %.2f\n", div);
                break;
            default:
               System.out.println("NADA");
            break;
        }
    }
}
