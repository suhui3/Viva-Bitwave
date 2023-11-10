import java.util.Scanner;

public class V1_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.next();

        //check whether it is a binary number
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0' || binary.charAt(i) == '1' || binary.charAt(i) == '.') {
                if(i == binary.length()-1)
                    ToDecimal(binary); //proceed to change to decimal
            } else { //if wrong format entered by user, program will end
                System.out.println("You've entered the wrong binary format.");
                break;
            }
        }
    }
    private static void ToDecimal (String binary1) {
        double decimal = 0;
        int point = binary1.indexOf('.');   //find the index of point
        if (point > 1) { //if the binary has point (eg: 1001.11)
            for (int i = 0; i < point; i++) {
                decimal += (binary1.charAt(i) - '0') * Math.pow(2, i);
            }
            int j = -1;
            for (int i = point+1; i < binary1.length() && i> point; i++) {
                decimal += (binary1.charAt(i) - '0') * Math.pow(2, j);
                j--;
            }
        } else { //if binary entered by user is integer only (point = -1)
            for (int i = 0; i < binary1.length(); i++) {
                decimal += (binary1.charAt(i) - '0') * Math.pow(2, i);
            }
        }
        System.out.println("Binary number " + binary1 + " is equivalent to " + decimal + " in decimal");
    }
}

