

import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> bookList = new ArrayList<>();
    public void addBook(int id, String author, String title, int price, boolean onSale) {
        bookList.add(new Book(id, author, title, price, onSale));
    }
    public int getBookCount() {
        return bookList.size();
    }
    public long getTotalPrice() {
        long sum = 0;
        for (Book book: bookList) {
            sum += book.getPrice();
        }
        return sum;
    }
    public int countOnSale() {
        int akciosKonyvek = 0;
        for (Book book: bookList) {
            if (book.isOnSale()){
                akciosKonyvek++;
            }
        }
        return akciosKonyvek;
    }

    public String getCheapest(){
        int cheapestPrice = 1000000000;
        String cheapestBook = "";
        for (Book book: bookList) {
            if (book.getPrice() < cheapestPrice){
                cheapestPrice = book.getPrice();
                cheapestBook = book.getTitle();
            }
        }
        return cheapestBook;
    }
}
