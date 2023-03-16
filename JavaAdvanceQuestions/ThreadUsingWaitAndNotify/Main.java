public class Main {
    public static void main(String[] args) {
        ThreadExample example=new ThreadExample();
        Thread t1=new Thread(() -> example.method1());
        Thread t2=new Thread(() -> example.method2());
        t1.start();
        t2.start();


    }
}