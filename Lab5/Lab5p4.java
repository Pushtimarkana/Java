import java.util.*;
class Bank_Account{
	int accountNo;
	String userName;
	String email;
	String accountType;
	double accountBalance;

	public void getAccountDetails(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter accountNo:");
		 accountNo=sc.nextInt();
		sc.nextLine();
		System.out.println("enter username:");
		 userName=sc.nextLine(); 
		System.out.println("enter email:");
		 email=sc.nextLine(); 
		 System.out.println("enter accountType:");
		 accountType=sc.nextLine(); 
		 System.out.println("enter accountBalance:");
		 accountBalance=sc.nextDouble();  


	}
	public void displayAccountDetails(){
		System.out.println("accountNo="+accountNo);
		System.out.println("username="+userName);
		System.out.println("email="+email);
		System.out.println("accountType="+accountType);
		System.out.println("accountBalance="+accountBalance);
	}
}
public class Lab5p4{
	public static void main(String[] args) {
		Bank_Account b1=new Bank_Account();
		b1.getAccountDetails();
		b1.displayAccountDetails();
	}
}