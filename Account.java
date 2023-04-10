/**
 * Account
 */
public class Account {
	private String name;
	private String type;
	private double balance;

	public Account(String name, String type, double balance) {
		this.name = name;
		this.type = type;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		if (this.balance - amount < 0) {
			System.out.println(String.format("Saldo insuficiente. Saldo atual: R$ %.2f", this.getBalance()));
			return;
		}

		this.balance -= amount;
		System.out.println(String.format("Saque feito com sucesso. Saldo atual: R$ %.2f", this.getBalance()));
	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println(String.format("Deposito feito com sucesso. Saldo atual: R$ %.2f", this.getBalance()));
	}

	public void transfer(double amount, Account account) {
		if (this.balance - amount < 0) {
			System.out.println(String.format("Saldo insuficiente. Saldo atual: R$ %.2f", this.getBalance()));
			return;
		}

		this.withdraw(amount);
		account.deposit(amount);
		System.out.println(String.format("Transferência feita com sucesso. Saldo atual: R$ %.2f", this.getBalance()));
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}