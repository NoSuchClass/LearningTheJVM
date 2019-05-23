package part2;

import java.util.LinkedList;
import java.util.List;

/**
 * 判断在递归的时候每次方法调用产生的对象是否会被回收
 * 递归时，每次递归动作都会新产生一个栈帧，而栈帧中有局部变量表、操作数栈、动态链接、返回地址等等
 * 这些在递归时都需要进行保存，而如果能够在方法中通过一个栈来实现方法的调用可能会减少挺多资源
 */
public class OOMTest {
    List<Byte[]> list = new LinkedList<>();

    public static void main(String[] args) throws InterruptedException {
        new OOMTest().func();
    }

    public void func() throws InterruptedException {
        list.add(new Byte[1024 * 1024]);
        Thread.sleep(200);
        func();
    }
}
