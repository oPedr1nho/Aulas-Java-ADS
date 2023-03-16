package ads;

import java.util.Scanner;

public class VetorIdades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, v[] = new int[5];
        double media = 0;
        System.out.println("Digite as idades:");

        for (i = 0; i < 5; i++) {
            v[i] = sc.nextInt();
            media = media + v[i];
        }
        media = media / 5.0;
        System.out.println("A média das idades é =" + media);

    }
}
