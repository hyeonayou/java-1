package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {

        ProductOrder order1 = createOrder("두부", 2000, 2);
        ProductOrder order2 = createOrder("김치", 5000, 1);
        ProductOrder order3 = createOrder("콜라", 1500, 2);

        ProductOrder[] productOrders = {order1, order2, order3};

        printOrders(productOrders);
        int sum = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + sum);
    }

    static ProductOrder createOrder(String productName, int price, int quantity)
    {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }
    static void printOrders(ProductOrder[] productOrders)
    {
        for(ProductOrder productOrders1 : productOrders)
        {
            System.out.println("상품명: " + productOrders1.productName + ", 가격 : " + productOrders1.price + ", 수량 :" + productOrders1.quantity);
        }

    }
    static int getTotalAmount(ProductOrder[] orders)
    {
        int sum = 0;
        for(ProductOrder productOrders1 : orders)
        {
            sum += productOrders1.price * productOrders1.quantity;
        }
        return sum;
    }
}
