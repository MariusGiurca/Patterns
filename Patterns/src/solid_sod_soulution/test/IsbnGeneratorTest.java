package solid_sod_soulution.test;

import org.junit.Before;
import org.junit.Test;
import solid_sod_solution.java.IsbnGenerator;


import static org.junit.Assert.assertEquals;

public class IsbnGeneratorTest {
    private IsbnGenerator isbnGenerator;

    @Before
    public void setUp(){
        isbnGenerator  =  new IsbnGenerator();
    }

    @Test
    public void generateNumber_isbn(){
        //run test
        String isbn = isbnGenerator.generateNumber();
        
        //verify
        assertEquals("13",isbn.substring(0,2));
    }
}
