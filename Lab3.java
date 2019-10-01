import java.util.Scanner;
public class Lab3 {
  public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = input.nextLine();

        System.out.print("number of vowels in the string: " + count_Vowels(str)+"\n");
    }
 public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }

            else {
            	
            }
        }
        return count;
    }
}