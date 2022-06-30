

/*
	This class is used to create account object and execute methods on account objects
 */
public class AccountService {
	public static void main(String[] args) {
		AccountService service = new AccountService();
		Account account = service.createAccount(100,"active");
		System.out.println(service.getAccountDetails(account));
	}
	/*
	 * This method creates and returns an account object based on the parameters supplied
	 */
	public Account createAccount(double balance, String status){

		Account account = new Account(balance,status);

		return account;
	}

	/*
	 * This method deposits the parameter amount in the account passed as parameter
	 */
	public boolean depositAmountInAccount(Account account, double amount){
		boolean decision=false;
		if (account.getStatus()=="active") {
			account.setBalance(amount + account.getBalance());
			decision=true;
		}
		return decision;
	}

	/*
	 * This method gets the account details for the  account passed as parameter
	 */
	public String getAccountDetails(Account account){

		return account.getAccountDetails();
	}


}
