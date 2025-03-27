public class Square implements ShapeActions{
    private double length;
    public Square(double Length){
        this.length = Length;
    }

    @Override
    public double CalculateArea() {
        return Math.pow(length,4);
    }

    @Override
    public double CalculatePerimeter() {
        return 4 * length;
    }

    @Override
    public String GetDescription() {
        return "You have selected a square with side "+length;
    }
}
