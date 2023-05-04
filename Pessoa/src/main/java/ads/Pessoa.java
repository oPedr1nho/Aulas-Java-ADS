package ads;

public class Pessoa {
      private String nome;
      private int idade;
      private char sexo;
      //construções
      public Pessoa(){
          
      }
      public Pessoa(String nome, int idade, char sexo){
          this.nome = nome;
          this.idade = idade;
          this.sexo = sexo;
      }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
      public void status(){
          System.out.println("Nome: "+this.nome);
          System.out.println("Idade: "+this.idade);
          System.out.println("Sexo: "+this.sexo);
          System.out.printf("\n");
      }
    }

