import java.util.Random;

public class SizeRandomFiller {
    public static final int MAX_VALUE = 10;
    public static Random random = new Random();

    public static int randomSize() {
        int size = random.nextInt(MAX_VALUE);
        return size;
    }
}
