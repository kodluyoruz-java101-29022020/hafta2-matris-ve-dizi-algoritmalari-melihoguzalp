package algorithm2;

public class alg1 {

	
	public static void main(String[] args)
	{
		
		int[][] matrix = {   
			
                { 1, 0, 1 },	
                { 1, 1, 0 },
                { 1, 0, 1 }
            }; 
		
		int[][] newmatrix = new int[matrix.length][matrix[0].length];
		int alivecount = 0;
		
		for(int i = 0 ; i < matrix.length  ; i++) {
			
			for(int j = 0 ; j < matrix[0].length  ; j++) {
				
				
				if(i > 0 && j > 0) {
					
					if(i == matrix.length -1 && j == matrix[0].length-1) {
						
						alivecount = matrix[i][j-1] + matrix[i-1][j];
					}
				
					else if(i < matrix.length -1 && j == matrix[0].length -1) {
						
						alivecount = matrix[i][j-1] + matrix[i-1][j];
						
					}
					
					else if(i == matrix.length -1  && j < matrix[0].length -1)
					{
						alivecount = matrix[i][j-1] + matrix[i][j+1] + matrix[i-1][j];
					}
					else
						alivecount = matrix[i][j+1] + matrix[i][j-1] + matrix[i+1][j] + matrix[i-1][j];
			
		}
				
				
				
				else if(i == 0 && j < matrix[0].length) {
					
					if(j == matrix.length -1) {
						alivecount = matrix[i][j-1] + matrix[i+1][j];

					}
					else if(j==0){
						alivecount = matrix[i][j+1] + matrix[i+1][j]; 
					}
					else
						alivecount = matrix[i][j-1] + matrix[i][j+1] + matrix[i+1][j];
				}
				
				else
					if(i > 0 && j == 0) {
						
						if(i==matrix.length-1) {
							alivecount = matrix[i-1][j] + matrix[i][j+1];
						}
						else
							alivecount = matrix[i-1][j] + matrix[i][j+1];
					}
				
				
				if(matrix[i][j] == 1) {
					
					if(alivecount < 2 )
						newmatrix[i][j] = 0;
					
					else if(alivecount == 2 || alivecount == 3) 
						newmatrix[i][j] = 1;
						
					else if(alivecount > 3)
						newmatrix[i][j] = 0;

					
					
				}
				else
					newmatrix[i][j]  = 1;
				
				
				
		}
			
	}
		
		printInputMatrix(matrix);
		printOutputMatrix(newmatrix);
		 
		
		
	}
	
	public static void printInputMatrix(int[][] array1) {
		
		
		System.out.println("Input Matrix");
		
		for(int i = 0; i < array1.length ; i++ ) {
			
			for(int j = 0; j < array1[0].length ; j++ ) {
				
				System.out.print(array1[i][j]);
				
			}
			System.out.println("  ");
		}
		
		System.out.println();
		
	}
	
	
public static void printOutputMatrix(int[][] array2) {
		
		
		System.out.println("Output Matrix");
		
		for(int i = 0; i < array2.length ; i++ ) {
			
			for(int j = 0; j < array2[0].length ; j++ ) {
				
				System.out.print(array2[i][j]);
				
			}
			System.out.println(" ");
		}
		
		 
		
	}
	

	
	}
 