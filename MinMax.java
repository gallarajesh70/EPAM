import java.util.*;
public class MinMax
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
	    int sum=0;
        int a[]=new int[m];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0],max=a[0];
        for(int i=0;i<m;i++){
            if(min>a[i])
                min=a[i];
            if(max<a[i])
                max=a[i];
        }
        System.out.println("Maximum element is:"+max);
                System.out.println("Minimum element is:"+min);
}
	    
	}