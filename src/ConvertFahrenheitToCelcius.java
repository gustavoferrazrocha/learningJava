public class ConvertFahrenheitToCelcius {

		public static void main(String[] args) {
				double fahrenheitTemp = 80.5;
				int result = (int) convert(fahrenheitTemp);

				System.out.println(result);
		}
		public static double convert(double fahrenheitTemp) {
				return (fahrenheitTemp - 32) / 1.8;
		}

}
