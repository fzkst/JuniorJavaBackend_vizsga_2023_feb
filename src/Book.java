
public class Book {
    private int id;
    private String author;
    private String title;
    private int price;
    private boolean onSale;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book(int id, String author, String title, int price, boolean onSale) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.price = price;
        this.onSale = onSale;
    }

    public boolean isOnSale() {
        return this.onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public int getCurrentPrice() {
        int akciosAr = (int)Math.floor(this.getPrice() - ((this.getPrice() / 100) * 15));
        if (this.isOnSale()){
            return akciosAr;
        }
        return this.getPrice();
    }

    @Override
    public String toString() {
        String str = String.format("%s - %s: %d Ft", this.author, this.title, this.getCurrentPrice());
        return str;
    }
}
