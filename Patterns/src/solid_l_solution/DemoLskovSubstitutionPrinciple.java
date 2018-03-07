package solid_l_solution;

import java.util.ArrayList;
import java.util.List;

public class DemoLskovSubstitutionPrinciple {

    public static void main(String[] args){

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Rectangle(2,4));
        shapeList.add(new Square(2));

        for(Shape shape : shapeList){
            System.out.println(shape.getArea());
        }

    }
}
