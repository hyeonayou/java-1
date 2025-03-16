package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;

        ProductOrder[] productOrder = new ProductOrder[]{order1,order2,order3};

        int sum = 0;
        for(ProductOrder productOrders : productOrder)
        {
            System.out.println("상품명: " +productOrders.productName + ", 가격: " + productOrders.price + ", 수량: " + productOrders.quantity);
            sum += productOrders.price * productOrders.quantity;
        }
        System.out.println("총 결제 금액 : " + sum);
    }
}
