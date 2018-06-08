package MediaVetorThread;

import java.util.logging.Level;
import java.util.logging.Logger;

//Cria-se um classe e implementa os metodos
public class MediaVetor {

    private int soma ;
    private int media ;
    
    // metodo synchronized serve para que apenas uma Thread cesa esse metódo por vez
    public synchronized int somaArray(int[] array) {

        soma = 0;
        media = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];

            System.out.println("Executando a soma " + Thread.currentThread().getName()
                    + " somando o valor " + array[i] + " com total de " + soma);
            try {
                // a Thread dorme por meio milesegundo para executar o for novamente
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MediaVetor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //media+=array.length;
        //System.out.println("A media do vetor é " + media);
        return soma;
        //return media;
    }
     public synchronized int mediaArray(int[] array) {

        soma = 0;
        media = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        media= soma/array.length;  
       try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MediaVetor.class.getName()).log(Level.SEVERE, null, ex);
            }
        return media;
        //return media;
    }

}


