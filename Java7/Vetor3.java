package ads;

import java.util.Scanner;

public class Vetor3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v[] = new int[3];
        int i;
        for (i = 0; i < 3; i++) {
            v[i] = sc.nextInt();
        }

        System.out.println("Digite 3 números:");

        for (i = 0; i < 3; i++) {
            System.out.println("v[" + i + "] = " + v[i]);
        }

    }
}
