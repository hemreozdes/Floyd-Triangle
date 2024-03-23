import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i,j,N,num=1;
	    System.out.println("Enter step number= ");
	    Scanner sc= new Scanner(System.in);
	    N=sc.nextInt();
	    for(i=1;i<=N;i++){       
	        for(j=0;j<i;j++){    
	            System.out.printf("%d ",num);
	            num++;           
	        }
	        System.out.printf("\n");
	    }
	}
}