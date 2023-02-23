import java.util.Scanner;

public class dowhile1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a positive integer:");
            num = input.nextInt();
        } while (num <= 0);
        System.out.println("You entered " + num);
    }
}
