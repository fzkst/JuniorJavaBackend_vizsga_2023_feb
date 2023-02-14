import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    BookManager konyvek = new BookManager();
    public static ArrayList<Book> lista = new ArrayList<>();
    public void readBooksFromFile(String fileName) {
        try{
            Scanner sc = new Scanner(fileName);
            sc.nextLine();
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
                //String[] data = sc.nextLine().split(";");
                //Book book = new Book(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), (Integer.parseInt(data[4]) == 1) ? true : false);
                //konyvek.addBook(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), (Integer.parseInt(data[4]) == 1) ? true : false);
                //lista.add(book);
            }
        } catch (Exception e){
            System.out.println("Nem nyílt meg!");
        }

    }


    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("books.csv");
            Scanner sc = new Scanner(fr);
            sc.nextLine();
            while (sc.hasNext()){
                String[] data = sc.nextLine().split(";");
                Book book = new Book(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), (Integer.parseInt(data[4]) == 1) ? true : false);
                //konyvek.addBook(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), (Integer.parseInt(data[4]) == 1) ? true : false);
                lista.add(book);
                System.out.println(book);
            }
        } catch (Exception e){
            System.out.println("Nem nyílt meg!");
        }


    }
}