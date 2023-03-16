package ads;

public class Vetor2 {

    public static void main(String[] args) {
       
        int vetorLost[] = {4, 8, 15, 16, 23, 42};
        int vetorNovo[]=new int[6];
       
        for (int i = 0; i<6; i++){
            vetorNovo[i] = vetorLost[i];
            System.out.println("VN ="+vetorNovo[i] + " ---VLost ="+vetorLost[i]);
        }
        
    }
}
