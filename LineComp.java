package line;
import java.util.Scanner;
public class LineComp {
	
	public Double calculateLength() { 
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
       return length;
	  }
	
	private static void checkequality(Double length1, Double length2) {
		if(length1.equals(length2)) {
			 System.out.println("line1 and line2 is equal");
		}
		else{
			System.out.println("line1 ana line2 is not equal");
			}
		}
	
	private static void compareTo(Double length1, Double length2) {
		if(length1.compareTo(length2)>0) {
			 System.out.println("line 1 is greater");
		}
		else if(length1.compareTo(length2)<0) {
				 System.out.println("line 2 is greater");
			}
		else {
			System.out.println("line 1 and line 2 are equal");
		}
	}

	
	public static void main(String[] args){
		 LineComp calculate1=new  LineComp();
		 Double length1=calculate1. calculateLength();
		 LineComp calculate2=new  LineComp();
		 Double length2=calculate2.calculateLength();
		 checkequality(length1,length2);
		 compareTo(length1,length2);
		  
		 
      }
	
}
