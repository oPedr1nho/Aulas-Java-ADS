package ads;

import java.util.Scanner;

public class VetorEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, v[] = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (i = 0; i < 10; i++) {
            v[i] = sc.nextInt();        
        }
        
        for (i = 0; i < 10; i++){
            System.out.println("Vetor["+i+"] = "+v[i]);
        }
    }
}
