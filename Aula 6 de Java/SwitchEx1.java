package ads;

import java.util.Scanner;

public class SwitchEx1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nivel;
        float salario, ht;

        System.out.println("Qual o seu nível?(1,2,3)");
        nivel = sc.nextInt();
        System.out.println("Quantas horas trabalhou?");
        ht = sc.nextFloat();
        switch (nivel){
            case 1:
                salario = 12.0f*ht;
                System.out.println("Salário é R$"+salario);
            break;
            case 2:
                salario = 17.0f*ht;
                System.out.println("Salário é R$"+salario);
            break;
            case 3:
                salario = 25.0f*ht;
                System.out.println("Salario é R$"+salario);
            break;
            default:
               System.out.println("Nível inexistente!");
              
        }
    }
}
