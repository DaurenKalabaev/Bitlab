package Moduk1.Lessone11.lesseon8.labka6;

public class Library {
    private String name;
    private String city;
    private Book[] books = new Book[100];
    private int sizeofbooks = 0;
Library(){

}
public Library(String name, String city, Book[] books, int sizeofbooks){
    this.name=name;
    this.city=city;
    this.books=books;
    this.sizeofbooks= books.length;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
    public int size(){
    return sizeofbooks;
    }
    public void addBook(Book book){
    books[sizeofbooks] = book;
    sizeofbooks++;

    }
    public Book getBook(int index){
    return books[index];
    }
    public int pricesum(){
    int sum=0;
    for (int i=0; i<books.length; i++){
        sum +=books[i].getPrice();
    }
    return sum;
    }
}
