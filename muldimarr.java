import java.util.*;
public class muldimarr {

	public static void main(String[] args) {
		int a[][][]=new int[2][2][2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("enter the mark of school "+i+" class "+ j+ " student "+k);
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}