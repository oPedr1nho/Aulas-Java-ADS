package ads;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Imposto {

    public static void main(String[] args) {
        double itbi, valor, vvenal, vtransacao, percentual;
        boolean invalido = true;

        do {
            try {
                vvenal = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor venal"));
                vtransacao = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de transação"));
                percentual = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do Imposto"));
                if (vvenal > vtransacao) {
                    itbi = (vvenal * percentual) / 100;
                } else {
                    itbi = (vtransacao * percentual) / 100;
                }
                JOptionPane.showMessageDialog(null, "O seu imposto será de: "+itbi);
                invalido = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Presta atenção seu jão!!!\n" + e.getMessage(), "Error 404!", JOptionPane.ERROR_MESSAGE);
            }

        } while (invalido);
    }

}
