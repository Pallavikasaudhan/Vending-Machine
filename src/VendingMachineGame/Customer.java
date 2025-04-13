package VendingMachineGame;
public class Customer {
	public static void main(String[] args) {
		 Vending v=new Vending();
		 DrinkingType d=v.selectDrink();
		 d.drink();
	 }
}
