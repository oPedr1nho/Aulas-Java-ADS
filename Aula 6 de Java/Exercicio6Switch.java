package ads;

import java.util.Scanner;

public class Exercicio6Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Em qual período você estuda?");
        System.out.println("M para Matutino");
        System.out.println("V para Vespertino");
        System.out.println("N para Noite");

        char letra = sc.next().charAt(0);

        switch (letra) {
            case 'M':
                System.out.println("BOM DIA!");
                break;
            case 'V':
                System.out.println("BOA TARDE!");
                break;
            case 'N':
                System.out.println("BOA NOITE!'");
                break;
            default:
                System.out.println("Não existe esta opção!");
                break;
        }
    }
}
