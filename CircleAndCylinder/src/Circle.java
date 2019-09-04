public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle(){
    }

    public Circle(double radius, String color){
        setRadius(radius);
        setColor(color);
    }

    public double getArea(){
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    public double getPerimeter(){
        return getRadius() * 2 * Math.PI;
    }

    public String String(){
        return "A circle with radius = " + getRadius()
                + " and color = " + getColor()
                + " : \n Area = " + getArea()
                + " \n Perimeter = " + getPerimeter();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
