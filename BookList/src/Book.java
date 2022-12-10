public class Book {
    private String name;
    private int pageNumber;
    private String author;
    private int releaseYear;

    public Book(String name, int pageNumber, String author, int releaseYear) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseYear;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseYear = releaseDate;
    }
}
