package Zabawa;

// Generics with two placeholders or more, are also possible.
public class ProductGenerics<T, U> {
    T item;
    U price;

    ProductGenerics(T item, U price){
        this.item = item;
        this.price = price;
    }

    public T getItem(){
        return this.item;
    }

    public U getPrice(){
        return this.price;
    }
}
