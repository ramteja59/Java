import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1 = input.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = input.nextInt();
        System.out.println("Enter the 3rd number:");
        int num3 = input.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("The sum of the three numbers is " + sum);
    }
}

