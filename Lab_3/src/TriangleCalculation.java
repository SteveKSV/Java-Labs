import java.util.Scanner;
//Lab-3.Task_2 || Klem Stepan 244(Б) 
public class TriangleCalculation {
	public static void main(String[] args) {
		System.out.print("Input legs of the triangle: ");
		Scanner sc = new Scanner(System.in);
		
		int leg_1 = sc.nextInt();
		int leg_2 = sc.nextInt();
		sc.close();
		
		double hypot = Math.hypot(leg_1, leg_2);
		double asin = Math.asin(leg_1/hypot);
		double degree = Math.toDegrees(asin);
		
		System.out.println("Hypotenuse = " + hypot);
		System.out.println("Asin in radian = " + asin);
		System.out.println("Asin in degrees = " + degree);
	}

}
