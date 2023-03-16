package ads;

import java.util.Scanner;

public class ExDesafio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j = 0, i, vet[] = new int[10]; //declaração de vetores
        int vetB[] = new int[10];
        int vetC[] = new int[20];

        System.out.println("Digite 10 valores inteiros para A:"); //Repetição para colocar os valores
        for (i = 0; i < 10; i++) {
            vet[i] = sc.nextInt();
        }
        System.out.println("Digite 10 valores inteiros para B:");
        for (i = 0; i < 10; i++) {
            vetB[i] = sc.nextInt();
        }
        for (i = 0; i < 3; i++) {
            vetC[j] = vet[i]; //J significa a posição em que iniciará que no caso é 0
            j++;
            vetC[j] = vetB[i];
            j++; // inicia uma repetição indo sempre por onde tinha parado
        }

        for (i = 0; i < 6; i++) {
            System.out.println("vetorC[" + i + "] = " + vetC[i]); //Saída(SEMPRE dentro do FOR quando se tratar de vetor)
        }
    }
}
