package algorithm2;

public class alg3 {
	public static void main(String[] args)
	{
		
		int[][] array1 = {
				{1,1},
				{2,2},
				{3,3}	
};

		int[][] array2 = {
		{1,1,1},
		{2,2,2}
		
};
	
		multiplicationOfTwoArrays(array1,array2);
		
		
		
		
	}
	
	public static void multiplicationOfTwoArrays(int[][] array3,int[][] array4) {
		int multiplicationArray[][]=new int[3][3];
		
		for(int i=0;i<array3.length;i++){    
			for(int j=0;j<array4[0].length;j++){    
				multiplicationArray[i][j]=0;      
			for(int k=0;k<array3[0].length;k++)      
			{      
				multiplicationArray[i][j]+=array3[i][k]*array4[k][j];      
			}  
			System.out.print(multiplicationArray[i][j]+" ");    
			} 
			
			System.out.println();    

			
		}
		
	}
	
}
