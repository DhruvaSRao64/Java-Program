import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Book[] book = new Book[n];
        System.out.println("Enter the details: ");
        for (int i = 0; i < n; i++){
            System.out.println("Enter the name for "+"Book: "+(i+1));
            String name = scanner.nextLine();
            System.out.println("Enter the author name: ");
            String author = scanner.nextLine();
            System.out.println("Enter the price: ");
            double price = scanner.nextDouble();
            System.out.println("Enter the number of pages: ");
            int num_pages = scanner.nextInt();
            scanner.nextLine();
            book[i] = new Book(name, author, price, num_pages);
        }
        System.out.println("The book details is: ");
        for (Book books: book){
            System.out.println(books.toString());
        }
        scanner.close();
    }   
}
