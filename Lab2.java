import java.util.Scanner;
public class Lab2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Input String: ");
String str = input.nextLine();
        // give count value of string length
double count = 0;
for (int i = 0; i < str.length(); i++) {
count++;
}
if (count % 2 == 0) {
// Even Numbers
count = count / 2;
int c = (int) Math.round(count);
char middle = str.charAt(c);
int b = c - 1;
char middle1 = str.charAt(b);
System.out.print("Middle Chars: " + middle1);
  System.out.println(middle);
        } else {
            // Odd Numbers
count = count / 2;
  count += 0.5;
int c = (int) Math.round(count);
            c--;
 char middle = str.charAt(c);
  System.out.println("Middle Char: " + middle);
 }
        //System.out.println("count:" + count);
 }

}
