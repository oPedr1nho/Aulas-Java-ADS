package ads;

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("----Menu de Opções:----");
        System.out.println("1. Cadastrar Pedido");
        System.out.println("2. Listar Pedidos");
        System.out.println("3. Apagar pedido");
        System.out.println("4. Sair do Sistema");
        int op = ler.nextInt();
        switch (op) {
            case 1:
                System.out.println("Cadastro");
                break;
            case 2:
                System.out.println("Lista");
                break;
            case 3:
                System.out.println("Pedido Apagado");
                break;
            case 4:
                System.out.println("Saindo....");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

    }

}
