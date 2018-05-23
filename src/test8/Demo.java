package test8;

public class Demo{
    public static void main(String[] args) throws InterruptedException {
        ThreadOne threadOne= new ThreadOne();
        ThreadTwo threadTwo= new ThreadTwo();
        Thread thread1=new Thread(threadOne,"线程一");
        Thread thread2=new Thread(threadTwo,"线程二");
        thread1.start();
        thread2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"  "+i);
            Thread.sleep(10);
            if (i==5){
                thread1.join();
            }
        }
    }
}
