import java.util.Arrays;
public class notAlone {	
	public static void main(String[] args) {
		
//		1. ვთქვათ, რომ ელემენტი “მარტოა” მაშინ, თუ ამ ელემენტის წინა და
//		მომდევნო ელემენტები განსხვავებულია მისგან. დააბრუნეთ ისეთი მასივი,
//		სადაც ყოველი გადმოცემული რიცხვი (რომელიც მარტოა) ჩანაცვლდება მისი
//		მეზობელი რიცხვებიდან მაქსიმალურით. მაგალითად: notAlone([1, 2, 3]) -> [1, 3,
//		3];
//		notAlone([1, 2, 3, 2, 5, 2]) -> [1, 3, 3, 5, 5, 2];
//		notAlone([3, 4]) -> [3, 4];
		
		
		int[] originalArray = {4, 6, 3, 8, 5, 8, 9, 2, 10};
		int[] newArray = new int[originalArray.length];
		for(int i = 0; i < originalArray.length; i++) {	
	   	/* (1) ქვემოთ მოცემული კონდიციები უზრუნველჰყოფს, რომ მასივის პირველი და ბოლო ელემენტები არ შედარდეს 
	    	*     არც წინა და არც მომდევნო ელემენტებს, რადგან პირველ ელემენტს წინა ელემენტი არ გააჩნია. 
	    	*     ხოლო ბოლო ელემენტს არ გააჩნია მომდევნო ელემენტი. 
	    	* (2) ასევე, ეს კონდიცია უზრუნველჰყოფს, რომ ელემენტი 'მარტოა', ანუ არც წინა ელემენტის ტოლია 
	    	*     და არც მომდევნოსი;
	    	* (3) ასევე უზრუნველჰყოფს, რომ ელემენტის წინა და მომდევნო ელემენტები ერთმანეთის ტოლი არაა.				
	    	*/	
			if(     i == 0 
				|| i == originalArray.length - 1
				|| originalArray[i] == originalArray[i - 1] 
				|| originalArray[i] == originalArray[i + 1] 
				|| originalArray[i - 1] == originalArray[i + 1]) newArray[i] = originalArray[i];	
			else if(originalArray[i - 1] > originalArray[i + 1]) newArray[i] = originalArray[i - 1]; 
			else if(originalArray[i - 1] < originalArray[i + 1]) newArray[i] = originalArray[i + 1];
		}
		System.out.println("Original array: " + Arrays.toString(originalArray));
		System.out.println("New array:      " + Arrays.toString(newArray));
		
		/* Update:
		 * დაემატა ახალი მასივი int[] newArray, რომელშიც int[] originalArray-დან წამოღებული 
		 * ელემენტები ინახება ამოცანის პირობის მიხედვით. 
		 */ 
			  
    }
}
		 