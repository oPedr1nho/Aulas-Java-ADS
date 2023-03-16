package ads;

import java.util.Scanner;

public class VetorEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        int i;
        System.out.println("Digite 5 valores inteiros:");

        for (i = 0; i < 5; i++) {
            vetorA[i] = sc.nextInt();
            vetorB[i] = 2 * vetorA[i];
        }
        System.out.println("Os 5 números de A copiados para B foram:");
        for (i = 0; i < 5; i++) {
            System.out.println("vetorB[" + i + "] = " + vetorB[i]);
        }
    }
}
