package pro.sky;

public class Main {
    public static void printBooksArray(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getAuthorName().getFirstName() + " " + books[i].getAuthorName().getLastName() + " - " + books[i].getBookName() + ", " + books[i].getYearPublishing());
        }
    }

    public static void main(String[] args) {
        Book[] books = new Book[3];
        Author author1 = new Author("Роберт", "Мартин");
        Author author2 = new Author("Томас", "Кормен");
        books[0] = new Book("Идеальный программист", author1, 2021);
        books[1] = new Book("Чистая архитектура", author1, 2022);
        books[2] = new Book("Алгоритмы. Вводный курс", author2, 2020);
        printBooksArray(books);
        books[2].setYearPublishing(2022);
        System.out.println("=================================================================");
        printBooksArray(books);
    }
}
