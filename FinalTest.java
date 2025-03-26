package wk9;

public class FinalTest {

	public static void main(String[] args) {
		final char[] vowels = new char[] { 'x', 'y', 'z'};
		System.out.println("Анхны үүсгэсэн тэмдэгтүүд: ");
		for (char i: vowels) {
			System.out.println(i);
		}
		vowels[0]='z';
		System.out.println("Массивын эхний элементийг өөрчилсний дараа: ");
		for (int i=0; i<3; i++) {
			System.out.println(vowels[i] + " ");
		}

	}

}
