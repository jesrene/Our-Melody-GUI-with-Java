import java.util.Scanner;

public class PrintArray {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		int[] list = new int[10];
		
		for(int i = 0; i< list.length; i++) {
			System.out.println("Please enter the value of element");
			list[i] = keyboard.nextInt();
		}
		
		for(int i = 0; i<list.length; i++) {
			System.out.println("The value of list["+i+"] is " + list[i]);
		}
		keyboard.close();
	}

}
