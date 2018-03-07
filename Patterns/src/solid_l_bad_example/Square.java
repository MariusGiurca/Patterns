package solid_l_bad_example;

public class Square extends  Rectangle {

    @Override
    public void setWidth(int width) {
        super.width = width;
        super.height = width; // Change the behavior
    }

    @Override
    public void setHeight(int height){
        super.width = height; // Change the behavior
        super.height = height;
    }
}
