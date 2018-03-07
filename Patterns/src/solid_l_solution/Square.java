package solid_l_solution;

public class Square implements Shape {

    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public int getArea() {
        return width*width;
    }
}
