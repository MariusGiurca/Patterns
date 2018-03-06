package solid_sod_bad_example.java;

public class BookServiceDemo {

    public static void main(String[] args) {

        BookService bookService = new BookService();

        Book book1 = bookService.createBook("name1");

        System.out.println(book1);

    }

}
