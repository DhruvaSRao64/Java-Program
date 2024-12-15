import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the coefficient b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        if (a == 0){
            System.out.println("Invalid coefficient of a!");
        }

        double disc = (b*b) - (4 * a * c);

        if (disc > 0){
            double root1 = -b + (Math.sqrt(disc)/(2 * a));
            double root2 = -b - (Math.sqrt(disc)/(2 * a));
            System.out.println("Roots are real and distinct");
            System.out.println("The first root is: "+root1+"\n The second root is: "+root2);
        }else if (disc == 0){
            double root1 = -b/(2 * a);
            double root2 = root1;
            System.out.println("Roots are real and equal");
            System.out.println("The roots are: "+root1+"\n"+root2);
        }else{
            double realPart = -b/(2 * a);
            double imagPart = Math.sqrt(-disc)/(2 * a);
            System.out.println("The equation has complex roots");
            System.out.println("The real root is: "+realPart+"\nThe imaginary part is: "+imagPart);
        }

        scanner.close();
    }
}
