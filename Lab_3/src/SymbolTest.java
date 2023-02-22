import java.util.Scanner;

//Lab-3.Task_1 || Klem Stepan 244(Б) 
public class SymbolTest {
	 public static void main(String[] args) {
		 System.out.println("Input the number of symbol that will be generated: ");
		 
		 Scanner sc = new Scanner(System.in);
		 
		 String next = sc.next();
		 
		 sc.close();
		 
		 for ( int i = 0; i < Integer.parseInt(next); i++ ) {
			 char c = (char)(Math.random()*26 + 'a');
			 System.out.print(c + ": ");
			 switch ( c ) {
				 case 'a': case 'e': case 'i':
				 case 'o': case 'u':
				 System.out.println("vowels");
				 break;
				 case 'y': case 'w':
				 System.out.println("sometimes a vowel");
				 break;
				 default:
				 System.out.println("consonant");
			 }
		 }
	 }
}
