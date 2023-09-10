public class Conditional {

		public static void main(String[] args) {
				int ano = 1990;
				boolean incluidoNoPlano = true;
				double notaFile = 8.2;
				String tipoPlano = "plus";

				if (ano >= 2022) {
						System.out.println("Lançamento que os clientes estao curtindo");
				} else {
						System.out.println("Filme retro que vale a pena assistir");
				}

				if (incluidoNoPlano && tipoPlano.equals("plus")) {
						System.out.println("ENTROU");
				} else {
						System.out.println("pague o aluguel");
				}
		}
}
