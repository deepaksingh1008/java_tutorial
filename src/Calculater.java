import java.util.Scanner;

public class Calculater {


    public static void main(String[] args){
        boolean flag=true;
        Scanner input = new Scanner(System.in);
        while(flag){
            System.out.println("1.Add +");
            System.out.println("2.Sub -");
            System.out.println("3.Multiply *");
            System.out.println("4.Divide /");
            System.out.print("Enter the operation number ");
            int val = input.nextInt();
            System.out.println("Enter the two value");
            int number1,number2;
            int ans;
            number1 = input.nextInt();
            number2 = input.nextInt();
            switch (val){

                case 1:
                     ans = number1+number2;
                    System.out.println("The Sum is : "+ans);
                    break;
                case 2:
                     ans = number1-number2;
                    System.out.println("The Subtraction is : "+ans);
                    break;
                case 3:
                     ans = number1*number2;
                    System.out.println("The multiply is : "+ans);
                    break;
                case 4:
                     ans = number1/number2;
                    System.out.println("The divide is : "+ans);
                    break;
                default:
                    System.out.println("Enter the Correct operation Number");

            }
            System.out.print("Continue this Process write yes or no ");
            String s1 = input.next();
            flag = s1.equalsIgnoreCase("yes");
        }
    }

}
