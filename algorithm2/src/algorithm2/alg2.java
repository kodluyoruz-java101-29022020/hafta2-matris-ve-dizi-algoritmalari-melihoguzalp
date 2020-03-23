package algorithm2;

public class alg2 {

	public static void main(String[] args)
	{
		
		int [ ] [ ] array = {   
				{ 1, 2, 3, 4, 5 },
                { 16, 17, 18, 19, 6 },	
                { 15, 24, 25, 20, 7 },
                { 14, 23, 22, 21, 8 },
                { 13, 12, 11, 10, 9 }
            };
		
		
		
	
		  int x=0;
		  int row=array.length-1;
		   
		  int y=0;
		  int column = array[0].length-1;
		   
		  while(x <= row && y <= column){
		   
		   for (int i = x; i <= column; i++) {
		    System.out.print(array[x][i] + " ");
		   }
		 
		   for (int i = x+1; i <= row; i++) {
		    System.out.print(array[i][column] + " ");
		   }
		    
		   if(x+1 <= row){
		    for (int i = column-1; i >= y; i--) {
		     System.out.print(array[row][i] + " ");
		    }
		   }
		   if(y+1 <= column){
		    for (int i = row-1; i > x; i--) {
		     System.out.print(array[i][y] + " ");
		    }
		   }
		    
		   x++;
		   row--;
		   y++;
		   column--;
		  }
		
		
		
		
	}
	
	
}
