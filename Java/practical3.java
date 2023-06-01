import java.util.Scanner;

public class practical3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.printf("Result: %d", factoricalFinder(number));
    }

    public static int factoricalFinder(int number){
        if(number < 2 ){
            return number;
        }
        return number*factoricalFinder(number-1);
    }
}




