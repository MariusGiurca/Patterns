package solid_sod_bad_example_extension.test;

import org.junit.Before;
import org.junit.Test;
import solid_sod_bad_example_extension.java.IssnGenerator;

import static org.junit.Assert.assertEquals;

public class IssnGeneratorTest {
    private IssnGenerator issnGenerator;

    @Before
    public void setUp(){
        issnGenerator =  new IssnGenerator();
    }

    @Test
    public void generateNumber(){
        String isbn = issnGenerator.generateIssnNumber();
        assertEquals("10",isbn.substring(0,2));
    }
}
