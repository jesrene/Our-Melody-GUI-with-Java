import java.util.Scanner;

public class ArrayCount {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] z = new int[10];
		int pos = 0;
		int neg = 0;
		int odd = 0;
		int even = 0;
		int zero = 0;
		
		for(int i=0; i<z.length; i++) {
			System.out.println("Print value of z:");
			z[i] = keyboard.nextInt();
		}
		
		for(int i=0; i<z.length; i++) {
			if(z[i]> 0) {
				pos++;
			}
			else if(z[i]<0) {
				neg++;
			}
			else {
				zero++;
			}
			
			if(z[i]%2 == 0) {
				even++;
			}
			else {
				odd++;
			}
		}
		
		System.out.println("Positive:"+pos+"\nNegative:"+neg+"\nZero:" +zero+ "\nOdd:"+odd+"\nEven:"+even);
		
		keyboard.close();
		
	}

}
