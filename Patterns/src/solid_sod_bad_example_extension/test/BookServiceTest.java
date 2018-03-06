package solid_sod_bad_example_extension.test;

import org.junit.Before;
import org.junit.Test;
import solid_sod_bad_example_extension.java.Book;
import solid_sod_bad_example_extension.java.BookService;

import static org.junit.Assert.assertEquals;

public class BookServiceTest {
    private BookService bookService;

    @Before
    public void setUp(){
        bookService = new BookService();
    }

    @Test
    public void createBook_withIsbnGenrator(){
        //run  test
        Book book = bookService.createBook("name",1);
        //verify
        assertEquals("name",  book.getTitle());
        assertEquals("13", (book.getNumber()).substring(0,2));
    }


    @Test
    public void createBook_withIssnGenrator(){
        //run  test
        Book book = bookService.createBook("name",2);
        //verify
        assertEquals("name",  book.getTitle());
        assertEquals("10", (book.getNumber()).substring(0,2));
    }


}
