public class Main {
    public static void main(String[] args) {
        Thread thread1 = new DisplayMessage("BMS College of Engineering", 10000); 
        Thread thread2 = new DisplayMessage("CSE", 2000); 

        thread1.start();
        thread2.start();
    }
}
