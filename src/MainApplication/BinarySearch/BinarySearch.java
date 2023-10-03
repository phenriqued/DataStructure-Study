package MainApplication.BinarySearch;

/*
Pesquisa Binária é utilizada para buscar um elemento em um Objeto de armazenamento, seja este uma lista ou um Array.
Onde se o elemento existe retorna sua posição.
A pequisa binária DEVE SER FEITA EM UMA array ou list ORDENADOS. Isso porque a pesquisa binária usa uma estrátegia de
divisão, ou seja, sua estrátegia consiste em pegar o array ou list, dividir ao meio e verificar se o elemento central é
o elemento que se busca ou não, caso não seja, o elemento que se busca é verificado com central se o elemento central for
maior que o elemento que se busca a metade maior é eliminada e se o central é menor que o elemento que se busca a metade
menor é eliminada, usando essa estrátegia até o encontro ou não do elemento. A pesquisa binária é um forma otimizada, pois
sua notação em BIG O é O(Log(n)).
 */
public class BinarySearch {
    /*
    Há um metódo static da classe Arrays que tem a mesma lógica!
        Arrays.binarySearch(objs[], searchObj)
     */

    public static void binarySearch(Integer objs[], Integer searchObj){

        Integer count = 0;

        Integer intial = 0;
        Integer end = objs.length -1;
        Integer half = 0;

        boolean found = false;

        while(intial <= end){
            half = (intial + end)/2;
            if(searchObj.equals(objs[half])){
                found = true;
                break;
            }else if (half > searchObj){
                end = half -1;
            }else{
                intial = half+1;
            }
            count++;
        }

        if(found){
            System.out.println("Object found in position: " + half);
        }else{
            System.out.println("Object does not exist! ");
        }


        System.out.println("Big O Notation O(LogN): "+ count);

    }

}
