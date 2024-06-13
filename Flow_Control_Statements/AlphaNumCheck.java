
import java.util.Scanner;

class AlphaNumCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char a = sc.next().charAt(0);
        if(a>=65 && a<=90 || a>=97 && a<=122){
            System.out.println("Alphabet!!");
        }
        else if(a>=48 && a<=57){
            System.out.println("Digit!!");
        }
        else{
            System.out.println("Special Character!!");
        }
    }
}