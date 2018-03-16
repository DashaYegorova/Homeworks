package lesson13;

public class PrintableDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Толкиен");
        Book book2 = new Book("Война и мир");
        Magazine magazine1 = new Magazine("За рулем");
        Magazine magazine2 = new Magazine("Burda moda");

        Printable[] printables = {book1, book2, magazine1, magazine2};
        for (Printable p : printables) {
            p.print();
        }

        Book.printBooks(printables);
        Magazine.printMagazines(printables);
    }
}
