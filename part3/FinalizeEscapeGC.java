package part3;

/**
 * 对象如果是被可达性算法判定为不可达之后，会被进行两次标记过程，如果没有重写finalize方法
 * 就会被虚拟机直接回收
 */
public class FinalizeEscapeGC {
    public static FinalizeEscapeGC instance = null;

    public static void main(String[] args) throws InterruptedException {
        instance = new FinalizeEscapeGC();

        instance = null;
        System.gc();
        Thread.sleep(1000);
        if (instance == null) {
            System.out.println("no,i am dead :<");
        } else {
            instance.isAlive();        //在没有重写finalize方法时，是会直接去世的
        }

        instance = null;
        System.gc();
        Thread.sleep(1000);
        if (instance == null) {
            System.out.println("no,i am dead :<");
        } else {
            instance.isAlive();
        }

    }

    public void isAlive() {
        System.out.println("yes,i am still alive :>");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize methode executed");
        instance = this;
    }
}