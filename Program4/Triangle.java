public class Triangle extends Shape {
    public Triangle(double a, double b){
        super(a,b);
    }
    @Override
    public void printArea(){
        double area = (0.5 * a * b);
        System.out.println("The area of the triangle is: "+area);
    } 
}
