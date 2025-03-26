package wk9;
import java.util.Scanner;
public class AssertDemo2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		assert x>=0: "x<0 Ó©.Ñ…. Ñ…-Ð¸Ð¹Ð½ ÑƒÑ‚Ð³Ð° 0-Ñ� Ð±Ð°Ð³Ð° Ð±Ð°Ð¹Ð½Ð°!";

	}

}
