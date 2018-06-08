package MediaVetorThread;
public class Teste {
    public static void main(String[] args) {
        
        // Cria-se um vetor
        int[]array = {1,2,3,4,5};
        
        //chama-se as Threads
        ThreadMedia t1 = new ThreadMedia("#1", array);
        ThreadMedia t2 = new ThreadMedia("#2", array);
        
    }
    
}
