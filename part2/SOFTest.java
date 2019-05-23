package part2;

/*
VM Args:-Xss128k
 */
public class SOFTest {
    public void func() {
        func();
    }

    public static void main(String[] args) {
        new SOFTest().func();
    }
}
