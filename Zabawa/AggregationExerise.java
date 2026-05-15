package Zabawa;

public class AggregationExerise {
    public static void main(String[] args) {
    // One object contains another objects, the contained object can exist independently.
    Book book1 = new Book("Mały Książe", 315);
    Book book2 = new Book("Lalka", 427);
    Book book3 = new Book("Nic mnie nie złamie", 267);

    Book[] books = {book1, book2, book3};

    Library library = new Library("Bydgoska księgarnia", 1919, books);

    library.displayInfo();

    /*
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
    */
    }
}
