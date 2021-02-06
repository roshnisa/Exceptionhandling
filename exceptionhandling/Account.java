package exceptionhandling;

public class Account {
private String name;
private double acno;
private double balance;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getAcno() {
	return acno;
}
public void setAcno(double acno) {
	this.acno = acno;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public void deposite (double d) {
	balance =balance +d;
	System.out.println("deposited sucessfully  = "+getBalance());
}
public void withdrawal (double w){
	
		if(500>balance-w){
			try{
				double e= balance-w;
				Insufficientbalance i =new Insufficientbalance();
				throw i;
			
		}catch(Insufficientbalance e){
			//todo;handle exception
			System.out.println(e.getMessage());
		}
		}
		else{
			balance =balance-w;
			System.out.println("withdrawal sucessed  = "+w);
			System.out.println("balance available = "+getBalance());
			
		
	} 
		
			
			
		}
	}
	

