package lesson10;

public class ReaderDemo {
    public static void main(String[] args) {
        Reader reader1 = new Reader();
        Reader reader2 = new Reader("Вася Петров", 12, "математический",
                "12 февраля 1993", "5676645666");
        Reader reader3 = new Reader();
        Reader reader4 = new Reader();
        Reader[] array = {reader1, reader2, reader3, reader4};

        reader2.returnBook(5);
        reader3.takeBook("Martin Iden", "Jungle book");
    }
}
