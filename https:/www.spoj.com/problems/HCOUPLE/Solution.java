import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	    int t=in.nextInt();
        int p=1;
	    for(int tc=0;tc<t;tc++){
	        int b=0;
	    String a=in.next();
	    for(int i=0;i<a.length();i++){
	        b+=(int)a.charAt(i);
	    }
	    if (b%3==0 && b!=0){
	        System.out.println("Case "+p+":"+" Yes");
	    }
	    else{
	        System.out.println("Case "+p+":"+" No");
	    }
	    p++;
	}
}

}
