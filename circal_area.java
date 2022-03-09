
import java.util.Scanner;

public class circal_area {
	public static void main(String[] args) {
        Scanner redious=new Scanner(System.in);
        System.out.println("enter redious of circle=");
		double r= redious.nextDouble();
		areaofcircle c= new areaofcircle();
		c.areaofcircle(r);
		}
}