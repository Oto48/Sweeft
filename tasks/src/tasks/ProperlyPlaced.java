package tasks;

public class ProperlyPlaced {
	
	public static boolean isProperly(String text)
    {
	    int count = 0;  
	    boolean answer = false;  
	    for(int i = 0; i < text.length(); i++) {
	    	
	    	char first = '(';
	    	char second = ')';
	    	
	    	if(text.charAt(i) == first) {
	    		count+=1;
	    	} else if (text.charAt(i) == second) {
	    		count-= 1;
	    	}
	    	if (count < 0) {
	    		return answer;
	    	}
	    	
	    }
    	if (count == 0) {
    		return true;
    	}
	    return answer;
    }
	
	

	public static void main(String[] args) {
		boolean answer = isProperly("(()())");
		System.out.println(answer);

	}
}
