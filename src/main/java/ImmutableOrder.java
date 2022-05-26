import java.util.Random;

public class ImmutableOrder {
    private static final int MIN_WIDTH = 10;
    private static final int MAX_WIDTH = 1000;
    private static final int MIN_LENGTH = 10;
    private static final int MAX_LENGTH = 1000;
    private static final int MIN_PRICE = 1000000;
    private static final int MAX_PRICE = 2000000;

    private final int id;
    private final int width;
    private final int length;
    private final int price;

    public ImmutableOrder(int id) {
        this.id = id;
        Random random = new Random();
        this.width = random.nextInt(MAX_WIDTH) + MIN_WIDTH;
        this.length = random.nextInt(MAX_LENGTH) + MIN_LENGTH;
        this.price = random.nextInt(MAX_PRICE) + MIN_PRICE;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Сделка " + id;
    }
}
