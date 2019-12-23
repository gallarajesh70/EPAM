import java.io.*;
import java.util.*;
public class ascii {
public static void main(String []args) {
Scanner sc=new Scanner(System.in);
int m,i;
System.out.println("Enter size of array:");
m=sc.nextInt();
int[] a=new int[m];
System.out.println("Enter elements in the array");
for(i=0;i<m;i++) {
a[i]=sc.nextInt();
}
for(i=0;i<m;i++) {
System.out.println((char)a[i]);
}
}
}