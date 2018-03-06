package solid_sod_soulution.test;

import org.junit.Test;
import solid_sod_solution.java.Book;
import solid_sod_solution.java.BookService;
import solid_sod_solution.java.IsbnGenerator;
import solid_sod_solution.java.IssnGenerator;


import static org.junit.Assert.assertEquals;

public class BookServiceTest {
    private BookService bookService;

    @Test
    public void createBook_withIsbnGenrator(){
        //setup
        bookService =  new BookService(new IsbnGenerator()); // more specific than  previous version solid_sod_bad_example_extension
        //run  test
        Book book = bookService.createBook("name");
        //verify
        assertEquals("name",  book.getTitle());
        assertEquals("13", (book.getNumber()).substring(0,2));
    }

    @Test
    public void createBook_withIssnGenrator(){
        //setup
        bookService =  new BookService(new IssnGenerator());
        //run  test
        Book book = bookService.createBook("name");
        //verify
        assertEquals("name",  book.getTitle());
        assertEquals("10", (book.getNumber()).substring(0,2));
    }

}
