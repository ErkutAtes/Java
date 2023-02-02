import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("a",100,"aa",55);
        Book book2 = new Book("b",562,"bb",884);
        Book book3 = new Book("c",80,"cc",223);
        Book book4 = new Book("d",638,"dd",4712);
        Book book5 = new Book("e",375,"ee",741484);

        //Store in the set
        HashSet<Book> hashBook = new HashSet<>();
        hashBook.add(book1);
        hashBook.add(book2);
        hashBook.add(book3);
        hashBook.add(book4);
        hashBook.add(book5);

        //Print fot the Control
        System.out.println("Store in the HashSet");
        for (Book i : hashBook){
            System.out.println("Book name :" + i.getBookName() + " Page :" +i.getPage()+ " Author :" + i.getAuthor());
        }

        System.out.println();

        TreeSet<Book> lhs = new TreeSet<>();
        lhs.add(book1);
        lhs.add(book2);
        lhs.add(book3);
        lhs.add(book4);
        lhs.add(book5);

        System.out.println("Store in the TreeSet and order by book names");
        for (Book i : lhs){
            System.out.println("Book name :" + i.getBookName() + " Page :" +i.getPage()+ " Author :" + i.getAuthor());
        }

        System.out.println();

        TreeSet<Book> lhs1 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage() - o2.getPage();
            }
        });
        lhs1.add(book1);
        lhs1.add(book2);
        lhs1.add(book3);
        lhs1.add(book4);
        lhs1.add(book5);

        System.out.println("Store in the TreeSet and order by pages");
        for (Book i : lhs1){
            System.out.println("Book name :" + i.getBookName() + " Page :" +i.getPage()+ " Author :" + i.getAuthor());
        }








    }
}
