import java.util.Scanner;

class lastDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),last;
        if(a>=0){
            last=a%10;
        }
        else{
            last=-(a%10);
        }
        
        System.out.println("last digit of the num is : "+last);
    }
}