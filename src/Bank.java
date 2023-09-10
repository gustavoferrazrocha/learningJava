import java.util.Scanner;

public class Bank {

		public static void main(String[] args) {
				String name = "Gustavo";
				String accountType = "Conta Corrente";
				Scanner readingInput = new Scanner(System.in);
				double money = 1000;
				int exitButton = 4;


				String initialMessage = renderInitialMessage(name, accountType, money);
				System.out.println(initialMessage);

				int valueInput = 0;

				while (valueInput != exitButton) {
						System.out.println(renderOptionsMenu());
						valueInput = readingInput.nextInt();

						switch (valueInput) {
								case 1:
										getMoneyValue(money);
										break;
								case 2:
										System.out.println("Escolheu 2");
										break;
								case 3:
										System.out.println("Escolheu 3");
										break;
						}
				}

		}

		public static String renderInitialMessage(String name, String accountType, double money) {

				StringBuilder message = new StringBuilder();

				message.append("**************************\n");
				message.append("Dados Iniciais do cliente\n");
				message.append("Nome: ").append(name).append("\n");
				message.append("Tipo de conta: ").append(accountType).append("\n");
				message.append("Saldo: ").append(money).append("\n");
				message.append("**************************\n");

				return message.toString();
		}

		public static String renderOptionsMenu() {
				StringBuilder message = new StringBuilder();

				message.append("Opções\n");
				message.append("1- Consultar saldos\n");
				message.append("2- Realizar transferencia\n");
				message.append("3- Realizar deposito\n");
				message.append("4- Sair\n\n");
				message.append("Digite a opção desejada: \n");

				return message.toString();
		}

		public static void getMoneyValue(double money) {
				System.out.println("Seu saldo atual é: " + money + "\n");
		}
}
