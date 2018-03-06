package solid_sod_bad_example_extension.java;

public class BookServiceDemo {

    public static void main(String[] args) {

        BookService bookService = new BookService();

        Book book1 = bookService.createBook("name1", 1);
        Book book2 = bookService.createBook("name2", 2);

        System.out.println(book1);
        System.out.println(book2);

    }
}
