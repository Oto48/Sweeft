package tasks;

public class CountSteps {
	
	public static int countVariants(int step)
	{
		
		if (step == 0)
			return 1;
		else if (step < 0)
			return 0;
		else
			return countVariants(step - 2) + countVariants(step - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(countVariants(4));
	}
	
}
