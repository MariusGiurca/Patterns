package solid_sod_bad_example_extension.java;

import java.util.Random;

public class IssnGenerator {

    public String generateIssnNumber(){
        return "10" + Math.abs(new Random().nextInt());
    }
}
