import java.util.Scanner;
public class Bruh {

 public static void main (String [] args) {
	 Scanner bruh = new Scanner(System.in);
	 System.out.println("Input First Number");
	 float a = bruh.nextInt();
	 System.out.println("Input Second Number");
	 float b = bruh.nextInt();
	 System.out.println("Input Third Number");
	 float c = bruh.nextInt();
	 
	 //math
	 float sum = a+b+c;
	 float avg = sum/3;
	 System.out.println("The Average Value Is " + avg);
	 
 }
}
