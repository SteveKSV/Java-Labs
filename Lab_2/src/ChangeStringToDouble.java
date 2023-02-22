import java.util.Scanner;

//Lab-2.Task_2 || Klem Stepan 244(Б) 
public class ChangeStringToDouble {
	public static void main(String[] args)
	{
		double sin, cos;
		System.out.print("Input an argument for sin and cos: ");
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		sin = Math.sin(Math.toRadians(Double.parseDouble(input)));
		cos = Math.cos(Math.toRadians(Double.parseDouble(input)));
		sc.close();
		System.out.println("Sin = " + sin);
		System.out.println("Cos = " + cos);
		
	}
}
