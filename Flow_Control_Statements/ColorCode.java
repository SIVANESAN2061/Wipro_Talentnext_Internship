
import java.util.Scanner;

class ColorCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a colorcode(r/b/g/o/y/w): ");
        char c=sc.next().toLowerCase().charAt(0);
        switch (c) {
            case 'r':
                System.out.println("Red");
                break;
            case 'g':
                System.out.println("Green");
                break;
            case 'b':
                System.out.println("Blue");
                break;
            case 'o':
                System.out.println("Orange");
                break;
            case 'y':
                System.out.println("Yellow");
                break;
            case 'w':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code...!");
        }
    }
}