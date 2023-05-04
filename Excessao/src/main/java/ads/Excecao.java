package ads;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Excecao {
    
    public static void main(String[] args) {
        int x;
        boolean invalido = true;
        do{
        try{
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um n°:"));        
        JOptionPane.showMessageDialog(null, "Número = "+x);
        invalido = false;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Presta atenção! Só número!!!\n"+ e.getMessage(), "Errrrrouuuuuuu!", JOptionPane.ERROR_MESSAGE);
        }
     }while(invalido);
        
//        Scanner sc = new Scanner(System.in);
//        int x, x1, divisor = 0;
//        int vet[] = new int[5];
//        System.out.println("4");




//        System.out.println("Digite um número");
//        x = sc.nextInt();
//        System.out.println("Número é = "+x);
//        x1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n°:"));
//        x = x1/divisor;
//        JOptionPane.showMessageDialog(null, "Divisão = "+x);
        
    }
}
