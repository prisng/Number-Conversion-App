package appOne;


/**
 * Binary android app conversions
 * September 28, 2017
 * @author monsi
 *
 */
public class ConversionTester {

	public static void main(String[] args) {
		Conversion tester = new Conversion();
//		String binary = tester.convertDecimalToBinary(-20);
//		System.out.println("B: " + binary);
//				
//		double decimal = tester.binaryToDecimal(binary); 
//		System.out.println(decimal);
		System.out.println(tester.convertDecimalToBinary(-8));
		String binary = "1011"; // -5
		System.out.println("Binary to decimal :" + tester.binaryToDecimal(binary));
	}
}