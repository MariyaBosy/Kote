import java.util.Scanner;
public class Lab2 {
public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Input String");
	String str = input.nextLine();
	int count = 0;
			for(int i =0; i < str.length(); i++) {
				count++;
			}
	char m = str.charAt(count/2);
	if(count%)
	//System.out.println(count);
}
}
