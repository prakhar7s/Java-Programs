import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack{

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		String s = in.next();
		int strLength = s.length();
		for(char ch: s.toCharArray()){
			stack.push(ch);
		} 

		String reversedString = "";

		for(int i=0; i<strLength; i++){
			reversedString+=stack.pop();
		}

		System.out.println(reversedString);
	}
}
