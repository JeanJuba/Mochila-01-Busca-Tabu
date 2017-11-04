package buscatabu;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author m95952
 */
public class Busca {

    private int bestIt;         //Melhor iteração
    private int maxBT;          //Número máximo de iterações sem melhora
    private String[] itemNames; //Nomes dos itens
    private double[] weights;   //Pesos dos itens
    private double[] values;    //Valores dos itens
    private int pesoMax;        //Peso máximo
    private double alpha = 0;       //Somatório de todas as utilidades
    private int[] contem;
    
    public Busca() {

        itemNames = new String[]{"map", "compass", "water", "sandwich", "glucose", "tin", "banana", "apple",
            "cheese", "beer", "suntan cream", "camera", "T-shirt", "trousers", "umbrella", "waterproof trousers",
            "waterproof overclothes", "note-case", "sunglasses", "towel", "socks", "book"};
        weights = new double[]{9, 13, 153, 50, 15, 68, 27, 39, 23, 52, 11, 32, 24, 48, 73,
            42, 43, 22, 7, 18, 4, 30};

        values = new double[]{150, 35, 200, 160, 60, 45, 60, 40, 30, 10, 70, 30, 15, 10, 40,
            70, 75, 80, 20, 12, 50, 10};
        
        contem = new int[itemNames.length];
        
        for(int i = 0; i < contem.length; i++){
            contem[i] = 0;
        }
            
        for(double d: values){
            alpha += d;
        }
    }

    private void run() {
        int itAtual = 0;
        
        while(itAtual < maxBT){
            
            
            
             
        }
    }
    
    

    /**
     * Avalia se a solução gerada é melhor que a atual mesmo com as penalidades caso ela for maior
     * que o peso
     */
    private double avaliacao() {
        
        return 0;
    }

    /**
     * Função que avalia se deve ser permitido um movimento tabu após um tempo
     */
    private void funcaoAspiracao() {
        
        
    }
}
