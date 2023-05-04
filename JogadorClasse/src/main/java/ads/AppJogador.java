package ads;

import java.util.Scanner;

public class AppJogador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jogador jog = new Jogador();
        System.out.println("Insira o nome do Jogador:");
        jog.Nome = sc.nextLine();
        System.out.println("Clube do Jogador:");
        jog.Clube = sc.nextLine();
        System.out.println("Posição do jogador:");
        jog.Posicao = sc.nextLine();
        System.out.println("Coloque o número da camiseta:");
        jog.nmrCamisa = sc.nextLine();
        System.out.println("Melhor Pé do Jogador:");
        jog.mlrPe = sc.nextLine();
        System.out.println("Insira a Altura do jogador:");
        jog.Altura = sc.nextLine();
        System.out.println("Nacionalidade do jogador");
        jog.Nacionalidade = sc.nextLine();
        System.out.println("Idade:");
        jog.idade = sc.nextInt();
        
        jog.status();
    }
}
