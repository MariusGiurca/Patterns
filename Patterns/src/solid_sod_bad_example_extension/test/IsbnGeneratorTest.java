package solid_sod_bad_example_extension.test;

import org.junit.Before;
import org.junit.Test;
import solid_sod_bad_example_extension.java.IsbnGenerator;

import static org.junit.Assert.assertEquals;

public class IsbnGeneratorTest {
    private IsbnGenerator isbnGenerator;

    @Before
    public void setUp(){
        isbnGenerator  =  new IsbnGenerator();
    }

    @Test
    public void generateNumber(){
        String isbn = isbnGenerator.generateIsbnNumber();
        assertEquals("13",isbn.substring(0,2));
    }
}
