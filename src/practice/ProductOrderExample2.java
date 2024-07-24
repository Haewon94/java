package practice;



public class ProductOrderExample2 {

	public static void main(String[] args) {
		
		ProductOrder[] orders = new ProductOrder[3];
		
		orders[0] = createOrder("두부", 2000, 2);
		orders[1] = createOrder("김치", 5000, 1);
		orders[2] = createOrder("콜라", 1500, 2);
		printOrders(orders);
		getTotalPrice(orders);
	}
	
	static ProductOrder createOrder(String productName, int price, int quantity) {
		ProductOrder order = new ProductOrder();
		order.productName = productName;
		order.price = price;
		order.quantity = quantity;
		
		return order;
	}
	
	static void printOrders(ProductOrder[] orders) {
		for(int i = 0; i<3; i++) {
			System.out.println("상품명: "+orders[i].productName+" 가격: "+orders[i].price+" 수량: "+orders[i].quantity);
		}
	}
	
	static void getTotalPrice(ProductOrder[] orders) {
		int totalPrice = 0;
		for(int i = 0; i<3; i++) {
			totalPrice += orders[i].price*orders[i].quantity;
		}
		System.out.println("총가격:"+totalPrice);
	}
	
}
