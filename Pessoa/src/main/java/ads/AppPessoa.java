package ads;

public class AppPessoa {

    public static void main(String[] args) {
        Pessoa Pedro = new Pessoa();
        Pedro.setNome("Pedro Rizzato");
        Pedro.setIdade(17);
        Pedro.setSexo('M');
        Pedro.status();

        Pessoa mae = new Pessoa();
        mae.setNome("Fabiana Rizzato");
        mae.setIdade(41);
        mae.setSexo('F');
        mae.status();

        Pessoa crush = new Pessoa();
        crush.setNome("Amanda Silva");
        crush.setIdade(18);
        crush.setSexo('F');
        crush.status();
    }

}
