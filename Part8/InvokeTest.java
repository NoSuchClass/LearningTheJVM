package Part8;

public class InvokeTest extends Object {
    InvokeTest() {
        super();
    }

    private void func1() {
        System.out.println(1);
    }

    private static void fun2() {
        System.out.println(2);
    }

    public static void main(String[] args) {
        fun2();
        new InvokeTest().func1();
    }
}
