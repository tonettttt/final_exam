Create a Main.java

public class Main {
	public static void main(String[] args) {
		Customer customer;
		RegularCustomer regularCustomer = new RegularCustomer("net", 1000);
		SeniorCustomer seniorCustomer = new SeniorCustomer("yang", 1000);

		customer = regularCustomer;
		System.out.println(customer.getName()+" " +customer.calculateBill());

		customer = seniorCustomer;
		System.out.println(customer.getName()+" "+customer.calculateBill());
	}
}
