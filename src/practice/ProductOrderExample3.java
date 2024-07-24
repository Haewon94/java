package practice;

import java.util.Scanner;

public class ProductOrderExample3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력할 주문의 개수를 입력하세요:");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		ProductOrder[] orders = new ProductOrder[n];
		for(int i=0; i<orders.length; i++) {
			System.out.println((i+1)+"번째 주문 정보를 입력하세요.");
			System.out.print("상품명: ");
			String productName = scanner.nextLine();
			System.out.print("가격: ");
			int price = scanner.nextInt();
			System.out.print("수량: ");
			int quantity = scanner.nextInt();
			scanner.nextLine();
			
			orders[i] = createOrder(productName, price, quantity);
		}
		
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
