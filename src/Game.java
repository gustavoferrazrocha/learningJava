import java.util.Random;
import java.util.Scanner;

public class Game {

		public static void main(String[] args) {
				int randomNumber = new Random().nextInt(100);
				Scanner leitura = new Scanner(System.in);

				System.out.println("Você tem 5 tentativas para acertar o numero que estou pensando: ");

				for (int quantityOfAttempts = 1; quantityOfAttempts <= 5 ; quantityOfAttempts++) {
						int value = leitura.nextInt();

						if(value == randomNumber) {
								System.out.println("Parabens você acertou o numero que esta pensando era: " + randomNumber);
								break;
						} else {
								System.out.println("o numero esta incorreto");
						}

						if (quantityOfAttempts == 5) {
								System.out.println("Você errou todas as tentativas o valor correto era: " + randomNumber);
						}
				}
		}
}
