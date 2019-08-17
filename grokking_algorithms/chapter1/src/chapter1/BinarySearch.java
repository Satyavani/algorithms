package chapter1;

public class BinarySearch {
	
	public static int binarySearch(int n[], int expected) {
		 int low = 0;
		 int high = n.length - 1;
		 
		 
		 // my first version of understanding
		 // the problem with this is that I dont come out of loop  if element is not found.
		 /* int mid = (low + high) / 2;
		  	while (n[mid] != expected) {
			 
			 // too low
			 if(n[mid] < expected) {
				 low = mid;
			 } else if(n[mid] > expected){ //too high
				 high = mid;
			 }
			 
			 mid = (low + high) / 2;
		 }*/
		 
		 while (low <= high) {
			 int mid = (low + high) / 2;
			 
			 System.out.println(low);
			 System.out.println(high);
			 System.out.println(mid);
			 System.out.println("---------");
			 int actual = n[mid];
			 
			 if( actual == expected) {
				 return mid;
			 }
			 if(actual < expected) {
				 low = mid + 1; // too low, add plusOne as mid is already compared
			 } else if(actual > expected) {
				 high = mid - 1; // too high
			 }
		 }
		 System.out.println(" No element Found : " +expected);
		 return -1;
	}
	
	public static void main(String args[]) {
		int n[] = {56, 61, 80, 81, 82, 84, 86};
		
		System.out.println( "Found at "+binarySearch(n, 80));
		
		System.out.println( "Found at "+binarySearch(n, 86));
		
		System.out.println( " not Found "+binarySearch(n, 90));
		
	}
}
