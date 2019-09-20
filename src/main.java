import java.util.Scanner;
public class main {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int numGuess = input.nextInt();
        boolean check = true;
        int squareRoot = (int) Math.sqrt(numGuess);
        if (numGuess < 2) {
            check = false;
        }
        for (int i = 2; i <= squareRoot; i++){
            if (numGuess % i == 0){
                check = false;
                break;
            }else {
                check = true;
            }
        }
        if (check){
            System.out.println(numGuess + " is a prime number");
        }else {
            System.out.println(numGuess + " is NOT a prime number");
        }
    }
}
