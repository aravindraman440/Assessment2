package Excercise;

public class ReverseString {
public static void main(String[] args) {
	String reverse ="Test Leaf";
	int length = reverse.length();
	System.out.println(length);
	
	for ( int i =length-1; i >= 0; i--) {
		char c = reverse.charAt(i);
	System.out.print(c);
	}
}
}
