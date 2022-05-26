import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final int ORDERS_COUNT = 100;

    public static void main(String[] args) {
        final int honestPrice = userInputPrice();
        final List<ImmutableOrder> orders = getOrdersList();
        orders.forEach((order) ->
                        System.out.println(order + (isHonestOrder(order, honestPrice) ? " - честная" : " - не честная")));
    }

    public static int userInputPrice() {
        while (true) {
            System.out.print("Введите целое число - стоимость за квадратный метр: ");
            try {
                return Integer.parseInt(new Scanner(System.in).nextLine());
            } catch (Exception e) {
                System.out.println("Введено не корректное значение. Попробуйте снова");
            }
        }
    }

    public static List<ImmutableOrder> getOrdersList() {
        final List<ImmutableOrder> orders = new ArrayList<>();
        for (int i = 0; i < ORDERS_COUNT; i++) {
            orders.add(new ImmutableOrder(i + 1));
        }
        return orders;
    }

//    чистая функция
    public static int getPriceForSquareMeter(ImmutableOrder order) {
        return order.getPrice() / (order.getWidth() * order.getLength());
    }

//    чистая функция
    public static boolean isHonestOrder(ImmutableOrder order, int honestPrice) {
        return getPriceForSquareMeter(order) >= honestPrice;
    }
}
