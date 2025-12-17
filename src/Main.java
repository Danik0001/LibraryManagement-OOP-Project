import com.daniyal.library.Book;
import com.daniyal.library.Library;

public static void main(String[] args) {
    Library library = new Library();

    Book book1 = new Book("1984", "George Orwell");
    Book book2 = new Book("Clean Code", "Robert Martin");

    library.addBook(book1);
    library.addBook(book2);

    library.showBooks();
}

