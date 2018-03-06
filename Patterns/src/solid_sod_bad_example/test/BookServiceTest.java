package solid_sod_bad_example.test;

import org.junit.Before;
import org.junit.Test;
import solid_sod_bad_example.java.Book;
import solid_sod_bad_example.java.BookService;

import static org.junit.Assert.assertEquals;

public class BookServiceTest {
    private BookService bookService;

    @Before
    public void setUp(){
        bookService = new BookService();
    }

    @Test
    public void createBook(){
        //run  test
        Book book = bookService.createBook("name");

        //verify
        assertEquals("name",  book.getTitle());
        assertEquals("13", (book.getNumber()).substring(0,2));
    }
}
