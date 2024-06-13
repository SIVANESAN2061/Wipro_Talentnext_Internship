
import java.util.Scanner;

class ToTransformAlphabet{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character :");
        char a = sc.next().charAt(0),b;
        if(Character.isLowerCase(a)){
            b=Character.toUpperCase(a);
            System.out.println("Transformed : " + b);
        }
        else{
            b=Character.toLowerCase(a);
            System.out.print("Transformed : " + b);
        }
    }
}