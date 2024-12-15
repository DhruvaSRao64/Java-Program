public class Rectangle extends Shape {
    public Rectangle(double a, double b){
        super(a,b);
    }
    @Override
    public void printArea(){
        double area = a * b;
        System.out.println("The area of the rectangle is: "+area);
    }
}
