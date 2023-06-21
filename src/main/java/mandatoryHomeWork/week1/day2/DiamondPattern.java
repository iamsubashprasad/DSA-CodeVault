package SDET;

public class DiamondPattern {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows= 5;
		int currentRow = 1;
        while(currentRow <= rows){
            int prefixSpace = rows-currentRow;
            while(prefixSpace-- > 0)
                System.out.print(" ");

            int stars=(currentRow*2)-1;
            while (stars-- > 0)
                System.out.print("*");
            currentRow++;
            System.out.println();
        }
        
        currentRow = 5;
        while(currentRow > 0){
            int prefixSpace = rows-currentRow;
            while(prefixSpace-- > 0)
                System.out.print(" ");

            int stars=(currentRow*2)-1;
            while (stars-- > 0)
                System.out.print("*");
            currentRow--;	
            System.out.println();
       
        }

      
	}
}

