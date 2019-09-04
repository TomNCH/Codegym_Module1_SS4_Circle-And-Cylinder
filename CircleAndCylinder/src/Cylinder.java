public class Cylinder extends Circle{
    private double height = 3;

    public Cylinder(){
    }

    public Cylinder(double height){
        setHeight(height);
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * getHeight();
    }

    @Override
    public String String(){
        return "A Cylinder with height = " + getHeight()
                + " and " +super.String()
                + " \n volume = " + getVolume();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
