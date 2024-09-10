import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = num.nextInt();
        if(isPalindrome(x)){
            System.out.println(x+ "Palindrome Number");
        }else{
            System.out.println("not palindrome");
        }
    }
    public static boolean isPalindrome(int x){
        int original_number = x;
        int reversed =0;
        while (x !=0){
            int digit = x % 10;
            reversed = reversed *10+digit;
            x =x/10;


        }
        return original_number == reversed;
    }
}
