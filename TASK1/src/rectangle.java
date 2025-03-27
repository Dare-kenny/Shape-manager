public class rectangle implements ShapeActions{
    private double length,breadth;

    public rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double CalculateArea() {
        return length*breadth;
    }

    @Override
    public double CalculatePerimeter() {
        return 2 *(length+breadth);
    }

    @Override
    public String GetDescription() {
        return "You have selected a Rectangle with lengthm"+length+" and breadth "+breadth;
    }
}