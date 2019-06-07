/**
 * 0.方法调用时的静态分配，也是方法重载原理的体现
 */
public class StaticDispatch {
    // 这儿就体现了实际类型的变化只有在运行期的时候才知道
    static Human woman;
    static void sayHello(Human guy) {
        System.out.println("hello guy");
    }

    static void sayHello(Man guy) {
        System.out.println("hello gentleman");
    }

    static void sayHello(Woman guy) {
        System.out.println("hello lady");
    }

    public static void main(String[] args) {
        // 1.这儿的Human为静态类型，Man为实际类型，静态类型在编译期就可知，而实际类型要在运行期才能够知道
        Human man = new Man();
        woman = new Woman();
        StaticDispatch staticDispatch = new StaticDispatch();
        staticDispatch.sayHello(man);
        staticDispatch.sayHello(woman);
    }

    static abstract class Human {
    }

    static class Man extends Human {
    }

    static class Woman extends Human {
    }
}
