
public class Billing {

    public static int priceWithVAT(int vatRate, int priceWithoutVAT) {
        if (vatRate == 5 || vatRate == 18 || vatRate == 27){
            return (int)Math.ceil((priceWithoutVAT / 100.0) * vatRate + priceWithoutVAT);
        } else {
            throw new IllegalArgumentException("Érvénytelen áfakulcs");
        }
    }

    public static int priceWithoutVAT(int vatRate, int priceWithVAT) {
        if (vatRate == 5 || vatRate == 18 || vatRate == 27){
            return (int)Math.floor(priceWithVAT / ((vatRate / 100.0) + 1));
        } else {
            throw new IllegalArgumentException("Érvénytelen áfakulcs");
        }
    }

    public static String displayBook(String author, String title, int priceWithVAT) {
        String szerzoCim = author + " - " + title;
        String str = String.format("%-50s Áfával: %5d Ft, Áfa nélkül: %5d Ft", szerzoCim, priceWithVAT, priceWithoutVAT(5, priceWithVAT));
        return str;
    }
}
