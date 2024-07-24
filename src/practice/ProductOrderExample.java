package practice;

public class ProductOrderExample {

	public static void main(String[] args) {
		ProductOrder[] orders = new ProductOrder[3];
		
		ProductOrder productOrder1 = new ProductOrder();
		productOrder1.productName = "두부";
		productOrder1.price = 2000;
		productOrder1.quantity = 2;
		
		ProductOrder productOrder2 = new ProductOrder();
		productOrder2.productName = "김치";
		productOrder2.price = 5000;
		productOrder2.quantity = 1;
		
		ProductOrder productOrder3 = new ProductOrder();
		productOrder3.productName = "콜라";
		productOrder3.price = 1500;
		productOrder3.quantity = 2;
		
		orders[0] = productOrder1;
		orders[1] = productOrder2;
		orders[2] = productOrder3;
		int totalPrice = 0;
		for(int i = 0; i < orders.length; i++) {
			
			System.out.println(orders[i].productName+orders[i].price+orders[i].quantity);
			totalPrice += orders[i].price*orders[i].quantity;
		}
		System.out.println(totalPrice);
		

	}

}
