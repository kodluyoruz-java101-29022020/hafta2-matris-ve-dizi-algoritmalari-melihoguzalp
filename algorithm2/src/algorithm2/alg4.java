package algorithm2;

public class alg4 {
	
	public static void main(String[] args)
	{
		int[] array = { 1, 2, 4, 1, 3, 0, 9, 6, 8, 7, 3, 9, 5, 4, 6 };
		

		for(int i = 0 ; i < array.length ; i ++) {
			
			for(int j = i+1 ; j < array.length ; j++) {
				
				if(array[i] == array[j]) {
					
					System.out.print(array[i] + "  ");
				}
						
			}
				
		}
					
	}
	
}
