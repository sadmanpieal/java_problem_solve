import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner leap = new Scanner(System.in);
        System.out.println("Enter a number");
        int x= leap.nextInt();
        if(isLeap( x)){
            System.out.println("It's a leap year");
        }
        else {
            System.out.println("It's not a leap year");
        }
        leap.close();
    }
    public static boolean isLeap(int x){
        if (x % 400 == 0){
            return true;
        } else if (x % 100==0) {
            return false;
        } else if (x % 4==0) {
            return true;
            
        }else {
            return false;
        }
    }
}
