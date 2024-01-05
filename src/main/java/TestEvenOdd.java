public class TestEvenOdd {

    private static int count = 1;

    private static Object object = new Object();

    public static void main(String[] args) throws Exception {
        TestEvenOdd testEvenOdd = new TestEvenOdd();
        Thread t1 = new Thread(() -> testEvenOdd.print(),"odd");
        Thread t2 = new Thread(() -> testEvenOdd.print(), "even");

        t1.start();
        t2.start();


        System.out.println("main thread ended");
    }



    public  void print() {
        while (count <= 100) {
            if (count % 2 != 0 && "odd".equalsIgnoreCase(Thread.currentThread().getName())) {
                synchronized (object) {
                    System.out.println("number ==> " + count + "  " + Thread.currentThread().getName());
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
            }

            if (count % 2 == 0 && "even".equalsIgnoreCase(Thread.currentThread().getName())) {
                synchronized (object) {
                    System.out.println("number ==> " + count + "  " + Thread.currentThread().getName());
                    count++;
                    object.notify();
                }
            }
        }
    }
}
