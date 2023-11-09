import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        //the following loop validates if an integer is entered, ensures that the integer must be even and greater than 2
        do {
            System.out.printf("Enter an even integer: ");
            if(input.hasNextInt()){
                num = input.nextInt();
                if(num <= 2){
                    System.out.println("\nPlease enter a number that is greater than 2");
                }
                else if(num % 2 != 0){
                    System.out.println("\nInvalid! Please enter an even integer!");
                }
                else{
                    break;
                }
            }
            else{
                System.out.println("\nInvalid! Please enter an integer.");
            }
            input.nextLine();
            System.out.println();
        }while (true);
        input.close();

        findPrimes(num);

    }

    public static void findPrimes(int num){
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.printf("Prime numbers before %d:%n", num);
        for(int i = 2; i < num; i++){
            if(isPrime(i)) {
                System.out.printf("%d ", i);
                list.add(i);
            }
        }
        System.out.println();
        for(int i = 0; i < list.size(); i++){
            int temp = num - list.get(i);
            for(int j = i; j < list.size(); j++){
                if(temp == list.get(j)){
                    System.out.printf("%d + %d = %d%n", list.get(i), temp, num);
                }
            }
        }
    }

    public static boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

}
