package ads;

public class AppCachorro {
    public static void main(String[] args) {
        Cachorro spyke = new Cachorro();
        spyke.setCor("Caramelo");
        spyke.setRaca("Sem Raça");
        spyke.setPorte("Médio");
        spyke.setPeso(18);
        spyke.Correr();
        spyke.status();
        
        Cachorro Cris = new Cachorro();
        Cris.setCor("Azul");
        Cris.setRaca("Bullterrier");
        Cris.setRaca("Grande");
        Cris.setPeso(20);
        Cris.Correr();
        Cris.Patinha();
        Cris.Latir();
        Cris.status();
}    
}
