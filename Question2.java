
public class Question2 {
	public static void main(String[] args) {
		
		int arr[] = {5, 4, 6, 5 };
		int sum = 0;
		// Code below gives the sum of all elements in an array
		for (int i = 0; i < arr.length; i++) {
			 sum = sum + arr[i];
		} System.out.println(sum); 
		
		// Code below gives the sum of last two elements in an array
		for (int i = 0; i < arr.length - 1; i++) {
			sum = arr[i] + arr[i + 1];
		} System.out.println(sum);
		
		//რატომ აკუმულირდება პირველ sum-ში მასივის ელემენტების მატების შედეგი როდესაც მეორე sum-ში იგივე არ ხდება?
		
	}
}
