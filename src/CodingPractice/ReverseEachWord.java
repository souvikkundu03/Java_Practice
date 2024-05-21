package CodingPractice;

public class ReverseEachWord {
	public static String reverseString(String str) {
		
		char[] stringArray = str.toCharArray();
		int left, right = str.length()-1;
		
		for(left = 0;left<right;left++, right--) {
			char temp = stringArray[left];
			stringArray[left] = stringArray[right];
			stringArray[right] = temp;
		}
		
		return String.valueOf(stringArray);
		
	}
	public static void main(String[] args) {
        String inputString = "India is my country"; 
        String outputString = "";
        
        for (String i : inputString.split(" ")) {
        	outputString += reverseString(i) + " ";
        }
        
    	System.out.println(outputString.trim());	
	}
}
