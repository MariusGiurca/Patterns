package solid_l_bad_example;

public class DemoLiskovSubstitutionPrinciple {

    public static void  main(String[] args){
        Rectangle rectangle =  new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(17);
        System.out.println("Rectangle area =  " +  rectangle.getArea());

        Rectangle square = new Square();
        square.setWidth(3);
        square.setHeight(5);
        System.out.println("Square area = " +  square.getArea());
    }
}
