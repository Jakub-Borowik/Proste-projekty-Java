package Zabawa;
// T is a placeholder for any type of an object
public class BoxGenerics<T> {
    T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}
