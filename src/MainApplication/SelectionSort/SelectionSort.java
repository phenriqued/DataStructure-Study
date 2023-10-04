package MainApplication.SelectionSort;

/*
O Selection Sort é um método de ordenação por seleção. Ele percorre a lista em busca do menor valor e o move para a
posição correta precedido sempre do elemento de menor valor (em caso de uma ordenação crescente).
1. Neste algoritmo de ordenação é escolhido um número a partir do primeiro.
2. Este número escolhido é comparado com os números a partir da sua direita, quando encontrados um número menor, o número
 escolhido ocupa a posição do menor número encontrado.
3. Este número encontrado será o próximo número escolhido, caso não for encontrado nenhum número menor que este escolhido,
ele é colocado na posição do primeiro número escolhido.
4. O próximo número á sua direita vai ser o escolhido para fazer as comparações. É repetido esse processo até que a lista
esteja ordenada.
 */

public class SelectionSort {

    public static Integer[] selectionSort(Integer[] collections){
        Integer count = 0;
        for (int i=0; i< collections.length; i++){
            Integer position_sort = i;
            for (int j =i+1; j<collections.length; j++){
                if(collections[j] < collections[position_sort]){
                    count++;
                    position_sort = j;
                }
            }

            Integer aux = collections[position_sort];
            collections[position_sort] = collections[i];
            collections[i] = aux;
            count++;
        }
        System.out.println("Notation Big 0(N^2)\nSteps for ordering the vector:"+count);
        return collections;
    }

}
