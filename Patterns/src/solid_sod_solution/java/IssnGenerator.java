package solid_sod_solution.java;

import java.util.Random;

public class IssnGenerator implements NumberGenerator{

    public String generateNumber(){
        return "10" + Math.abs(new Random().nextInt());
    }
}
