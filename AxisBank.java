package week3.day1;


public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("The person can deposit a min of 50k without commission online per day");
	}
	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.savings();
		bank.fixed();
		bank.deposit();
		new BankInfo().deposit();
	}
	

}
