
import java.util.Scanner;

class ReverseNum{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check palindrome: ");
        int a=sc.nextInt(),tmp=a,rev=0,rem=0;
        if(a<0){
            tmp=-a;
        }
        while(tmp!=0){
            rem=tmp%10;
            rev=rev*10+rem;
            tmp/=10;
        }
        if(a<0){
            rev=-rev;
        }
        System.out.println("The Reversed Number is : "+rev);
    }
}