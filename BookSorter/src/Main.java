import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Sixth Ward",68,"Anton Çehov",1892);
        Book book2 = new Book("The Land of the White Lilies",140,"Grigory Petrov",1923);
        Book book3 = new Book("The Conquest of Happiness",192,"Arthur Schopenhauer",1930);
        Book book4 = new Book("Kinyas ve Kayra",500,"Hakan Günday",2000);
        Book book5 = new Book("Daha",420,"Hakan Günday",2013);

        TreeSet<Book> treeSet = new TreeSet<>(Book::compareTo);
        treeSet.add(book1);
        treeSet.add(book2);
        treeSet.add(book3);
        treeSet.add(book4);
        treeSet.add(book5);

        Iterator<Book> itr = treeSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getBookName());
        }

        TreeSet<Book> treeSet2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageCount() - o2.getPageCount();
            }
        });
        treeSet2.add(book1);
        treeSet2.add(book2);
        treeSet2.add(book3);
        treeSet2.add(book4);
        treeSet2.add(book5);

        for (Book book: treeSet2) {
            System.out.println("Book Name: " + book.getBookName() +"\t\tPage Count : " + book.getPageCount());
        }

    }
}
