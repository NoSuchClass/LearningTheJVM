package part2;

import java.util.ArrayList;
import java.util.List;

/*
运行时常量池已迁移到堆中，并且8中无永久代，因此不容易产生方法区溢出
-XX:-UseGCOverheadLimit -Xms10m -Xmx10m
第一个是关闭gc开销限制的检查
在java8中可以通过生成大量动态代理对象来实现
 */
public class RunTimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 1;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
