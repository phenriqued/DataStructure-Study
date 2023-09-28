package MainApplication.LinkedListsDataStructure;

import java.util.Objects;
/*
Construção de uma LinkedList, utilizando para entender o código fonte desse objeto de armazenamento
 */
public class LinkedLists<T> {
    private Nodule<T> nodule;
    private Integer size = 0;
    private Nodule first;
    private Nodule last;


    public Nodule getNodule() {
        return nodule;
    }

    public void setNodule(Nodule nodule) {
        this.nodule = nodule;
    }

    public Integer getSize() {
        if(size == 0) throw new ArrayIndexOutOfBoundsException("List size is NULL");
        return size;
    }
    public Nodule getFirst() {
        return first;
    }

    private void setFirst(Nodule first) {
        this.first = first;
    }

    public Nodule getLast() {
        return last;
    }

    private void setLast(Nodule last) {
        this.last = last;
    }

    public void add(T no){
        Objects.requireNonNull(no, "The Object cannot be null");
        Nodule nod = new Nodule<>(no);
        if (getFirst() == null && getLast() == null){
            setFirst(nod);
            setLast(nod);
        }else{
            this.last.setNext(nod);
            nod.setPrev(last);
            setLast(nod);
        }
        size++;
    }

    public void remove(T no){
        Nodule nod = getExistNodule(no);
        Objects.requireNonNull(nod, "This object cannot be null or does not exist");
        if(size == 1){
            setFirst(null);
            setLast(null);
        } else if(getFirst().getType().equals(nod.getType())){
            setFirst(getFirst().getNext());
        }else if(getLast().getType().equals(nod.getType())){
            setLast(getLast().getPrev());
            getLast().setNext(null);
        }else{
            nod.getNext().setPrev(nod.getPrev());
            nod.getPrev().setNext(nod.getNext());
        }
        size--;
    }

    private Nodule getExistNodule(T no){
        Nodule nod = new Nodule<>(no);
        Nodule nodule = getFirst();
        for(int i=0; i<size;i++){
            if(nod.getType().equals(nodule.getType())) return nodule;
            nodule = nodule.getNext();
        }
        return null;
    }


    public Nodule get(Integer index){
        if(index > this.size) throw new ArrayIndexOutOfBoundsException("index greater than size");
        Nodule getNodule = getFirst();

        for (int i=1;i<=index;i++){
            if(i == index){
                return getNodule;
            }else{
                getNodule = getNodule.getNext();
            }
        }
        return null;
    }

}
