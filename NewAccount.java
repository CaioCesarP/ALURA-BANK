import java.util.Scanner;

/**
 * NewAccount
 */
public class NewAccount {

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void starterAccount(Account account) {
		System.out.println(
				String.format(
						"***********************%nDados do cliente:%n%nNome: %s%nTipo da conta: %s%nSaldo: R$ %.2f%n***********************",
						account.getName(), account.getType(), account.getBalance()));
	}

	public static void operations() {
		System.out.println(
				String.format(
						"%n%nOperações disponíveis:%n%n0- Dados da conta%n1- Consultar saldos%n2- Receber valor%n3- Transferir valor%n4- Sair  Digite a opção desejada:"));
	}

	public static void main(String[] args) {

		Account firsAccount = new Account("Jacqueline Oliveira", "Corrente", 2500.00);
		Account randomAccount = new Account("Caio César", "Corrente", 0.00);

		int operation = 0;
		double amount = 0;

		try (Scanner read = new Scanner(System.in)) {
			while (operation != 4) {
				clearScreen();

				switch (operation) {
					case 0:
						starterAccount(firsAccount);
						break;

					case 1:
						System.out.println(String.format("Saldo: R$ %.2f", firsAccount.getBalance()));
						break;

					case 2:
						System.out.println("Informe o valor a receber:");
						amount = read.nextInt();
						firsAccount.deposit(amount);
						break;

					case 3:
						System.out.println("Informe o valor que deseja sacar:");
						amount = read.nextInt();
						firsAccount.withdraw(amount);
						break;

					case 4:
						return;

					default:
						System.out.println("Opção inválida.");
						break;
				}

				operations();
				operation = read.nextInt();
			}
		} catch (Exception error) {
			System.err.println(error.getMessage());
		}

	}

}