package ads;

public class Cachorro {
    private String cor, raca, porte;
    private float peso;
    public Cachorro(){
        
    }
    public Cachorro(String cor, String raca, String porte, float peso){
        this.cor = cor;
        this.raca = raca;
        this.porte = porte;
        this.peso = peso;
    }    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void status(){
        System.out.println("Cor: "+this.cor);
        System.out.println("Raça: "+this.raca);
        System.out.println("Porte: "+this.porte);
        System.out.printf("Peso: %.3f\n \n ",this.peso);
    }
    public void Correr(){
        System.out.println("Fruk Fruk");
    }
    public void Patinha(){
        System.out.println("Deu a patinha");
    }
    public void Latir(){
        System.out.println("AUAU");
    }
}

