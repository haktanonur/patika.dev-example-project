import java.util.*;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Büyünün Rengi",249,"Terry Pratchett",1983);
        Book book2 = new Book("Kinyas ve Kayra",500,"Hakan Günday",2002);
        Book book3 = new Book("Dorian Grey'in Portresi",350,"Oscar Wilde",1970);
        Book book4 = new Book("Otomatik Portakal",250,"Anthony Burgess",1960);
        Book book5 = new Book("Atomik Alışkanlıklar",70,"James Clear",2015);

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);

        Map<String,String> booksandAuthors = new HashMap<>();
        bookList.stream().forEach(p -> booksandAuthors.put(p.getName(), p.getAuthor()));

        for(String s : booksandAuthors.keySet()){
            System.out.println("Kitap : " + s + "\t Yazar : " + booksandAuthors.get(s));
        }

        System.out.println();
        System.out.println("Sayfa sayısı 100 den büyük olan kitaplar");
        List<Book> newList = bookList.stream().filter(p-> p.getPageNumber() > 100).toList();
        for (Book b : newList){
            System.out.println("Kitap adı : " + b.getName()+
                            "\tKitap sayfası : " + b.getPageNumber()+
                    "\tKitap Yazarı : " + b.getAuthor() +
                    "\tKitabın yayın tarihi : " + b.getReleaseDate());
        }



    }
}
