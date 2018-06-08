package MediaVetorThread;
// utiliza-se a interface Runnable que também do pacote Java leng
public class ThreadMedia implements Runnable{
    
    private String nome;
    private int[] num;
    
    //Chama-se uma instância do vetor para poder compartilhar 
    private static MediaVetor vetor = new MediaVetor();
    
    //Cria-se um construtor que passará por paramêtro o nome e um construtor e o arrays dos numeros
    public ThreadMedia (String nome, int[]num){
        this.nome= nome;
        this.num = num;
        
        //forma simplificada
        new Thread(this, nome).start();
        
        // Thread t = new Thread(this, nome);
        // t.start();
    }

    //chamando o metodo
    @Override
    public void run() {
        System.out.println(this.nome + "iniciada");
        
        int soma = vetor.somaArray(this.num);
        System.out.println("Resultado da soma para thread: " + this.nome + " é: " + soma);
        System.out.println("");
        int media = vetor.mediaArray(this.num);
        System.out.println("Resultado da media para thread: " + this.nome + " é: " + media);
        System.out.println(this.nome + " terminada ");
        System.out.println("");
    }
 
    
}
