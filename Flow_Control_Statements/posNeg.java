
import java.util.Scanner;

class posNeg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=sc.nextInt();
        if(a>=0)
            System.out.println("Positive Number Entered...!");
        else
            System.out.println("Negative Number Entered...!");    
    }

}