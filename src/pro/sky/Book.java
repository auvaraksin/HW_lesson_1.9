package pro.sky;

public class Book {
    private String bookName;
    private Author authorName;
    private int yearPublishing;

    public Book(String bookName, Author authorName, int yearPublishing) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearPublishing = yearPublishing;
    }

     public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}
