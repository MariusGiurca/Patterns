package solid_sod_bad_example.java;

import java.util.Random;

public class IsbnGenerator {

    public String generateIsbnNumber() {
        return "13" + Math.abs(new Random().nextInt());
    }
}
