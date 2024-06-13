
import java.util.Scanner;

class LastDigitCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int a=sc.nextInt();
        System.out.println("Enter a number : ");
        int b=sc.nextInt();
        int l1,l2;
        if(a>=0){
            l1=a%10;
        }
        else{
            l1=-(a%10);
        }

        if(b>=0){
            l2=b%10;
        }
        else{
            l2=-(b%10);
        }

        if(l1==l2)
            System.out.println("True");
        else
            System.out.println("False");
    }
}