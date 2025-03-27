public class Circle implements ShapeActions {
    private double radius;
    public Circle(double Radius){
        this.radius = Radius;
    }

    @Override
    public double CalculateArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double CalculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String GetDescription() {
        return "You have selected a circle with radius "+radius;
    }
}
