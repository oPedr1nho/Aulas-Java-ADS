package ads;

public class Jogador {
    String Nome, Clube, Posicao, nmrCamisa, mlrPe, Altura, Nacionalidade;
    int idade;
    
    public void status(){
        System.out.println("Nome: "+this.Nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Clube Atual: "+this.Clube);
        System.out.println("Posicao: "+this.Posicao);
        System.out.println("Numero da Camisa: "+this.nmrCamisa);
        System.out.println("Pé forte: "+this.mlrPe);
        System.out.println("Altura: "+this.Altura);
        System.out.println("Nacionalide: "+this.Nacionalidade);
    }
}
