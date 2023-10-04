package MainApplication.InsertionSort;

/*
O Insertion Sort é um método simples de ordenação que percorre um vetor ordenando os elementos a esquerda a medida que avança.
Um exemplo de como funciona é em uma pilha de cartas de onde vamos tirando carta por carta, cada vez que uma carta é
tirada ela é comparada às outras cartas que já estão na mão do jogador, e é inserida em seu devido lugar. Desta forma é
possível obtermos uma sequência ordenada de cartas na mão.
 */
public class InsertionSort {

    public static Integer[] insertionSort(Integer[] collections){
        Integer count = 0;
        for(int i=1; i<collections.length; i++){
            count++;
            Integer aux = collections[i];
            Integer j = i-1;

            while(j>=0 && aux < collections[j]){
                count++;
                collections[j+1] = collections[j];
                j--;
            }
            collections[j+1] = aux;
        }
        System.out.println("Notation Big 0(N^2)\nSteps for ordering the vector:"+count);
        return collections;
    }



}
