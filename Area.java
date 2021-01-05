import java.util.Scanner;

public class Area {

	public double returnArea(int length, int breadth) {

		return length * breadth;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value");
		int length = sc.nextInt();
		System.out.println("Enter value");
		int breadth = sc.nextInt();

		Area rect =new Area();
		
		double ans =rect.returnArea(length, breadth);
		
		System.out.println("Area =  "+ans);
	}

}
