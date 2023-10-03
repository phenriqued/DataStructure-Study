package MainApplication.BubbleSort;

/*
Uma interação do mesmo se limita a percorrer a tabela (vetor) do inicio ao fim, sem interrupção trocando de posição dois
elementos consecutivos sempre que estes se apresentam fora de ordem. Intuitivamente percebe-se que a intenção do método é
mover os elementos menores em direção ao ínicio da tabela. Ao terminar a primeira interação pode se garantir que as trocas
realizadas posicionam o menor elemento na primeira posição (No caso de uma ordem crescente).
 */
public class BubbleSort {

    public static Integer[] bubbleSort(Integer[] collections){
        Integer count = 0;
        for(int i=0; i<collections.length; i++){
            count++;
            Integer position;
            for(int j=i+1; j<collections.length; j++){
                if(collections[i] > collections[j]) {
                    position = collections[j];
                    collections[j] = collections[i];
                    collections[i] = position;
                }
                count++;
            }
        }
        System.out.println(count);
        return collections;
    }


}
