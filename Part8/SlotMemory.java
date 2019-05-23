package Part8;

public class SlotMemory {
    public static void main(String[] args) {
        {
            byte[] bytes = new byte[1024 * 1024 * 1024];
        }
        System.gc();
    }
}
