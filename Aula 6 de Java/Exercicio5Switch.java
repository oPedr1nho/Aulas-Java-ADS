package ads;
import java.util.Scanner;
public class Exercicio5Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual produto você deseja?");
        System.out.println("100 - Cachorro Quente - 1,20");
        System.out.println("101 - Bauru Simples - 1,30");
        System.out.println("102 - Bauru com Ovo - 1,50");
        System.out.println("103 - Hambúguer - 1,20");
        System.out.println("104 - Cheeseburger - 1,30");
        System.out.println("105 - Refrigerante - 1,00");
        
        int qtdProduto = sc.nextInt();
        
        switch (qtdProduto){
            case 1:
                double cachorro = qtdProduto + 1.20;
                System.out.printf("O preço do Cachorro Quente será de: %.2f\n", cachorro);
                break;
            case 2:
                double bauru = qtdProduto + 1.30;
                System.out.printf("O preço do Bauru Simples será de: %.2f\n", bauru);
                break;
            case 3:
                double bauruovo = qtdProduto + 1.50;
                System.out.printf("O preço do Bauru com Ovo será de: %.2f\n", bauruovo);
                break;
            case 4:
                double hamburguer = qtdProduto + 1.20;
                System.out.printf("O preço do hamburguer será de: %.2f\n", hamburguer);
                break;
            case 5:
                double cheesburger = qtdProduto + 1.30;
                System.out.printf("O preço do Cachorro Quente será de: %.2f\n", cheesburger);
                break;    
            case 6:
                double refri = qtdProduto + 1.20;
                System.out.printf("O preço do Cachorro Quente será de: %.2f\n", refri);
                break;
            default:
                break;
                       
        }
    }
}
