package line;
import java.util.Scanner;
public class LineComp {
	public static void main(String[] args){
		  Scanner sc =new Scanner(System.in);
		  System.out.println("enter 4 no");
		   int x1=sc.nextInt();
		   int x2=sc.nextInt();
		   int y1=sc.nextInt();
		   int y2=sc.nextInt();
		 double length=Math.sqrt((Math.pow(x2-x1,2))+Math.pow(y2-y1,2));
		   System.out.println("length="+length);
		  System.out.println("enter next line 4 no");
		    int x3=sc.nextInt();
		   int x4=sc.nextInt();
		   int y3=sc.nextInt();
		   int y4=sc.nextInt();

		 double length2=Math.sqrt((Math.pow(x4-x3,2))+Math.pow(y4-y3,2));
		   System.out.println("length="+length2);
		  if(length>length2){
		    System.out.println("line 1 is greater");
		}
		  else if (length==length2){
		   System.out.println("line1 and line2 is equal");
		}
		 else{
		System.out.println("line 2 is greater");
		}

		}
}
