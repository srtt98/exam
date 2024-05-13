//1
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter  the sequence of numbers");
		String numSequence = input.next();
		
		System.out.println("enter  the number to be searched");
		int numToSearch = input.nextInt();
		
		countNum(null, numToSearch);
		
}
		
	public static  int countNum(int [] arrays,int numToSearch ) {
		int count = 0;
		
		for( int element : arrays) {
			if(element == numToSearch) {
				count++;
				
			}
		}
		return count;

	
	
	
	}

}
