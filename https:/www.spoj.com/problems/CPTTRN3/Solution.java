import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int t=in.nextInt();
	    for(int tc=0;tc<t;tc++){
	    int m=in.nextInt();
	    int n=in.nextInt();
	    for(int j=0;j<n;j++){
	    System.out.print("***");}
	    System.out.print("*");
	    System.out.println("");
	    
	    for(int i=0;i<m;i++){
	        
	      for(int j=0;j<n;j++){
		System.out.print("*..");}
		System.out.print("*");
		 System.out.println("");
		 
		  for(int j=0;j<n;j++){
		System.out.print("*..");}
		System.out.print("*");
		 System.out.println("");
		 
		  for(int j=0;j<n;j++){
        System.out.print("***");}
        System.out.print("*");
         System.out.println("");
         
	    } 
	    System.out.println("");
	}
}

}
