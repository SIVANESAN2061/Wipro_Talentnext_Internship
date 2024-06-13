import java.util.Scanner;

class lastSecond{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),last=0,i=0;
        if(a>9 || a<-9){
            while(i!=2){
            last=a%10;
            a/=10;
            i++;
            }
            if(last>=0){
                System.out.println("last second of the num is : "+last);
            }
            else{
                last=-last;
                System.out.println("last second of the num is : "+last);
            }
        }
        else{
            System.err.println("No second digit...!");
        }
        
        
        
    }
}