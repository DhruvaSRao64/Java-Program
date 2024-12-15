public class IPCDeadlockDemo {
    public static void main(String[] args) {
        SharedResource resource1 = new SharedResource();
        SharedResource resource2 = new SharedResource();

        Thread thread1 = new Thread(() -> resource1.methodA(resource2), "Thread-1");

        Thread thread2 = new Thread(() -> resource2.methodB(resource1), "Thread-2");

        thread1.start();
        thread2.start();
    }
}
