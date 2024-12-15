class SharedResource {
    public synchronized void methodA(SharedResource resource) {
        System.out.println(Thread.currentThread().getName() + " is executing methodA");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException in methodA");
        }
        System.out.println(Thread.currentThread().getName() + " is trying to call methodB on " + resource);
        resource.methodB(this);
    }

    public synchronized void methodB(SharedResource resource) {
        System.out.println(Thread.currentThread().getName() + " is executing methodB");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException in methodB");
        }
        System.out.println(Thread.currentThread().getName() + " is trying to call methodA on " + resource);
        resource.methodA(this);
    }
}
