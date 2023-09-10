import java.util.Scanner;

public class OutroLoop {

		public static void main(String[] args) {
				Scanner leitura = new Scanner(System.in);
				double media = 0;
				double nota = 0;
				int totalDeNotas = 0;



				while (nota != -1) {
						System.out.println("Digite sua nota para o filme ou -1 para encerrar ");
						nota = leitura.nextDouble();
						if(nota != -1) {
								media += nota;
								totalDeNotas++;
						}
				}
				System.out.println(media);
				System.out.println("A media da nota dos filmes que avaliou é: " + media / totalDeNotas);
		}

}
