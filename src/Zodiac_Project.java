import java.util.Scanner;
public class Zodiac_Project {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the year you were born: ");
		int year = input.nextInt();
	
		switch (year % 12){
		case  0: System.out.println("monkey.");  break;
		case  1: System.out.println("rooster."); break;
		case  2: System.out.println("dog.");     break;
		case  3: System.out.println("pig.");     break;
		case  4: System.out.println("rat.");     break;
		case  5: System.out.println("ox.");      break;
		case  6: System.out.println(""); 		 break;
		case  7: System.out.println("");		 break;
		case  8: System.out.println(""); 		 break;
		case  9: System.out.println(""); 		 break;
		case 10: System.out.println(""); 		 break;
		case 11: System.out.println(""); 		 break;
		case 12: System.out.println(""); 		 break;
		}
	}
	
	
	

}
