import java.util.Scanner;
public class binaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal numer: ");
        int number = sc.nextInt();
        
        System.out.println("The binary is " + Integer.toBinaryString(number));
    }
}
