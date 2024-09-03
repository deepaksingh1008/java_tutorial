import java.util.Scanner;

public class MinimunOfTwoNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int number1 = input.nextInt();
        System.out.print("Enter the second Number : ");
        int number2 = input.nextInt();
        int minimun = number1>number2 ? number2:number1;
        System.out.println("Minimum Number is : "+minimun);
    }
}
