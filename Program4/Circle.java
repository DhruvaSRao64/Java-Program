public class Circle extends Shape {
    public Circle(double a, double b){
        super(a,b);
    }
    @Override
    public void printArea(){
        double area = Math.PI * a * a;
        System.out.println("The area of the Circle is: "+area);
    }

}
