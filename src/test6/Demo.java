package test6;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new AddStrategy());
        System.out.println(context.calculate(10, 5));
    }
}