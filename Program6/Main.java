public class Main{
    public static void main(String[] args) {
        try {
            Father father = new Father(45);
            System.out.println("Father's age is valid.");

            Son son = new Son(45, 20);
            System.out.println("Son's age is valid.");
        } catch (WrongAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            Father invalidFather = new Father(-5);
        } catch (WrongAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            Son invalidSon = new Son(40, 45);
        } catch (WrongAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}