package line;
import java.util.Scanner;
public class LineComp {
	public static void main(String[] args){
		  Scanner sc =new Scanner(System.in);
		  System.out.println("enter x co-ordinate 1st points");
		  int x1=sc.nextInt();
		  System.out.println("enter x co-ordinate 2nd points");
		  int x2=sc.nextInt();
		  System.out.println("enter y co-ordinate 1st points");
		  int y1=sc.nextInt();
		  System.out.println("enter y co-ordinate 2nd points");
		  int y2=sc.nextInt();
		  Double length=Math.sqrt((Math.pow(x2-x1,2))+Math.pow(y2-y1,2));
		  System.out.println("length="+length);
		  
		  System.out.println("enter x co-ordinate 1st points");
		  int x3=sc.nextInt();
		  System.out.println("enter x co-ordinate 2nd points");
		  int x4=sc.nextInt();
		  System.out.println("enter y co-ordinate 1st points");
		  int y3=sc.nextInt();
		  System.out.println("enter y co-ordinate 2nd points");
		  int y4=sc.nextInt();

		  Double length2=Math.sqrt((Math.pow(x4-x3,2))+Math.pow(y4-y3,2));
		  System.out.println("length="+length2);
		  int c=length.compareTo(length2);
		  if(c==0) {
			  System.out.println("Two lines are equal");
		  }
		  else if(c>0) {
			  System.out.println(" line 1 are greater than line 2");
		  }
	          else {
			    	 System.out.println("Line 2 is greater than line 1");
		      }
	}
}
