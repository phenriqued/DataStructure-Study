package MainApplication.LinkedListsDataStructure;

public class Nodule<T> {

    private T type;
    private Nodule next;
    private Nodule prev;

    public Nodule(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public Nodule getNext() {
        return next;
    }

    public void setNext(Nodule next) {
        this.next = next;
    }

    public Nodule getPrev() {
        return prev;
    }

    public void setPrev(Nodule prev) {
        this.prev = prev;
    }

    public Boolean hasNext(){
        if(getNext() != null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getType());
        return stringBuilder.toString();
    }
}
