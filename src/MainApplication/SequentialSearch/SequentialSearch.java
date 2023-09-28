package MainApplication.SequentialSearch;

import java.util.Objects;


/*
Pesquisa Sequencial é utilizada para buscar um elemento em um Objeto de armazenamento, seja este uma lista ou um Array.
Onde caso o elemento exista, retorna sua posição.
A Pesquisa Sequencial faz uma busca por cada elemento do objeto de armazenamento, ou seja, No pior caso possível o elemento
pode está na última posição, passando por cada elemento até seu encontro, assim sua notação BIG O é de O(n).
 */

public class SequentialSearch {

    public static void sequentialSearch(Object[] obj, Object searchObj){
        Objects.requireNonNull(obj, "The list cannot be null");

        long initialTime = System.currentTimeMillis();

        boolean found = false;
        int position;

        for(position = 0; position<obj.length;position++ ){
            if(obj[position].equals(searchObj)) {
                found = true;
                break;
            }

        }
        if (found){
            System.out.println("Object found in position: " + position);
        }else{
            System.out.println("Object does not exist! ");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Big O Notation O(n): "+ ((endTime - initialTime)) + " milliseconds");
    }

}
