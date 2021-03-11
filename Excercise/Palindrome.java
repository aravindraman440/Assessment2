package Excercise;

public class Palindrome {
public static void main(String[] args) {
	String text ="MALAYALAM";
	String reverse = new StringBuffer(text).reverse().toString();
	if(text.equals(reverse)) {
		System.out.println("text is palindrome");
		}
	
	else
	{
		System.out.println("text not palindrome");
	}
	}
}
