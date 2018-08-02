import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.util.Random;

/**
 * "C:\Program Files\Java\jdk-9.0.4\bin\java" "-javaagent:E:\IDEA\IntelliJ IDEA 2017.3.4\lib\idea_rt.jar=50483:E:\IDEA\IntelliJ IDEA 2017.3.4\bin" -Dfile.encoding=UTF-8 -classpath F:\github\JavaHomeWork\out\production\java test1
 * height:1080width:1920
 * Mouse Controller start
 *
 * @author sxc 石新春
 * @Create date 2007-11-6
 */
public class test1 implements Runnable {
    private Dimension dim;
    private Random rand;
    private Robot robot;
    private volatile boolean stop = false;

    public test1() {
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("height:" + dim.height + " width:" + dim.width);
        rand = new Random();
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        while (!stop) {
            int x = rand.nextInt(dim.width);
            int y = rand.nextInt(dim.height);
            robot.mouseMove(x, y);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public synchronized void stop() {
        stop = true;
    }

    public static void main(String[] args) {
        test1 mc = new test1();
        Thread mcThread = new Thread(mc);
        System.out.println("Mouse Controller start");
        mcThread.start();
        try {
            System.out.println("名称： " + Thread.currentThread().getName());
            Thread.sleep(60000);//主线程睡眠一分钟
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        mc.stop();
        System.out.println("Mouse Controller stoped");
    }
}