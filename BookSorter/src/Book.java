public class Book implements Comparable<Book> {
    private String bookName;
    private int pageCount;
    private String author;
    private int releaseDate;

    public Book(String bookName, int pageCount, String author, int releaseDate) {
        this.bookName = bookName;
        this.pageCount = pageCount;
        this.author = author;
        this.releaseDate = releaseDate;
    }
    public Book(){

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o) {
        String a = this.getBookName();
        String b = o.getBookName();
        return a.compareTo(b);
    }
}
