


import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BookReader {
    BookManager konyvek = new BookManager();
    ArrayList<Book> lista = new ArrayList<>();
    public void readBooksFromFile(String fileName) {

        Scanner sc = new Scanner(fileName);
        sc.nextLine();
        while (sc.hasNextLine()){
            String[] data = sc.nextLine().split(";");
            Book book = new Book(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), (Integer.parseInt(data[4]) == 1) ? true : false);
            //konyvek.addBook(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), (Integer.parseInt(data[4]) == 1) ? true : false);
            lista.add(book);
        }
    }

    public int countOnSale() {
        int akciosKonyvek = 0;
        for (Book book: lista) {
            if (book.isOnSale()){
                akciosKonyvek++;
            }
        }
        return akciosKonyvek;
    }

    public String getCheapest() {
        int cheapestPrice = 1000000000;
        String cheapestBook = "";
        for (Book book: lista) {
            if (book.getPrice() < cheapestPrice){
                cheapestPrice = book.getPrice();
                cheapestBook = book.getTitle();
            }
        }
        return cheapestBook;
    }
}
