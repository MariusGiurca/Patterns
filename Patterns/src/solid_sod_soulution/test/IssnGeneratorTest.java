package solid_sod_soulution.test;

import org.junit.Before;
import org.junit.Test;
import solid_sod_solution.java.IssnGenerator;
import static org.junit.Assert.assertEquals;

public class IssnGeneratorTest {
    private IssnGenerator issnGenerator;

    @Before
    public void setUp(){
        issnGenerator =  new IssnGenerator();
    }

    @Test
    public void generateNumber_issn(){
        //run test
        String isbn = issnGenerator.generateNumber();

        //verify
        assertEquals("10",isbn.substring(0,2));
    }
}
