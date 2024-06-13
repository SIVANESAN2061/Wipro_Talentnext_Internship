//Jagged 3D Array

import java.util.*;
class jagged3d{
public static void main(String Args[]){
int a[][][] = new int[2][][];
Scanner sc = new Scanner(System.in);

a[0] = new int[3][];
a[1] = new int[2][];

a[0][0] = new int[2];
a[0][1] = new int[3];
a[0][2] = new int[2];

a[1][0] = new int[4];
a[1][1] = new int[2];

for (int i =0; i<=a.length-1; i++){
for (int j =0; j<=a[i].length-1; j++){
for (int k =0; k<=a[i][j].length-1; k++){
System.out.print("Enter the mark of School "+i+" Class "+j+" Student "+k+" :");
a[i][j][k] = sc.nextInt();
}
}
}

for (int i =0; i<=a.length-1; i++){
for (int j =0; j<=a[i].length-1; j++){
for (int k =0; k<=a[i][j].length-1; k++){
System.out.print(a[i][j][k]+ " ");
}
System.out.println();
}
System.out.println();
}


}
}