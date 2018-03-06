package solid_sod_solution.java;

import java.util.Random;

public class IsbnGenerator implements NumberGenerator{

    public String generateNumber() {
        return "13" + Math.abs(new Random().nextInt());
    }
}
