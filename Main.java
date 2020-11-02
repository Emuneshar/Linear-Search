import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println();
    System.out.println();
    System.out.println("Welcome to Linear Search!");
    System.out.println();
    System.out.println("For Linear Search to work, you will need to input:  ");
    System.out.println("1. The size of your array.");
    System.out.println("2. The elements you want to search through.");
    System.out.println("3. The query you want to search for.");
    System.out.println("Please note that when you count elements in an array, we start counting from 0. For JDoodle please enable interactive option");
    System.out.println();
    System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
    System.out.println();
    System.out.println();
    System.out.println("1. What size will your array be? ");
    int size = scanner.nextInt();
    int ronsSecondArray [] = new int [size];
    System.out.println("2. Enter your input for your array: ");
    
    for(int i = 0; i < size; i++) {
    	ronsSecondArray[i] = scanner.nextInt();
    }
    
    System.out.println();
		
    
    System.out.println("3.Enter your search term: ");
    int query = scanner.nextInt();
    
    System.out.print("Your query is located at index: " + linearSearch(ronsSecondArray, query));
  }


  public static int linearSearch(int [] list, int x) {
		int key = x;
		for(int i = 0; i < list.length; i++) {
			if(key == list[i]) {
				return i;
      }
		}
		return 0;
	}
}